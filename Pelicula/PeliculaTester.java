public class PeliculaTester {

    public static void main(String[] args) {
        // Creamos objetos de diferentes tipos de peliculas
        Pelicula p1 = new PeliculaAnimada("Toy Story", 1995, "Pixar Animation Studios");
        Pelicula p2 = new PeliculaAnimada("El Rey León", 1994, "Disney Animation");
        Pelicula p3 = new PeliculaDisney("Frozen", 2013, "Disney Animation", true);


        // Polimorfismo: el mismo método mostrarInfo()
        Pelicula[] peliculas = {p1, p2, p3};

        System.out.println("===== PELÍCULAS =====\n");

        // Recorre el arreglo y muestra la información
        int contador = 1;
        for (Pelicula p : peliculas) {
            System.out.println("Película #" + contador);
            System.out.println("------------------------------");
            System.out.println(p.mostrarInfo());
            System.out.println();
            contador++;
        }
    }
}