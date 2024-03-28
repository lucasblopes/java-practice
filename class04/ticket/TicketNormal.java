
public class TicketNormal extends Ticket {

    public TicketNormal(int value) {
        super(value);
    }

    @Override
    public void printValue() {
        System.out.println("Normal Ticket: " + value);
    }
}
