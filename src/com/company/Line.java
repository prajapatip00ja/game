package com.company;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Line implements Iterable<Point> {
    private List<Point> line;

    public Line() {
        this.line = new ArrayList<Point>();
    }

    public void addPoint(Point point) {
        line.add(point);
    }

//    public Boolean containsPoint(Point point) {
//        return line.contains(point);
//    }

    public Boolean hasPointsOn(Iterable<Point> playerLine) {
        for (Point point1 : line) {
           if(!containPoint(playerLine, point1)){
                return false;
           }
        }
        return true;
    }

    private Boolean containPoint(Iterable<Point> playerLine, Point point1) {
        for (Point p : playerLine) {
            if(p.equals(point1)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String line = "";
        for (Point p : this.line)
            line = line + p.toString();
        return line;
    }

    public int size() {
        return line.size();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line1 = (Line) o;
        return line.equals(line1.line);
    }

    @Override
    public Iterator<Point> iterator() {
        return line.iterator();
    }
}