import com.sun.org.apache.xalan.internal.res.XSLTErrorResources;

public class Driver {
    private String name;
    private int experience;
    private Bus bus;

    public Driver(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public void setBus(Bus bus) {
        if (this.bus == null) {
            this.bus = bus;
            this.bus.setDriver(this);
        } else {
            System.err.println("Водитель уже в другом автобусе");
        }
    }

    public void drive() {
        if (this.bus != null) {
            this.bus.go();
        } else {
            System.err.println("Водитель без автобуса");
        }
    }
}
