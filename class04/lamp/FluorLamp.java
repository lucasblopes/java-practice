
public class FluorLamp extends Lamp {

    private int size;

    public FluorLamp() {
        super();
    }

    public FluorLamp(boolean on, int size) {
        super(on);
        this.setSize(size);
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        if (size > 0)
            this.size = size;
    }

    @Override
    public void print() {
        System.out.println("The fluor lamp is currently " + (this.isOn() ? "on" : "off") + ". Lamp's size: " + this.size + " cm.");
    } 
}
