package src.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        probarObserver();
    }

    private static void probarObserver(){
        Coche coche = new Coche();
        Peaton peaton = new Peaton();
        MessagePublisher messagePublisher = new MessagePublisher();

        messagePublisher.attach(coche);
        messagePublisher.attach(peaton);
        messagePublisher.notifyUpdate(new Semaforo("ROJO_COCHE"));
        try{
            Thread.sleep(2000);
        } catch (Exception e){

        }
        messagePublisher.notifyUpdate(new Semaforo("VERDE_COCHE"));


    }
}
