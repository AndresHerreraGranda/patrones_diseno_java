package src.creational.abstractfactory.concreteProduct;

import src.creational.abstractfactory.product.Card;

public class MasterCard implements Card {
    @Override
    public String getCardType() {
        return "MASTERCAR";
    }

    @Override
    public String getCardNumber() {
        return "0000 0000 0000 MASTERCARD";
    }
}
