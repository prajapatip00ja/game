package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Line {
   private List<Point> line;

    public Line() {
        this.line = new ArrayList<Point>();
    }

    public void addPoint(Point point) {
        line.add(point);
    }

    public Boolean containsPoint(Point point){
     return  line.contains(point);
    }

    public Boolean hasPointsOn(Line line){
        for (Point p : this.line) {
            if(!line.containsPoint(p))
                return false;
        }
        return  true;
    }


    @Override
    public String toString() {
        String line = "";
        for (Point p : this.line) {
            line = line+p.toString();
        }
        return line;
    }

    public int size(){
        return line.size();
    }
}
