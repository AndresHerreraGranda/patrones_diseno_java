package src.creational.abstractfactory.factory;

import src.creational.abstractfactory.product.payment.Credit;
import src.creational.abstractfactory.product.payment.Debit;
import src.creational.abstractfactory.product.payment.PaymentMethod;

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
