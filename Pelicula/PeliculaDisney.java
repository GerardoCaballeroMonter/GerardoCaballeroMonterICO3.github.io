public class PeliculaDisney extends PeliculaAnimada {
    // Atributo privado que indica si la película incluye canciones musicales
    private boolean tieneMusical;

    // Constructor que inicializa el título, año, estudio de animación y si tiene musical
    public PeliculaDisney(String titulo, int año, String estudioAnimacion, boolean tieneMusical) {
        super(titulo, año, estudioAnimacion); // Llama al constructor de la subclase (PeliculaAnimada)
        this.tieneMusical = tieneMusical;    // Asigna si la película tiene musical
    }

    // Getter para saber si la película incluye musicales
    public boolean isTieneMusical() {
        return tieneMusical;
    }

    // Setter para modificar si la película incluye canciones musicales
    public void setTieneMusical(boolean tieneMusical) {
        this.tieneMusical = tieneMusical;
    }

    // La anotación @Override indica que este método está sobrescribiendo el método mostrarInfo()
    // de la subclase (PeliculaAnimada). Sirve para personalizar el comportamiento de este método
    // en la subclase PeliculaDisney, agregando información específica sobre si la película es musical.
    @Override
    public String mostrarInfo() {
        return super.mostrarInfo() +
               "\nTipo: Disney" +
               "\nMusical: " + (tieneMusical ? "Sí :)" : "No :(");
    }
}