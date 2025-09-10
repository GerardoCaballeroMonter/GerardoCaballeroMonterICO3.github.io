public class EmpleadoPorComision implements PorPagar {
    private final String nombre;
    private final String apellido;
    private final String nss;
    private final double ventasBrutas;
    private final double tarifaComision;

    public EmpleadoPorComision(String nombre, String apellido, String nss, double ventasBrutas, double tarifaComision) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nss = nss;
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    @Override
    public double obtenerMontoPago() {
        return ventasBrutas * tarifaComision;
    }

    @Override
    public String toString() {
        return String.format("Empleado por comisión: %s %s%nNSS: %s%nVentas brutas: $%,.2f%nTarifa comisión: %.2f",
                nombre, apellido, nss, ventasBrutas, tarifaComision);
    }
}
