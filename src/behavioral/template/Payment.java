package src.behavioral.template;

public abstract class Payment {
    abstract void initialize();
    abstract void startPayment();
    abstract void endPayment();

    public final void makePayment(){
        initialize();
        startPayment();
        endPayment();
    }
}
