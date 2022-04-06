public class TV {
    private int serialNumber;
    private String model;

    private Channel channel;
    private RemoteController remoteController;

    private int currentChannel;

    private int[] channels;
    private int maxChannels;

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

    public void setRemoteController(RemoteController remoteController) {
        if (this.remoteController == null) {
            this.remoteController = remoteController;
        } else {
            System.out.println("This remote controller was connected to other TV");
        }
    }

    public TV(int serialNumber, String model) {
        this.serialNumber = serialNumber;
        this.model = model;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }
}
