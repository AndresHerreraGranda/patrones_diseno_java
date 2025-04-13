package src.creational.abstractfactory.factory;

import src.creational.abstractfactory.product.card.MasterCard;
import src.creational.abstractfactory.product.card.Visa;
import src.creational.abstractfactory.product.card.Card;

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
