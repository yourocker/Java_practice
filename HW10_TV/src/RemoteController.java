public class RemoteController {
    private String model;

    private Channel channel;
    private TV tv;

    public void setTV(TV tv) {
        if (this.tv == null) {
            this.tv = tv;
            this.tv.setRemoteController(this);
        } else {
            System.err.println("This TV was connected to other remote controller");
        }
    }

    public RemoteController(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }
}
