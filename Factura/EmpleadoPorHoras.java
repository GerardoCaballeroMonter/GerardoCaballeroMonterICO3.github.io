public class EmpleadoPorHoras implements PorPagar {
    private final String nombre;
    private final String apellido;
    private final String nss;
    private final double sueldo;
    private final double horas;

    public EmpleadoPorHoras(String nombre, String apellido, String nss, double sueldo, double horas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nss = nss;
        this.sueldo = sueldo;
        this.horas = horas;
    }

    @Override
    public double obtenerMontoPago() {
        if (horas <= 40)
            return sueldo * horas;
        else
            return 40 * sueldo + (horas - 40) * sueldo * 1.5;
    }

    @Override
    public String toString() {
        return String.format("Empleado por horas: %s %s%nNSS: %s%nSueldo: $%,.2f%nHoras: %.2f",
                nombre, apellido, nss, sueldo, horas);
    }
}