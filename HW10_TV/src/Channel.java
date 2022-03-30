public class Channel {
    private static final int INITIAAL_SIZE = 10;

    private String channelName;
    private int numberOfChannel;

    private TV tv;
    private TVShow tvShow;

    private int[] channels;
    private int maxChannels;

    public Channel() {
        this.channels = new int[INITIAAL_SIZE];
        this.maxChannels = 0;
    }

    //add the new channel at channels list
    public void addCh(int channel) {
        if (channels.length == maxChannels) {
            int[] newChannels = new int[channels.length + 1];
            for (int i = 0; i < channels.length; i++) {
                newChannels[i] = channels[i];
            }
            this.channels = newChannels;
        }
        channels[maxChannels] = channel;
        maxChannels++;
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
