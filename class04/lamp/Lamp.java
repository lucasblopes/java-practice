
public class Lamp {

    protected boolean on; 

    public Lamp() {

    }

    public Lamp(boolean on) {
        this.setOn(on);
    }

    public boolean isOn() {
        return this.on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void print() {
        System.out.println("The lamp is currently " + (this.isOn() ? "on" : "off"));
    } 
}
