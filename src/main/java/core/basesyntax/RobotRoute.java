package core.basesyntax;

public class RobotRoute {
    public void moveRobot(Robot robot, int toX, int toY) { // RobotRoute class where the main logic for navigation is implemented

            // Helper method to turn the robot to face the target position
            private void turnToTargetDirection(Robot robot, int toX, int toY) {
                // Determine the direction based on target position
                if (toX > robot.getX()) {
                    while (robot.getDirection() != Direction.RIGHT) {
                        robot.turnRight();
                    }
                } else if (toX < robot.getX()) {
                    while (robot.getDirection() != Direction.LEFT) {
                        robot.turnRight();
                    }
                } else if (toY > robot.getY()) {
                    while (robot.getDirection() != Direction.UP) {
                        robot.turnRight();
                    }
                } else if (toY < robot.getY()) {
                    while (robot.getDirection() != Direction.DOWN) {
                        robot.turnRight();
                    }
                }
            }

            // Helper method to move the robot step by step towards the target
            private void moveRobotStep(Robot robot, int toX, int toY) {
                while (robot.getX() != toX || robot.getY() != toY) {
                    turnToTargetDirection(robot, toX, toY);
                    robot.stepForward();
                }
            }

            // Main method to move the robot to the target position
            public void moveRobot(Robot robot, int toX, int toY) {
                moveRobotStep(robot, toX, toY);
            }
        }

        //write your solution here
    }
}
