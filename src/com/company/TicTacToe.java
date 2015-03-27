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
        Player player1 =new Player();
        Player player2 =new Player();
        for (int i=0; i<9; i++) {
            int playerTurn = i%2;
            Point point = getPoint(playerTurn, board);
            Player player = (playerTurn==0)?player1:player2;
            player.addPoint(point);
            if(player1.size()>=3 || player2.size()>=3 ) {
                int winner = Gamegrid.giveWinner(player1,player2);
                if(winner!=0){
                    System.out.println("player"+winner+" won");
                    System.exit(0);
                }
            }
        }
        System.out.println("match tied");
    }

    private Point getPoint(int i,VisualGrid board ) {
        System.out.println("player"+(i%2+1));
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split("");
        board.markPosition(Integer.parseInt(input[0])-1,Integer.parseInt(input[1])-1,i%2);
        return new Point(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
    }
}
