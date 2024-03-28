
public class Main {

    public static void main(String args[]) {

        int standardValue = 50;
        int vipValue = 20;
        int cabinValue = 30;

        TicketNormal ticketNormal = new TicketNormal(standardValue);
        TicketVip ticketVip = new TicketVip(standardValue, vipValue);
        TicketCabin ticketCabin = new TicketCabin(standardValue, vipValue, cabinValue);

        ticketNormal.printValue();
        ticketVip.printValue();
        ticketCabin.printValue();

    }
}
