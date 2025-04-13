package src.creational.abstractfactory;

import src.creational.abstractfactory.factory.AbstractFactory;
import src.creational.abstractfactory.factory.FactoryProvider;
import src.creational.abstractfactory.product.card.Card;
import src.creational.abstractfactory.product.payment.PaymentMethod;

public class Main {
    public static void main(String[] args) {
        probarAbstractFactory();
    }
    private static void probarAbstractFactory(){
        AbstractFactory abstractFactory = FactoryProvider.getFactory("Card");
        Card tarjeta = (Card) abstractFactory.create("VISA");

        AbstractFactory abstractFactory1 = FactoryProvider.getFactory("PaymentMethod");
        PaymentMethod paymentMethod = (PaymentMethod) abstractFactory1.create("DEBIT");

        System.out.println("Una tarjeta de tipo: " + tarjeta.getCardType() + " con el metodo de pago: " + paymentMethod.doPayment());
    }
}
