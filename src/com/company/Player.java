package com.company;


import java.util.Iterator;

public class Player implements Iterable{
    private Line line;

    public Player() {
        line = new Line();
    }

    public void addPoint(Point point) {
        line.addPoint(point);
    }

    public int size(){
        return line.size();
    }

    public Iterator<Point> iterator() {
        return line.iterator();
    }
}
