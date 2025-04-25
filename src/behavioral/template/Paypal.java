package src.behavioral.template;

public class Paypal extends Payment{
    @Override
    void initialize() {
        System.out.println("Inicializando el pago con Paypal");
    }

    @Override
    void startPayment() {
        System.out.println("Realizado el pago con Paypal");
    }

    @Override
    void endPayment() {
        System.out.println("Finalizando el pago con Paypal");
    }
}
