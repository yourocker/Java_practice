public class Main {
    public static void main(String[] args) {
        TV lg = new TV("LG");

        RemoteController lgRc = new RemoteController("LG_rc");

        Channel first = new Channel(1, "2x2");

        TVShow advTime = new TVShow("Adventure Time", first);

        first.getTvShow();
    }
}