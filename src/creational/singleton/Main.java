package src.creational.singleton;

public class Main {
    public static void main(String[] args) {
        Card.getINSTANCE().setNumber("1234-1234-1234-1234");
        System.out.println(Card.getINSTANCE().getNumber());
    }
}
