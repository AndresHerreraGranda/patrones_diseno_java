package src.behavioral.observer;

public class Peaton implements Observer{
    @Override
    public void update(Semaforo semaforo) {
        if(semaforo.getStatus().equals("ROJO_COCHE")){
            System.out.println("Semaforo verde para Peaton");
        } else {
            System.out.println("Semaforo rojo para Peaton");
        }
    }
}
