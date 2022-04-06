public class Channel {
    private int num;
    private String name;
    private TVShow tvShow;

    public Channel(int num, String name) {
        this.num = num;
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public TVShow getTvShow() {
        return tvShow;
    }
}