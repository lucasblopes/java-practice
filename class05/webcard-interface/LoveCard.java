
public class LoveCard implements WebCard {

    private String recipient;

    public LoveCard(String recipient) {
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
        return "Querida " + recipient + ",\n" +
            "Feliz Dia dos Namorados!\n" +
            "Espero que esse tenha sido o único cartão do Dia dos Namorados que tenha ganhado nessa data!\n" +
            "De todo meu coração,\n" +
            sender;
    }
}
