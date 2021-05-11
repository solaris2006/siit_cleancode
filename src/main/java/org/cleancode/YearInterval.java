package org.cleancode;

public class YearInterval {
    private final int start;
    private final int end;

    public YearInterval(int start, int end) {
        if(start > end){
            throw new IllegalArgumentException("start > end");
        }
        this.start = start;
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }
}
