public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(String nombre, String apellido, String nss, double ventasBrutas, double tarifaComision, double salarioBase) {
        super(nombre, apellido, nss, ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    public double obtenerSalarioBase() {
        return salarioBase;
    }

    public void establecerSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double obtenerMontoPago() {
        return salarioBase + super.obtenerMontoPago();
    }

    @Override
    public String toString() {
        return String.format("%s%nSalario base: $%,.2f", super.toString(), salarioBase);
    }
}
