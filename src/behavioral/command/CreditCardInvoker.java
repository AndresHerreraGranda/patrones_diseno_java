package src.behavioral.command;

public class CreditCardInvoker {
    private Command command;

    public CreditCardInvoker() {
    }

    public CreditCardInvoker(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void run(){
        command.execute();
    }
}
