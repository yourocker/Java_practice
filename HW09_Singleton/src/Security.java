public class Security {
    //статическое глобальное поле для хранения единственного экземпляра класса
    private static Security instance;

    //статический метод, возвращает единственный экземпляр класса
    public static Security getInstance() {
        return instance;
    }

    //статический инициализатор
    static {
        instance = new Security();
    }

    //конструктор приватный
    private Security() {
        this.users = new User[MAX_USERS_COUNT];
        this.usersCount = 0;
    }

    private final int MAX_USERS_COUNT = 5;
    private User[] users;

    private int usersCount;

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
