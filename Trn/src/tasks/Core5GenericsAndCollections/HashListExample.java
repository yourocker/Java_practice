package tasks.Core5GenericsAndCollections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashListExample {
    public static void main(String[] args) {
        HashSet<State> states = new HashSet<>();

        states.add(new State("Kazakhstan"));
        states.add(new State("Uruk Uzbeks"));
        states.add(new State("Kyrgyzstan"));

        boolean isAdded = states.add(new State("Kazakhstan"));
        System.out.println(isAdded);

        System.out.printf("States contains %d elements: \n", states.size());

        for (State state: states) {
            System.out.println("- " + state.getName());
        }

        states.remove("Uruk Uzbeks");
        System.out.printf("Now new states contains %d elements: \n", states.size());
        for (State state: states) {
            System.out.println("- " + state.getName());
        }

        HashSet<Person> people = new HashSet<>();
        people.add(new Person("Borat"));
        people.add(new Person("Nursultan"));
        people.add(new Person("Azamat"));

        System.out.println("The best peoples of Kazakhstan is: ");
        for (Person p: people) {
            System.out.println(p.getName());
        }

        Map<Person, State> locals = new HashMap<>();
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class State {
    private String name;

    public State(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
