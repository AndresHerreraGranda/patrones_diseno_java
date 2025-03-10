package src.creational.abstractfactory.creator;

import src.creational.abstractfactory.concreteFactory.CardFactory;
import src.creational.abstractfactory.concreteFactory.PaymentFactory;

public class FactoryProvider {
    public static AbstractFactory getFactory(String chooseFactory){
        if("Card".equals(chooseFactory)){
            return new CardFactory();
        } else if("PaymentMethod".equals(chooseFactory)){
            return new PaymentFactory();
        }
        return null;
    }
}
