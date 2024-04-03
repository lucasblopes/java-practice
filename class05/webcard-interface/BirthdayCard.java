
public class BirthdayCard implements WebCard {

    private String recipient;

    public BirthdayCard(String recipient) {
        this.setRecipient(recipient);
    }

    public String getRecipient() {
        return this.recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
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
