package src.creational.factorymethod.concrete;

import src.creational.factorymethod.product.Payment;

public class CardPayment implements Payment {
    @Override
    public void doPayment() {
        System.out.println("Pagando con Tarjeta de Credito");
    }
}
