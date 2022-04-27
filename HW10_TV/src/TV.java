public class TV {
    private RemoteController currentChannel;

    private String model;
    private Channel channel;
    private RemoteController remoteController;

    public boolean getChannel(RemoteController channel) {
        currentChannel = channel;
        return true;
    }

    public TV(String model) {
        this.model = model;
    }
}
