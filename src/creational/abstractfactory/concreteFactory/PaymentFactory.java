package src.creational.abstractfactory.concreteFactory;

import src.creational.abstractfactory.concreteProduct.Credit;
import src.creational.abstractfactory.concreteProduct.Debit;
import src.creational.abstractfactory.creator.AbstractFactory;
import src.creational.abstractfactory.product.PaymentMethod;

public class PaymentFactory implements AbstractFactory<PaymentMethod> {

    @Override
    public PaymentMethod create(String type) {
        if("CREDIT".equals(type)){
            return new Credit();
        } else if ("DEBIT".equals(type)){
            return new Debit();
        }
        return null;
    }
}
