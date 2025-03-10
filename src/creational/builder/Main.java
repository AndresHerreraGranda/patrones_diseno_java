package src.creational.builder;

public class Main {
    public static void main(String[] args) {
        probarBuilder();

    }

    public static void probarBuilder(){
        Card card1 = new Card.CardBuilder("VISA", "1111 2222 3333 4444").name("Andres H.").expire(2030).credit(true).build();
        System.out.println("Card 1 :" + card1.toString());

        Card card2 = new Card.CardBuilder("MASTERCARD", "9999 8888 7777 6666").build();
        System.out.println("Card 2: " + card2.toString());
    }


}
