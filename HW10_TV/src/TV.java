public class TV {
    private RemoteController currentChannel;

    private String model;
    private Channel channel;
    private RemoteController remoteController;

    public void getChannel(RemoteController channel) {
        currentChannel = channel;
    }

    public TV(String model) {
        this.model = model;
    }
}
