public Board(){
    grid = new Car[6][6];
    
}

public void initialize() {
    // Reset the board to its initial state
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 6; j++) {
            this.grid[i][j] = null;
        }
    }
    
    // Place the red car at the starting position
    this.grid[0][0] = new Car("R", [0,0], 'H', 2, true);
    //  R R _ _ _ _
    //  _ _ G _ _ _
    //  _ _ G _ _ _
    //  B B P _ _ _
    //  _ _ P _ _ _
    //  _ _ P _ _ _
  
    
    // Add other cars to the board (example)
    this.grid[0][3] = new Car("B", [0,3], 'H', 2, false);
    this.grid[1][1] = new Car("G", [1,1], 'V', 2, false);
    this.grid[3][2] = new Car("P", [3,2], 'V', 3, false); // Vertical car B
}

public void display() {
    // Display the current state of the board
    for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 6; j++) {
            if (this.grid[i][j] != null) {
                System.out.print(this.grid[i][j].color + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }
}