
public Game() {
    // Initialize the game board
    this.board = new Board();
    
    
    // Set the initial state of the game
    this.isGameOver = false;
}

public void start() {
    // Initialize the game state
    this.board.initialize();
    this.isGameOver = false;
}

public void displayBoard() {
    // Display the current state of the board
    this.board.display();
}
public boolean isGameOver() {
    // Check if the game is over
    return this.isGameOver;
}
