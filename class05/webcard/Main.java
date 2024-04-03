
public class Main {

    public static void main(String[] args) {

        LoveCard card1 = new LoveCard("Maria");
        System.out.println(card1.returnMsg("João"));

        ChristmasCard card2 = new ChristmasCard("Pedro");
        System.out.println(card2.returnMsg("Ana"));

        BirthdayCard card3 = new BirthdayCard("Carlos");
        System.out.println(card3.returnMsg("Juliana"));

    }
}
