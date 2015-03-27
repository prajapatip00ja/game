package com.company;


public class Player {
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

    public Line getLine() {
        return line;
    }
}
