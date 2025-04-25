package src.behavioral.template;

public class Visa  extends Payment{
    @Override
    void initialize() {
        System.out.println("Inicializando el pago con Visa");
    }

    @Override
    void startPayment() {
        System.out.println("Realizado el pago con Visa");
    }

    @Override
    void endPayment() {
        System.out.println("Finalizando el pago con Visa");
    }
}
