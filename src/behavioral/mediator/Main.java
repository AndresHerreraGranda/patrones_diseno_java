package src.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        probarMediator();
    }

    private static void probarMediator(){
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteColleage1 user1  = new ConcreteColleage1(mediator);
        ConcreteColleage2 user2 = new ConcreteColleage2(mediator);

        mediator.setUser1(user1);
        mediator.setUser2(user2);

        user1.send("Hola soy user1");
        user2.send("Hola user1, soy user2");
    }
}
