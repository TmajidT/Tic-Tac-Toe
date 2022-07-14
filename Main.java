import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------");
        System.out.println("welcome to the TIC TAC TOE game on java!!");
        System.out.println("this game requires two players (or you can play with yourself =))) )");
        guide();

        Scanner input = new Scanner(System.in);
        int is_ready;
        do {
            System.out.print("if you are ready to play enter 1  :    ");
            is_ready = input.nextInt();
        }while (is_ready != 1);

        Play_time.main();

        }



    //a guide on how to play the game
    public static void guide(){
        char[][] board = {{'7','|','8','|','9'},
                {'-','+','-','+','-'},
                {'4','|','5','|','6'},
                {'-','+','-','+','-'},
                {'1','|','2','|','3'}
        };
        System.out.println("look at this game board");
        Print.print_board(board);
        System.out.println("you will need this to remember each section!!");
    }
}