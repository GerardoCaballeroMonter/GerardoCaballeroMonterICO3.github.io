//no se pueden crear objetos directamente de esta clase, sirve como plantilla para que las subclases
//la extiendan y definan su propio comportamiento
public abstract class Pelicula {
    // Atributos privados (encapsulamiento)
    private String titulo;
    private int año;

    // Constructor que inicializa los atributos titulo y año
    public Pelicula(String titulo, int año) {
        this.titulo = titulo; // Asigna el título recibido al atributo de la clase
        this.año = año;       // Asigna el año recibido al atributo de la clase
    }

    // Encapsulamiento: Métodos getter para obtener

    // Devuelve el título de la película
    public String getTitulo() {
        return titulo;
    }

    // Devuelve el año de la película
    public int getAño() {
        return año;
    }

    // Metodo abstracto: este metodo no tiene implementacion aqui, obliga a atodas las subclases que hereden de pelicula lo implementen
    //sirve para mostrar la informacion de la pelicula segun el tipo de subclase 
    public abstract String mostrarInfo();
}

