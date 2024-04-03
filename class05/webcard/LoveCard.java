
public class LoveCard extends WebCard {

    public LoveCard(String recipient) {
        super(recipient); 
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
