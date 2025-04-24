package src.behavioral.state;

public class Main {
    public static void main(String[] args) {
        probarState();
    }

    private static void probarState(){
         MobileAlertStateContext  context = new MobileAlertStateContext();
         context.alert();
         context.setState(new Vibration());
         context.alert();
         context.setState(new Silent());
         context.alert();
    }
}
