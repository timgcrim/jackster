import java.util.*;
public class TikTak{
    private static int[][] board = {{0,0,0},{0,0,0},{0,0,0}};

    public static void display(){
        String[] displayVals = {"*","x","o"};
        for(int[] each:board){
            for(int every:each){
                System.out.print(displayVals[every]+"  ");
            }
            System.out.println("");
        }
    }

    public static void turn(){
        for(int i = 1;i<3;i++){
            Scanner keyboard = new Scanner(System.in);
            System.out.println("New Round.\n\n Player "+i+"'s turn.\n");
            display();
            boolean allowed = true;
            while(allowed){
                System.out.println("Select y value:");
                int yVal = keyboard.nextInt();
                System.out.println("Select x value:");
                int xVal = keyboard.nextInt();
                if(board[yVal-1][xVal-1]==0){
                    board[yVal-1][xVal-1] = i;
                    allowed = false;
                }
                else{
                    System.out.println("That space is taken. Pick again.");
                }
            }
        }
    }

    public static int checkWin{
        inRow = 0;
        for(int i = 1;i<3;i++){
            
        }
    }
    public static void main(String[] args){

    }
}