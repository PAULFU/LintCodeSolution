import java.util.ArrayList;

/**
 * 将新的区间插入区间集合内，如果有能连起来的区间
 * 则将两个区间合并
 * Created by fupinyou on 2016/4/20.
 */
public class InsertInterval {
    public class Interval {
        int start, end;

        Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }
    public ArrayList<Interval> insert(ArrayList<Interval> intervals,Interval newInterval){
        if (newInterval == null || intervals == null) {
            return intervals;
        }

        ArrayList<Interval> results = new ArrayList<Interval>();
        int insertPos = 0;

        for (Interval interval : intervals) {
            if (interval.end < newInterval.start) {
                results.add(interval);
                insertPos++;
            } else if (interval.start > newInterval.end) {
                results.add(interval);
            } else {
                newInterval.start = Math.min(interval.start, newInterval.start);
                newInterval.end = Math.max(interval.end, newInterval.end);
            }
        }

        results.add(insertPos, newInterval);

        return results;
    }
}
