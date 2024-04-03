
public class ChristmasCard implements WebCard {

    private String recipient;

    public ChristmasCard(String recipient) {
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
            "Feliz Natal e um próspero Ano Novo!\n" +
            "Que este seja um momento de paz e alegria para você e sua família.\n" +
            "Com carinho,\n" +
            sender;
    }
}
