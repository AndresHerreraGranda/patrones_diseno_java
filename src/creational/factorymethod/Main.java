package src.creational.factorymethod;

import src.creational.factorymethod.creator.PaymentFactory;
import src.creational.factorymethod.product.Payment;
import src.creational.factorymethod.type.TypePayment;

public class Main {
    public static void main(String[] args) {
        testFactoryMethod();
    }

    private static void testFactoryMethod(){
        Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        payment.doPayment();
    }
}
