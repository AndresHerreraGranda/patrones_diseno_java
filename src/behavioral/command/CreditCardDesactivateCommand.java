package src.behavioral.command;

public class CreditCardDesactivateCommand implements Command {
    CreditCardReceiver creditCardReceiver;

    public CreditCardDesactivateCommand(CreditCardReceiver creditCardReceiver) {
        this.creditCardReceiver = creditCardReceiver;
    }

    @Override
    public void execute() {
        creditCardReceiver.desactivate();
        creditCardReceiver.sendSMSToCustomerDesactivate();
    }
}
