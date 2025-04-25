package src.behavioral.template;

public class Main {
    public static void main(String[] args) {
        probarTemplateMethod();
    }

    public static void probarTemplateMethod(){
        Payment payment = new Visa();
        payment.makePayment();

        payment = new Paypal();
        payment.makePayment();
    }
}
