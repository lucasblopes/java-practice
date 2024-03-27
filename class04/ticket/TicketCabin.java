
public class TicketCabin extends TicketVip {

    private int valueCabin;

    public TicketCabin() {
        super();
    }

    public TicketCabin(int valuePlus, int valueCabin) {
        this.setValuePlus(valueCabin);
    }

    public int getValue() {
        return value + valuePlus + valueCabin;
    }

    public void setValueCabin(int ValueCabin) {
        this.valueCabin = valueCabin;
    }

    @Override
    public void printValue() {
        System.out.println("Value = " + value + valuePlus + this.valueCabin);
    }
}

