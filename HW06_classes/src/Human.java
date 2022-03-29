public class Human {
    String name;
    private int age;

    Human(String Name, int Age) {
        name = Name;
        setAge(Age);
    }

    int getAge() {
        return age;
    }

    void setAge(int Age) {
        if (Age <= 0) {
            age = 0;
        } else {
            age = Age;
        }
    }
}
