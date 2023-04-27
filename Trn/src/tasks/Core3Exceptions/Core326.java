package tasks.Core3Exceptions;

public class Core326 {
    //Подключение к роботу представляется в программе интерфейсом RobotConnection:
    public interface RobotConnection extends AutoCloseable {
        void moveRobotTo(int x, int y);
        @Override
        void close();
    }

    //За установку соединения отвечает RobotConnectionManager:
    public interface RobotConnectionManager {
        RobotConnection getConnection();
    }

    public class RobotConnectionException extends RuntimeException {

        public RobotConnectionException(String message) {
            super(message);

        }

        public RobotConnectionException(String message, Throwable cause) {
            super(message, cause);
        }
    }

public void moveRobot(RobotConnectionManager robotConnectionManager, int toX, int toY) {
    RobotConnection robotConnection = null;
    for (int i = 0; i < 3; i++) {
        try {
            robotConnection = robotConnectionManager.getConnection();
            robotConnection.moveRobotTo(toX, toY);
            break;
        } catch (RobotConnectionException robotConnectionException) {
            if (i == 2) {
                throw new RobotConnectionException("3", robotConnectionException);
            }
        } finally {
            if (robotConnection != null) {
                try {
                    robotConnection.close();
                } catch (RobotConnectionException robotConnectionException) {
                }
            }
        }
    }
}

    public static class Robot implements RobotConnection {
        int x;
        int y;

        public Robot(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public void moveRobotTo(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public void close() {

        }
    }


    public static void main(String[] args) {
        Robot dolboyob = new Robot(0,0);

    }
}
