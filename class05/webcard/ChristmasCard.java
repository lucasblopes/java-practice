
public class ChristmasCard extends WebCard {

    public ChristmasCard(String recipient) {
        super(recipient);
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
