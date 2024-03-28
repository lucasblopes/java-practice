
public class TicketVip extends Ticket {

    protected int valuePlusVip;

    public TicketVip() {
        super();
    }

    public TicketVip(int value, int valuePlusVip) {
        super(value);
        this.setValuePlusVip(valuePlusVip);
    }

    public int getValueVip() {
        return super.getValue() + this.valuePlusVip;
    }

    public void setValuePlusVip(int valuePlusVip) {
        if (valuePlusVip > 0)
            this.valuePlusVip = valuePlusVip;
    }

    @Override
    public void printValue() {
        System.out.println("Vip Ticket : " + (super.getValue() + this.valuePlusVip));
    }
}
