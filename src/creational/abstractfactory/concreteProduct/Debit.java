package src.creational.abstractfactory.concreteProduct;

import src.creational.abstractfactory.product.PaymentMethod;

public class Debit implements PaymentMethod {
    @Override
    public String doPayment() {
        return "Pago a Débito";
    }
}
