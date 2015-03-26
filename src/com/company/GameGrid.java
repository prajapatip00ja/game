package com.company;


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

    @Override
    public String toString() {
        String line = "";
        for (Line grid : grids) {
            line = line + grid.toString()+"\n";
        }
        return line;
    }

    public int whoIsWinner(Line player1, Line player2) {
        int winner = 0;
        for (Line grid : grids) {
            if (grid.hasPointsOn(player1))
                winner = 1;
            if (grid.hasPointsOn(player2))
                winner = 2;
        }
        return winner;
    }

    public void addPoint() {
        for (Line grid : grids) {
            
        }
    }
}
