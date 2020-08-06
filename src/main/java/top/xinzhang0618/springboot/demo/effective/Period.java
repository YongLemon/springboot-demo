package top.xinzhang0618.springboot.demo.effective;

import java.util.Date;

/**
 * Period
 *
 * @author gavin
 * @version 2020/7/27
 */
public class Period {

    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {
        if (start.compareTo(end) > 0) {
            throw new IllegalArgumentException(start + " after " + end);
        }
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
    }

    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }
}
