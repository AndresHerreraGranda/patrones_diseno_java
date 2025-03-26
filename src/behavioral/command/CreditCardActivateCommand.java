package src.behavioral.command;

public class CreditCardActivateCommand implements Command{
    CreditCardReceiver creditCardReceiver;

    public CreditCardActivateCommand(CreditCardReceiver creditCardReceiver) {
        this.creditCardReceiver = creditCardReceiver;
    }

    @Override
    public void execute() {
        creditCardReceiver.sendPintNumberToCustomer();
        creditCardReceiver.activate();
        creditCardReceiver.sendSMSToCustomerActivate();

    }
}
