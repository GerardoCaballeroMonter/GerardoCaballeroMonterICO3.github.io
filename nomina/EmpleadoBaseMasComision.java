public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno,
                                   String numeroSeguroSocial,
                                   double ventasBrutas, double tarifaComision, double salarioBase) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    public void establecerSalarioBase(double salarioBase) {
        if (salarioBase < 0.0)
            throw new IllegalArgumentException("El salario base debe ser >= 0.0");
        this.salarioBase = salarioBase;
    }

    public double obtenerSalarioBase() { return salarioBase; }

    @Override
    public double ingresos() {
        return obtenerSalarioBase() + super.ingresos();
    }

    @Override
    public String toString() {
        return String.format("Empleado con base más comisión: %s%nSalario base: $%,.2f",
                super.toString(), obtenerSalarioBase());
    }
}
