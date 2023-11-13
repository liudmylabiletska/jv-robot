package core.basesyntax;

public class Robot {
    private Direction direction;
    private int coordinateX;
    private int coordinateY;

    public Robot(Direction direction, int coordinateX, int coordinateY) {
        this.direction = direction;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return coordinateX;
    }

    public int getY() {
        return coordinateY;
    }

    public void turnLeft() {
        switch (direction) {
            case UP:
                direction = Direction.LEFT;
                break;
            case LEFT:
                direction = Direction.DOWN;
                break;
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
            default:
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case UP:
                direction = Direction.RIGHT;
                break;
            case LEFT:
                direction = Direction.UP;
                break;
            case DOWN:
                direction = Direction.LEFT;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
            default:
                break;
        }
    }

    public void stepForward() {
        switch (direction) {
            case UP:
                coordinateY++;
                break;
            case LEFT:
                coordinateX--;
                break;
            case DOWN:
                coordinateY--;
                break;
            case RIGHT:
                coordinateX++;
                break;
            default:
                break;
        }
    }
}
// Enum for directions
public enum Direction {
    UP, DOWN, LEFT, RIGHT
}

// Robot class to represent the robot's current state
public class Robot {
    private int x;
    private int y;
    private Direction direction;

    // Constructor
    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    // Getter for direction
    public Direction getDirection() {
        return this.direction;
    }

    // Getter for x-coordinate
    public int getX() {
        return this.x;
    }

    // Getter for y-coordinate
    public int getY() {
        return this.y;
    }

    // Method to turn the robot left
    public void turnLeft() {
        switch (this.direction) {
            case UP: this.direction = Direction.LEFT; break;
            case LEFT: this.direction = Direction.DOWN; break;
            case DOWN: this.direction = Direction.RIGHT; break;
            case RIGHT: this.direction = Direction.UP; break;
        }
    }

    // Method to turn the robot right
    public void turnRight() {
        switch (this.direction) {
            case UP: this.direction = Direction.RIGHT; break;
            case RIGHT: this.direction = Direction.DOWN; break;
            case DOWN: this.direction = Direction.LEFT; break;
            case LEFT: this.direction = Direction.UP; break;
        }
    }

    // Method to move the robot one step forward in its current direction
    public void stepForward() {
        switch (this.direction) {
            case UP: this.y++; break;
            case DOWN: this.y--; break;
            case LEFT: this.x--; break;
            case RIGHT: this.x++; break;
        }
    }
}

