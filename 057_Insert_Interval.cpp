/**
 * Definition for an interval.
 * struct Interval {
 *     int start;
 *     int end;
 *     Interval() : start(0), end(0) {}
 *     Interval(int s, int e) : start(s), end(e) {}
 * };
 */
class Solution {
public:
    vector<Interval> insert(vector<Interval>& intervals, Interval newInterval) {
        vector<Interval> result;
        for (auto i=intervals.begin();i!=intervals.end();i++) {
            if (i->end < newInterval.start)
                result.push_back(*i);
            else if (i->start > newInterval.end) {
                result.push_back(newInterval);
                newInterval = *i;
            } else {
                newInterval.start = min(newInterval.start, i->start);
                newInterval.end = max(newInterval.end, i->end);
            }
        }
        result.push_back(newInterval);
        return result;
    }
};