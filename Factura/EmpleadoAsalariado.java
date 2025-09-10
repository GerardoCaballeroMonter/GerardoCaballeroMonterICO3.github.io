//la clase EmpleadoAsalariado que implementa la interfaz PorPagar
//metodo obtenerMontoPago
public class EmpleadoAsalariado extends Empleado {
    private double salarioSemanal;

    //constructor
    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno,
    String numeroSeguroSocial, double salarioSemanal) 
    {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        if (salarioSemanal < 0.0)
            throw new IllegalArgumentException(
                    "El salario semanal debe ser >= 0.0");
        
        this.salarioSemanal = salarioSemanal;
    }

    //establece el salario semanal
    public void setSalarioSemanal(double salarioSemanal) {
        if (salarioSemanal < 0.0) 
            throw new IllegalArgumentException(
                    "El salario semanal debe ser >= 0.0");
        
        this.salarioSemanal = salarioSemanal;
    }

    //devuelve el salario semanal
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    //calcula los ingresos; implementa el método de la interfaz PorPagar
    //que era abstracto en la superclase Empleado
    @Override
    public double obtenerMontoPago() {
        return getSalarioSemanal();
    }

    //devuelve una representación String del objeto EmpleadoAsalariado
    @Override
    public String toString() {
        return String.format("empleado asalariado: %s%n%s: $%,.2f",
                super.toString(), "salario semanal", getSalarioSemanal());
    }
    
}
