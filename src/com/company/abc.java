package com.company;

public class abc {

    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("vikas");
        name.append("suryavanshi");
        System.out.println(name);
        name.setCharAt(5,'q');
        System.out.println(name);
    }

//    private char grid[][] = new char[3][3];
//    public TicTacToe() {
//        for(int i = 0; i<3; i++) {
//            Arrays.fill(grid[i], ' ');
//        }
//    }
//    public void printGrid(){
//        printHeader(); printMatrix();
//    }
//
//    private void printMatrix() {
//        for(int i = 0; i<3; i++) {
//            System.out.print((i+1)+" ");
//            for (int j=0; j<3 ; j++) {
//                System.out.print("|"+grid[i][j]+"  |");
//            }
//            System.out.print(System.lineSeparator()+"  ---------------" + System.lineSeparator());
//        }
//    }
//
//    private void printHeader() {
//        System.out.println("    1    2    3");
//        System.out.println("  ---------------");
//    }
//
//    public static void main(String[] args) {
//        TicTacToe game = new TicTacToe();
//        System.out.println("Welcome to Tic-Tak-Toe");
//        Scanner sc = new Scanner(System.in);
//        while(true) {
//            game.printGrid();
//            String coordinates = sc.nextLine();
//            System.out.println(game.interpret(coordinates));
//            System.out.println("You entered : "+coordinates);
//        }
//    }
//
//    private int[] interpret(String coordinates) {
//        int result[] = new int[2], i=0;
//        for (String s : coordinates.split("")) {
//             result[i++] = Integer.parseInt(s);
//        }
//        return result;
//    }

}
