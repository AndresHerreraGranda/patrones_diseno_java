package src.creational.abstractfactory.factory;

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
