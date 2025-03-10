package src.creational.abstractfactory.concreteFactory;

import src.creational.abstractfactory.concreteProduct.MasterCard;
import src.creational.abstractfactory.concreteProduct.Visa;
import src.creational.abstractfactory.creator.AbstractFactory;
import src.creational.abstractfactory.product.Card;

public class CardFactory implements AbstractFactory<Card> {
    @Override
    public Card create(String type) {
        if("VISA".equals(type)){
            return new Visa();
        } else if("MASTERCAR".equals(type)){
            return new MasterCard();
        }
        return null;
    }
}
