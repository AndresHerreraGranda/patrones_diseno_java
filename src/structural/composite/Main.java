package src.structural.composite;

public class Main {
    public static void main(String[] args) {
        pruebaComposite();
    }
    private static void pruebaComposite(){
        CuentaComponent cuentaCorriente = new CuentaCorriente(1000.0, "Cuenta Corriente de Andres");
        CuentaComponent cuentaAhorro = new CuentaAhorro(2000.0, "Cuenta Ahorro de Andres");

        CuentaComposite cuentaComposite = new CuentaComposite();
        cuentaComposite.addCuenta(cuentaCorriente);
        cuentaComposite.addCuenta(cuentaAhorro);
        cuentaComposite.showAccountName();

        System.out.println("Total Amount: " + cuentaComposite.getAmount());
    }
}
