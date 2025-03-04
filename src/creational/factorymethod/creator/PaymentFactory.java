package src.creational.factorymethod.creator;

import src.creational.factorymethod.concrete.CardPayment;
import src.creational.factorymethod.concrete.GooglePayment;
import src.creational.factorymethod.product.Payment;
import src.creational.factorymethod.type.TypePayment;

public class PaymentFactory {
    public static Payment buildPayment(TypePayment typePayment){
        return switch (typePayment) {
            case CARD -> new CardPayment();
            case GOOGLEPAY -> new GooglePayment();
            //default -> new CardPayment();
        };
        /* --- FORMA TRADICIONA ---
        switch (typePayment){
            case CARD:
                return new CardPayment();
            case GOOGLEPAY:
                return new GooglePayment();
        }
        */
    }
}
