package src.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CuentaComposite implements CuentaComponent{
    private List<CuentaComponent> cuentas;

    public CuentaComposite() {
        this.cuentas = new ArrayList<>();
    }

    public void addCuenta(CuentaComponent cuenta) {
        cuentas.add(cuenta);
    }

    public void removeCuenta(CuentaComponent cuenta) {
        cuentas.remove(cuenta);
    }

    @Override
    public void showAccountName() {
        for(CuentaComponent cuenta : cuentas) {
            cuenta.showAccountName();
        }
    }

    @Override
    public Double getAmount() {
        Double total = 0.0;
        for(CuentaComponent cuenta : cuentas) {
            total += cuenta.getAmount();
        }
        return total;
    }
}
