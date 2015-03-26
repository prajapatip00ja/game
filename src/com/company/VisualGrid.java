package com.company;

public class VisualGrid {
    private String[][] grid = new String[3][3];

    public void createGrid(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                grid[i][j]=" - ";
            }
        }
    }


    public void markPosition(int x, int y, int playerNumber){
        grid[x][y] = (playerNumber==0) ? " 0 " : " X ";
        System.out.println(showGrids());
    }

    private String showGrids(){
        String gameView = "";
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                gameView += grid[i][j];
            }
            gameView +="\n";
        }
        return  gameView;
    }

}
