//Programa de prueba de la interfaz PorPagar que procesa objetos
//Factura y Empleado mediante el polimorfismo
public class PruebaInterfazPorPagar {
    public static void main(String[] args) {
        //crear un arreglo PorPagar de 4 elementos
        PorPagar[] objetosPorPagar = new PorPagar[6];

        //llenar el arreglo con objetos Factura y Empleado
        objetosPorPagar[0] = new Factura("01234", "silla", 2, 375.00);
        objetosPorPagar[1] = new Factura("56789", "mesa", 1, 650.00);
        objetosPorPagar[2] = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40);
        objetosPorPagar[4] = new EmpleadoPorComision("Sue", "Jones", "333-33-3333", 10000, 0.06);
        objetosPorPagar[5] = new EmpleadoBaseMasComision("Bob", "Lewis", "444-44-4444", 5000, 0.04, 300);

        System.out.println("Facturas y empleados procesados en forma polimorfica:");

        for (PorPagar cuenta : objetosPorPagar) {
            // Si es EmpleadoPorComision, incrementar salario base en 10%
            if (cuenta instanceof EmpleadoBaseMasComision) {
                EmpleadoBaseMasComision emp = (EmpleadoBaseMasComision) cuenta;
                double nuevoSalarioBase = emp.obtenerSalarioBase() * 1.10;
                emp.establecerSalarioBase(nuevoSalarioBase);
                System.out.println("Salario base incrementado en 10% para: " + emp.toString());
            }
            System.out.printf("%n%s %n%s: $%,.2f%n", cuenta.toString(),
                    "pago vencido", cuenta.obtenerMontoPago());
        }
    }
}