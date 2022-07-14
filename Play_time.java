import java.util.Scanner;

public class Play_time {
    public static void main() {

        char[][] board = {{' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '},
                {'-','+','-','+','-'},
                {' ','|',' ','|',' '}
        };


        int[] not_available = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int choice;
        char x_o;
        for (int i = 0; i < 9; i++) {
            if (i%2==0)
                x_o = 'X';
            else
                x_o = 'O';



            //check if the game is over ====> add later




            choice = get_number(not_available);

            switch (choice) {
                case 1:
                    board[4][0] = x_o;
                    not_available[1] = 1;
                    break;
                case 2:
                    board[4][2] = x_o;
                    not_available[2] = 1;
                    break;
                case 3:
                    board[4][4] = x_o;
                    not_available[3] = 1;
                    break;
                case 4:
                    board[2][0] = x_o;
                    not_available[4] = 1;
                    break;
                case 5:
                    board[2][2] = x_o;
                    not_available[5] = 1;
                    break;
                case 6:
                    board[2][4] = x_o;
                    not_available[6] = 1;
                    break;
                case 7:
                    board[0][0] = x_o;
                    not_available[7] = 1;
                    break;
                case 8:
                    board[0][2] = x_o;
                    not_available[8] = 1;
                    break;
                case 9:
                    board[0][4] = x_o;
                    not_available[9] = 1;
                    break;
            }


            Print.print_board(board);
        }

    }





    //not_available[] will show us if a section is used before this by another player
    public static int get_number(int[] not_available){
        Scanner input = new Scanner(System.in);



        boolean condition = true;
        int choice = 0;
        do {
            try {
                do {
                    System.out.print("enter the section you want to play(1-9) :   ");
                    choice = input.nextInt();
                }while ((choice<1)||(choice>9));
                condition = false;

                if (not_available[choice] != 0){
                    condition = true;
                    System.out.println("this section is played before, please enter another number!!");
                }

            } catch (Exception e) {
                System.out.println("Please enter an Integer");
                input.nextLine();
            }
        }while(condition);

        return choice;
    }
}
