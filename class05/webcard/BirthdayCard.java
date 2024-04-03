
public class BirthdayCard extends WebCard {

    public BirthdayCard(String recipient) {
        super(recipient);
    }
    @Override
    public String returnMsg(String sender) {
        return "Querido(a) " + recipient + ",\n" +
            "Feliz Aniversário!\n" +
            "Que este dia seja repleto de felicidade e realizações.\n" +
            "Um grande abraço,\n" +
            sender;
    }
}
