
public class Main {

    public static void main(String args[]) {

        int standardValue = 50;
        int vipValue = 15;
        int cabinValue = 30;

        TicketVip ticketVip = new TicketVip(standardValue, vipValue);
        TicketNormal ticketNormal = new TicketNormal(standardValue);
        TicketCabin ticketCabin = new TicketCabin(vipValue, cabinValue);

        ticketVip.printValue();
        ticketNormal.printValue();
        ticketCabin.printValue();

    }
}
