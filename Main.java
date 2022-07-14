import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("welcome to the TIC TAC TOE game on java!!");
        System.out.println("this game requires two players (or you can play with yourself =))) )");
        guide();

        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.print("if you are ready to play enter 1  :    ");
            choice = input.nextInt();
        }while (choice != 1);
        System.out.println(get_number());



    }

    public static int get_number(){
        Scanner input = new Scanner(System.in);

        boolean condition = true;
        int choice = 0;
        do {
            try {
                do {
                    System.out.print("enter the section you want to play(1-9) :   ");
                    choice = input.nextInt();
                }while ((choice<0)||(choice>9));
                condition = false;
            } catch (Exception e) {
                System.out.println("Please enter an Integer");
                input.nextLine();
            }
        }while(condition);

        return choice;
    }







    //a guide on how to play the game
    public static void guide(){
        char[][] board = {{'1','|','2','|','3'},
                {'-','+','-','+','-'},
                {'4','|','5','|','6'},
                {'-','+','-','+','-'},
                {'7','|','8','|','9'}
        };
        System.out.println("look at this game board");
        Print.print_board(board);
        System.out.println("you will need this to remember each section!!");
    }
}