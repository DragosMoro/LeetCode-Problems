import java.util.List;

public class Solution {
    /**
     * @param intervals: an array of meeting time intervals
     * @return: if a person could attend all meetings
     */
    public static class Interval {
    int start, end;
    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size()<=1)
        {
            return true;
        }
        intervals.sort((a,b) -> Integer.compare(a.start, b.start));
        for (int i = 1; i < intervals.size(); i++) {
            if (intervals.get(i).start < intervals.get(i - 1).end) {

                return false;
            }
        }
        return true;
    }
}