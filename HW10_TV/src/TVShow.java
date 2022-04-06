public class TVShow {
    private String nameOfShow;

    private Channel channel;

    public TVShow(String nameOfShow, Channel channel) {
        this.nameOfShow = nameOfShow;
        this.channel = channel;
    }

    public String getNameOfShow() {
        return nameOfShow;
    }

    public Channel getChannel() {
        return channel;
    }
}
