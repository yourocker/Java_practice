public class Arena {
    public void start(Human[] humans) {
        for (int i = 0; i < humans.length; i++) {
            humans[i].run();
        }
    }
}
