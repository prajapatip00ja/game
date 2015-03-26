package com.company;
import java.util.Scanner;

public class TicTacToe {
    private Grid Gamegrid;

    public TicTacToe() {
        this.Gamegrid = new Grid();
        Gamegrid.createGrid();
    }

    public void run() {
        VisualGrid board = new VisualGrid();
        board.createGrid();
        Grid playerGrid = new Grid();
        playerGrid.addLine(new Line());
        playerGrid.addLine(new Line());
        for (int i=0; i<9; i++) {
            playerGrid.addPoint(getPoint(i,board), i%2);
            if(playerGrid.isSizeGraterThanThree(i%2)) {
                int winner = Gamegrid.giveWinner(playerGrid);
                if(winner!=0){
                    System.out.println("player"+winner+" won");
                    System.exit(0);
                }
            }
        }
        System.out.println("match tied");
    }

    private static Point getPoint(int i,VisualGrid board ) {
        System.out.println("player"+(i%2+1));
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("");
        board.markPosition(Integer.parseInt(input[0])-1,Integer.parseInt(input[1])-111,i%2);
        return new Point(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
    }
}
