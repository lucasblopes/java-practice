
public class TicketCabin extends TicketVip {

    private int valuePlusCabin;

    public TicketCabin() {
        super();
    }

    public TicketCabin(int value, int valuePlusVip, int valuePlusCabin) {
        super(value, valuePlusVip);
        this.setValuePlusCabin(valuePlusCabin);
    }

    public int getValuePlusCabin() {
        return super.getValueVip() + valuePlusCabin;
    }

    public void setValuePlusCabin(int valuePlusCabin) {
        if (valuePlusCabin > 0)
            this.valuePlusCabin = valuePlusCabin;
    }

    @Override
    public void printValue() {
        System.out.println("Cabin Ticket : " + (super.getValueVip() + this.valuePlusCabin));
    }
}

