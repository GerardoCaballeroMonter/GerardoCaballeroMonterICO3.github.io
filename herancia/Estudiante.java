import java.util.Date;

public class Estudiante extends Persona {
    private String idAlumno;
    private double promCalif;
    private String carrera;

    //connstructor
    public Estudiante(String nombre, String apellidoPaterno, String apellidoMaterno, Date fechaNacimiento,String idAlumno, String carrera) {
        super(nombre, apellidoPaterno, apellidoMaterno, fechaNacimiento); //datos heredados
        this.idAlumno = idAlumno;
        this.carrera = carrera;
        this.promCalif = 0.0;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public String getCarrera() {
        return carrera;
    }

    public double obtenerPromedio() {
        return promCalif;
    }

    public void cambiarCarrera(String nuevaCarrera) {
        this.carrera = nuevaCarrera;
    }

    public void calcularPromedio(String[] calificaciones) {
        double suma = 0; //ya que apartir de aqui se iran sumando
        for (String c : calificaciones) { //inicia un bucle para procesar cada calificacion individualmente
            switch (c) { //valor de la variable c (cada calificacion) para saber que caso se ejecutara
                case "A": suma += 4; break; //es como u n stop para que no siga ejecutando mas alla de la cantidad especifica
                case "A-": suma += 3.67; break;
                case "B+": suma += 3.33; break;
                case "B": suma += 3; break;
                case "B-": suma += 2.67; break;
                case "C+": suma += 2.33; break;
                case "C": suma += 2; break;
                case "D": suma += 1; break;
                case "F": suma += 0; break;
                default: suma += 0;
            }
        }
        this.promCalif = suma / calificaciones.length;
    }

    @Override //sobreescribe el metodo toString de la clase
    public String toString() {
        return "Estudiante: " + obtenerNombreCompleto() +
                "\nFecha Nacimiento: " + obtenerFechaNacimiento() +
                "\nID: " + idAlumno +
                "\nPromedio: " + promCalif +
                "\nCarrera: " + carrera;
    }
}
