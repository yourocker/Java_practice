public class Channel {
    private static final int INITIAL_SIZE = 10;

    private String channelName;
    private int numberOfChannel;

    private TV tv;
    private TVShow tvShow;

    public Channel(String channelName, int numberOfChannel, TV tv, TVShow tvShow) {
        this.channelName = channelName;
        this.numberOfChannel = numberOfChannel;
        this.tv = tv;
        this.tvShow = tvShow;
    }

    public Channel(String channelName, int numberOfChannel) {
        this.channelName = channelName;
        this.numberOfChannel = numberOfChannel;
    }

    public String getChannelName() {
        return channelName;
    }

    public int getNumberOfChannel() {
        return numberOfChannel;
    }
}
