public class PruebaSistemaNomina {
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsalariado =
            new EmpleadoAsalariado("Edson", "Gamboa", "1111", 800.00);
        EmpleadoPorHoras empleadoPorHoras =
            new EmpleadoPorHoras("Jaziel", "Gonzalez", "4444", 16.75, 40);
        EmpleadoPorComision empleadoPorComision =
            new EmpleadoPorComision("Chagoya", "Rodriguez", "9999", 10000, .06);
        EmpleadoBaseMasComision empleadoBaseMasComision =
            new EmpleadoBaseMasComision("Jhon", "Espejel", "1212", 5000, .04, 300);

        System.out.println("Empleados procesados por separado:\n");

        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoAsalariado,
                "ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoPorHoras,
                "ingresos", empleadoPorHoras.ingresos());
        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoPorComision,
                "ingresos", empleadoPorComision.ingresos());
        System.out.printf("%s%n%s: $%,.2f%n%n", empleadoBaseMasComision,
                "ingresos", empleadoBaseMasComision.ingresos());

        Empleado[] empleados = new Empleado[4];
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        empleados[2] = empleadoPorComision;
        empleados[3] = empleadoBaseMasComision;

        System.out.println("Empleados procesados en forma polimórfica:\n");

        for (Empleado empleadoActual : empleados) {
            System.out.println(empleadoActual);

            if (empleadoActual instanceof EmpleadoBaseMasComision) {
                EmpleadoBaseMasComision empleado =
                        (EmpleadoBaseMasComision) empleadoActual;
                empleado.establecerSalarioBase(
                        1.10 * empleado.obtenerSalarioBase());
                System.out.printf("nuevo salario base con 10%% de aumento es: $%,.2f%n",
                        empleado.obtenerSalarioBase());
            }

            System.out.printf("ingresos $%,.2f%n%n", empleadoActual.ingresos());
        }

        for (int j = 0; j < empleados.length; j++)
            System.out.printf("El empleado %d es un %s%n", j,
                    empleados[j].getClass().getName());
    }
}
