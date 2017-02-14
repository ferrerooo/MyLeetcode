/**
 * Definition for an interval.
 * public class Interval {
 *     public int start;
 *     public int end;
 *     public Interval() { start = 0; end = 0; }
 *     public Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public IList<Interval> Merge(IList<Interval> intervals) {
        var res = new List<Interval>();
        if (intervals.Count == 0) return res;
        intervals = intervals.OrderBy(x=>x.start).ToList();
        Interval current = intervals[0];
        for (int i=1;i<intervals.Count;i++) {
            if (current.end < intervals[i].start) {
                res.Add(current);
                current = intervals[i];
            } else {
                current.end = Math.Max(current.end, intervals[i].end);
            }
        }
        res.Add(current);
        return res;
    }
}