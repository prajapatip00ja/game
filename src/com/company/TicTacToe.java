package com.company;
import java.util.Scanner;

public class TicTacToe {
    private GameGrid grid;

    public TicTacToe() {
        this.grid = new GameGrid();
        createGrid();
    }

    public void createGrid(){
        for(int i = 1;i<4;i++){
            Line line1 = new Line();
            Line line2 = new Line();
            for(int j =1 ; j<4; j++) {
                line1.addPoint(new Point(i, j));
                line2.addPoint(new Point(j, i));
            }
            grid.addLine(line1);
            grid.addLine(line2);
        }
        addCrossLines(grid);
    }

    private void addCrossLines(GameGrid grid) {
        Line line1 = new Line(), line2 = new Line();
        for(int i = 1,j=3; i<4 ; i++,j--){
            line1.addPoint(new Point(i,i));
            line2.addPoint(new Point(j,i));
        }
        grid.addLine(line1);
        grid.addLine(line2);
    }

    public int size(){
        return grid.giveLength();
    }

    public Boolean isEven(int number){
        return number % 2 == 0;
    }
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();
        GameGrid playerGrid = new GameGrid();
        playerGrid.addLine(new Line());
        playerGrid.addLine(new Line());
        for (int i=0; i<9; i++) {
            playerGrid.addPoint(getPoint(i), i%2);
            if(playerGrid.isSizeGraterThanThree()) {
                int winner = t.grid.whoIsWinner(playerGrid);
                if(winner!=0){
                    System.out.println("player"+winner+" won");
                    System.exit(0);
                }
            }
        }
        System.out.println("match tied");
    }

    private static Point getPoint(int i ) {
        System.out.println("player"+(i%2+1));
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("");
        return new Point(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
    }

}
