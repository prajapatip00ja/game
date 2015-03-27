package com.company;
import java.util.ArrayList;
import java.util.List;

public class Grid {
    private List<Line> lines;

    public Grid() {
        lines = new ArrayList<Line>();
    }

    public void addLine(Line line){
        lines.add(line);
    }

    public void createGrid(){
        for(int i = 1;i<4;i++){
            Line line1 = new Line();
            Line line2 = new Line();
            for(int j =1 ; j<4; j++) {
                line1.addPoint(new Point(i, j));
                line2.addPoint(new Point(j, i));
            }
            this.addLine(line1);
            this.addLine(line2);
        }
        addCrossLines(this);
    }

    private void addCrossLines(Grid grid) {
        Line line1 = new Line(), line2 = new Line();
        for(int i = 1,j=3; i<4 ; i++,j--){
            line1.addPoint(new Point(i,i));
            line2.addPoint(new Point(j,i));
        }
        grid.addLine(line1);
        grid.addLine(line2);
    }



    @Override
    public String toString() {
        String line = "";
        for (Line grid : lines) {
            line = line + grid.toString()+"\n";
        }
        return line;
    }

    public int giveWinner(Player player1, Player player2) {
        for (Line line : lines) {
            if (line.hasPointsOn(player1.getLine()))
                return 1;
            if (line.hasPointsOn(player2.getLine()))
                return 2;
        }
        return 0;
    }

}
