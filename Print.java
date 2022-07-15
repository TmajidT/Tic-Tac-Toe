// to print stuff
public class Print{
    //prints board game
    public static void print_board(char[][] board){
        System.out.println();
        for (int i=0;i<5;i++){
            System.out.print("\t");
            for (int j = 0; j<5; j++){
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
        System.out.print("\n");
    }
}