// Add color feature later
public void displayBoard() {
    System.out.println("Current Board:");
    System.out.println("  1 2 3");

    for (int i = 0; i < 3; i++) {
        System.out.print((i + 1) + " ");
        for (int j = 0; j < 3; j++) {
            System.out.print(board[i][j] + " ");
        }
        System.out.println();
    }
}

public char getCurrentPlayer() {
    return currentPlayer;
}
