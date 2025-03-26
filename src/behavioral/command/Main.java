package src.behavioral.command;

public class Main {
    public static void main(String[] args) {
        probarCommand();
    }

    private static void probarCommand(){
        CreditCardReceiver creditCardReceiver = new CreditCardReceiver();

         CreditCardInvoker creditCardInvoker = new CreditCardInvoker();
         creditCardInvoker.setCommand(new CreditCardActivateCommand(creditCardReceiver));
         creditCardInvoker.run();
        System.out.println("----------------------------------------");
        creditCardInvoker.setCommand(new CreditCardDesactivateCommand(creditCardReceiver));
        creditCardInvoker.run();
    }
}
