//la superclase abstracta Empleado que implementa a PorPagar
public abstract class Empleado implements PorPagar {
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;

    //constructor
    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }

    //devuelve el primer nombre
    public String getPrimerNombre() {
        return primerNombre;  
    }

    //devuelve el apellido paterno
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    //devuelve el número de seguro social
    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    //devuelve una representación String del objeto Empleado
    @Override
    public String toString() {
        return String.format("%s %s%nNúmero de seguro social: %s",
                getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial());
    }
    //NOTA: aqui no implementamos el método obtenerMontoPago de PorPagar, asi que
    //esta clase debe ser declarada como abstracta para evitar un error de compilación
}