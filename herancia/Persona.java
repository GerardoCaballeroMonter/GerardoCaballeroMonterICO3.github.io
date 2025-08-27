import java.util.Date; //para agragar el valor de date ya que es caracter especial -

public class Persona {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Date fechaNacimiento;
    
    //constructor
    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno; //parametros
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento; //this para diferenciar entre parametros y atributo
    }
    //metodos getter permiten acceder a los atributos privados de la clase
    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellidoPaterno() {
        return apellidoPaterno;
    }

    public String obtenerApellidoMaterno() {
        return apellidoMaterno;
    }

    public String obtenerNombreCompleto() {
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno;
    }

    public Date obtenerFechaNacimiento() {
        return fechaNacimiento;
    }
}

