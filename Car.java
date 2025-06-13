

public Car(String color, int[] position, char orientation, int length, boolean target) {
    this.position = position // Initialize position array
    this.orientation = orientation; // Initialize orientation
    this.length = length; // Initialize length of the car   
    this.color = color; // Initialize color of the car
    this.target = target; // Initialize if it's our special car

}

public boolean init_position(int[] position) {
    this.position = position; // Set the car's position
    if(collides){
        return false;
    }
    return true;
}

public void move(string direction){
    // Check if the move is valid based on the car's orientation and position
    if(collides){
        return;
    }

    if (direction.equals("forward")) {
        if (this.orientation == 'H') {
            
            this.position[1] += 1; // Move right

        } else {
            this.position[0] += 1; // Move down
        }
    } else if (direction.equals("backward")) {
        if (this.orientation == 'H') {
            this.position[1] -= 1; // Move left
        } else {
            this.position[0] -= 1; // Move up
        }
    }
    
    

}

public boolean collides(){
    if(orientation = 'H'){
        if(position[1] + length > 6 || position[1] < 0) {
            return true; // Collision with right or left boundary
        }   
        for (int i = position[1]; i < position[1] + length; i++) {
            if (grid[position[0]][i] != null) {
                return true; // Collision with another car
            }
        }
    }
    else {
        if(position[0] + length > 6 || position[0] < 0) {
            return true; // Collision with bottom or top boundary
        }
        for (int i = position[0]; i < position[0] + length; i++) {
            if (grid[i][position[1]] != null) {
                return true; // Collision with another car
            }
        }
    }

}