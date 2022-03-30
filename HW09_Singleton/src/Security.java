public class Security {
    private final int MAX_USERS_COUNT = 5;

    private User[] users;
    private int usersCount;

    public Security() {
        this.users = new User[MAX_USERS_COUNT];
        this.usersCount = 0;
    }

    public void signUp(String email, String password) {
        if (usersCount < MAX_USERS_COUNT) {
            User newUser = new User(email, password);
            this.users[usersCount] = newUser;
            usersCount++;
        } else {
            System.err.println("Максимальное количество пользователей!");
        }
    }

    public boolean checkUser(String email, String password) {
        for (int i = 0; i < usersCount; i++) {
            if (isCorrect(email, password, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean isCorrect(String email, String password, int i) {
        return users[i].getEmail().equals(email) && users[i].getPassword().equals(password);
    }
}
