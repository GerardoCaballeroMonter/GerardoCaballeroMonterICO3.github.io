public class PeliculaAnimada extends Pelicula {
    // Atributo privado que almacena.
    private String estudioAnimacion;

    // Constructor que inicializa el título, año y estudio de animación
    public PeliculaAnimada(String titulo, int año, String estudioAnimacion) {
        super(titulo, año); // Llama al constructor de la superclase (Pelicula)
        this.estudioAnimacion = estudioAnimacion; // Asigna el estudio de animación
    }

    // Getter para obtener el nombre del estudio de animación
    public String getEstudioAnimacion() {
        return estudioAnimacion;
    }

    // Setter para modificar el nombre del estudio de animación
    public void setEstudioAnimacion(String estudioAnimacion) {
        this.estudioAnimacion = estudioAnimacion;
    }

    // Sobrescritura del método mostrarInfo para incluir el estudio de animación
    @Override
    public String mostrarInfo() {
        return "Pelicula Animada:" +getTitulo() + "(" + getAño() + ")" + "-Estudio: " + estudioAnimacion;
    }
}