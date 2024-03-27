
public class TicketVip extends Ticket {

    protected int valuePlus;

    public TicketVip() {
        super();
    }

    public TicketVip(int value, int valuePlus) {
        super(value);
        this.setValuePlus(valuePlus);
    }

    public int getValue() {
        return value + valuePlus;
    }

    public void setValuePlus(int ValuePlus) {
        this.valuePlus = valuePlus;
    }

    @Override
    public void printValue() {
        System.out.println("Value = " + this.valuePlus + value);
    }
}
