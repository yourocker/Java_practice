import simple.Number;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private double height;
    private boolean isWorker;

    private User(UserBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.height = builder.height;
        this.isWorker = builder.isWorker;
    }

    public static class UserBuilder {

        private String firstName;
        private String lastName;
        private int age;
        private double height;
        private boolean isWorker;

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder height(double height) {
            this.height = height;
            return this;
        }

        public UserBuilder isWorker(boolean isWorker) {
            this.isWorker = isWorker;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }
}


