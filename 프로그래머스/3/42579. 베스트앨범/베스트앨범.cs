using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

 public class Solution
 {
     public int[] solution(string[] genres, int[] plays)
     {
         int[] answer = new int[] { };

         Dictionary<string, List<Tuple<int, int>>> records = new Dictionary<string, List<Tuple<int, int>>>();
         
         // 장르 분류 및 각 장르의 수록곡 카운트 정리
         for (int i = 0; i < genres.Length; i++) {
             if (!records.ContainsKey(genres[i]))
             {
                List<Tuple<int, int>> list = new List<Tuple<int, int>>();
                list.Add(new Tuple<int, int>(i, plays[i]));
                records[genres[i]] = list;
             }
             else
             {
                 records[genres[i]].Add(new Tuple<int, int>(i, plays[i]));
             }
         }
         
        

         List<Tuple<string, int>> totals = new List<Tuple<string, int>>();
         foreach (var key in records.Keys) {
             int count = 0;
             foreach(var record in records[key])
             {
                 count += record.Item2;
             }
             totals.Add(new Tuple<string, int>(key, count));
         }

         totals = totals.OrderByDescending(x => x.Item2).ToList();
         
         List<int> result = new List<int>();

         for(int i = 0; i < totals.Count; i++)
         {
             string target = totals[i].Item1;

             var sortedRecords = records[target].OrderByDescending(x => x.Item2).ThenBy(x => x.Item1).ToList();

             result.Add(sortedRecords[0].Item1);
             
             if(sortedRecords.Count > 1)
             {
                 result.Add(sortedRecords[1].Item1);
             }
         }



         answer = result.ToArray();

         return answer;
     }
 }
