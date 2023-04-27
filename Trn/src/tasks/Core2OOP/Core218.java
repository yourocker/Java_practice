package tasks.Core2OOP;

public class Core218 {
    public enum Direction {
        UP, DOWN, LEFT, RIGHT
    }

    public static class Robot {
        int x;
        int y;
        Direction direction;

        public Robot(int x, int y, Direction direction) {
            this.x = x;
            this.y = y;
            this.direction = direction;
        }

        public Direction getDirection() {
            return direction;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public void turnLeft() {
            if (direction == Direction.UP) {
                direction = Direction.LEFT;
            } else if (direction == Direction.DOWN) {
                direction = Direction.RIGHT;
            } else if (direction == Direction.LEFT) {
                direction = Direction.DOWN;
            } else if (direction == Direction.RIGHT) {
                direction = Direction.UP;
            }
        }

        public void turnRight() {
            if (direction == Direction.UP) {
                direction = Direction.RIGHT;
            } else if (direction == Direction.DOWN) {
                direction = Direction.LEFT;
            } else if (direction == Direction.LEFT) {
                direction = Direction.UP;
            } else if (direction == Direction.RIGHT) {
                direction = Direction.DOWN;
            }
        }

        public void stepForward() {
            if (direction == Direction.UP) {
                y++;
            } else if (direction == Direction.DOWN) {
                y--;
            } else if (direction == Direction.LEFT) {
                x--;
            } else if (direction == Direction.RIGHT) {
                x++;
            }
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        while (robot.getX() != toX || robot.getY() != toY) {
            if (robot.getX() > toX) {
                while (robot.getDirection() != Direction.LEFT) {
                    robot.turnLeft();
                }
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            } else if (robot.getX() < toX) {
                while (robot.getDirection() != Direction.RIGHT) {
                    robot.turnRight();
                }
                while (robot.getX() != toX) {
                    robot.stepForward();
                }
            } else if (robot.getY() > toY) {
                while (robot.getDirection() != Direction.DOWN) {
                    robot.turnLeft();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            } else if (robot.getY() < toY) {
                while (robot.getDirection() != Direction.UP) {
                    robot.turnRight();
                }
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }
        System.out.println("Координаты робота - "+ "(" + robot.getX() + ", " + robot.getY() + ")" + " направление робота - " + robot.getDirection());
    }

    public static void main(String[] args) {
        Robot dolboyob = new Robot(0, 0, Direction.DOWN);
        moveRobot(dolboyob, 10, 12);
        moveRobot(dolboyob, 3, -3);
        moveRobot(dolboyob, -11, 66);
    }
}
