package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Board(Character[][] matrix) {
        matrix = new Character[][]{{'X', 'O', 'X'}, {'O', 'X', 'O'}, {'X', 'O', 'X'}};
    }

    public Boolean isInFavorOfX() {
        boolean isWinner = false;
        Character[][] matrix = new Character[][]{{'X', 'O', 'X'}, {'O', 'X', 'O'}, {'X', 'O', 'X'}};

        if ((matrix[0][0].toString() + matrix[0][1].toString() + matrix[0][2].toString()).equals("XXX")) {
            isWinner = true;
        } else if ((matrix[1][0].toString() + matrix[1][1].toString() + matrix[1][2].toString()).equals("XXX")) {
            isWinner = true;
        } else if ((matrix[2][0].toString() + matrix[2][1].toString() + matrix[2][2].toString()).equals("XXX")) {
            isWinner = true;
        }

        if ((matrix[0][0].toString() + matrix[1][0].toString() + matrix[2][0].toString()).equals("XXX")) {
            isWinner = true;
        } else if ((matrix[0][1].toString() + matrix[1][1].toString() + matrix[2][1].toString()).equals("XXX")) {
            isWinner = true;
        } else if ((matrix[0][2].toString() + matrix[1][2].toString() + matrix[2][2].toString()).equals("XXX")) {
            isWinner = true;
        }

        if ((matrix[0][0].toString() + matrix[1][1].toString() + matrix[2][2].toString()).equals("XXX")) {
            isWinner = true;
        } else if ((matrix[2][0].toString() + matrix[1][1].toString() + matrix[0][2].toString()).equals("XXX")) {
            isWinner = true;
        }

        return isWinner;
    }

    public Boolean isInFavorOfO() {
        boolean isWinner = false;
        Character[][] matrix = new Character[][]{{'X', 'O', 'X'}, {'O', 'X', 'O'}, {'X', 'O', 'X'}};

        if ((matrix[0][0].toString() + matrix[0][1].toString() + matrix[0][2].toString()).equals("OOO")) {
            isWinner = true;
        } else if ((matrix[1][0].toString() + matrix[1][1].toString() + matrix[1][2].toString()).equals("OOO")) {
            isWinner = true;
        } else if ((matrix[2][0].toString() + matrix[2][1].toString() + matrix[2][2].toString()).equals("OOO")) {
            isWinner = true;
        }

        if ((matrix[0][0].toString() + matrix[1][0].toString() + matrix[2][0].toString()).equals("OOO")) {
            isWinner = true;
        } else if ((matrix[0][1].toString() + matrix[1][1].toString() + matrix[2][1].toString()).equals("OOO")) {
            isWinner = true;
        } else if ((matrix[0][2].toString() + matrix[1][2].toString() + matrix[2][2].toString()).equals("OOO")) {
            isWinner = true;
        }

        if ((matrix[0][0].toString() + matrix[1][1].toString() + matrix[2][2].toString()).equals("OOO")) {
            isWinner = true;
        } else if ((matrix[2][0].toString() + matrix[1][1].toString() + matrix[0][2].toString()).equals("OOO")) {
            isWinner = true;
        }

        return isWinner;
    }

    public Boolean isTie() {
        boolean tie = true;

        if (isInFavorOfX()) {
            tie = false;
        } else if (isInFavorOfO()) {
            tie = false;
        }

        return tie;
    }

    public String getWinner() {
        String winner = "";

        if (isInFavorOfX()) {
            winner = "X";
        } else if (isInFavorOfO()) {
            winner = "O";
        }

        return winner;
    }
}
