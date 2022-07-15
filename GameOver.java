public class GameOver {


    public static char main(char[][] board){

        boolean is_over = false;
        char winner = '0';

        //check if the game is over (check Rows)
        for (int i = 0;i <= 4;i+=2){
            if ((board[i][0] != '0')&&(board[i][0] != ' ')&&(board[i][0]==board[i][2])&&(board[i][0]==board[i][4])) {
                is_over = true;
                winner = board[i][0];
                break;
            }
        }

        //check if the game is over (check columns)
        if (!is_over) {
            for (int i = 0; i <= 4; i += 2) {
                if ((board[0][i] != '0') && (board[0][i] != ' ') && (board[0][i] == board[2][i]) && (board[0][i] == board[4][i])) {
                    is_over = true;
                    winner = board[0][i];
                    break;
                }
            }
        }

        if (!is_over){
            if ((board[0][0] != '0') && (board[0][0] != ' ') && (board[0][0] == board[2][2]) && (board[0][0] == board[4][4])) {
                is_over = true;
                winner = board[0][0];
            }
            else if ((board[0][4] != '0') && (board[0][4] != ' ') &&(board[0][4] == board[2][2]) && (board[0][4] == board[4][0])) {
                winner = board[0][4];
                is_over = true;
            }
        }


        //if is_over is false, game is not over
        //if ( winner == '0' ) game is not over and if (winner == 'X') player number one wins or if (winner == 'O') player number two wins
        return winner;
    }
}
