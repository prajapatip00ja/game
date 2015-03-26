package com.company;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;

public class GameGrid {
    private List<Line> grids;

    public GameGrid() {
        grids = new ArrayList<Line>();
    }

    public void addLine(Line line){
        grids.add(line);
    }

    public int giveLength(){
        return  grids.size();
    }

    public Line giveLineAt(int index){
        return grids.get(index);
    }

    @Override
    public String toString() {
        String line = "";
        for (Line grid : grids) {
            line = line + grid.toString()+"\n";
        }
        return line;
    }

    public int whoIsWinner(GameGrid players) {
        for (Line grid : grids) {
            if (grid.hasPointsOn(players.giveLineAt(0)))
                return 1;
            if (grid.hasPointsOn(players.giveLineAt(1)))
                return 2;
        }
        return 0;
    }

    public void addPoint(Point p,int i) {
        grids.get(i).addPoint(p);
    }

    public Boolean isSizeGraterThanThree(){
        return grids.get(0).size()>=3 || grids.get(1).size()>=3;
    }
}
