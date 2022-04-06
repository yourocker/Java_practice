public class RemoteController {
    private String model;
    private boolean onTv;
    private Channel channel;
    private TV tv;

    public void turnOn(TV tv) {
        if(!onTv) {
            if (tv.getChannel(this)) {
                onTv = true;
                this.tv = tv;
            }
        } else {
            System.err.println("Канал уже включен");
        }
    }

    public RemoteController(String model) {
        this.model = model;
        this.onTv = false;
    }


}