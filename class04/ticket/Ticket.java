
public class Ticket {

    protected int value;

    public Ticket() {

    }

    public Ticket(int value) {
        this.setValue(value);
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value > 0)
            this.value = value;
    }

    public void printValue() {
        System.out.println("Value = " + this.value);
    }
}
