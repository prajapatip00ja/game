package com.company;

public class VisualGrid {
    private String[][] grid = new String[3][3];

    public void createGrid(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                grid[i][j]=" - ";
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        VisualGrid visualGrid = new VisualGrid();
        visualGrid.createGrid();
    }

}
