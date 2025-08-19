public class FiguraTester {
    public static void main(String[] args) {
        
        System.out.println("\n=== FIGURAS ===");
        Triangulo triangulo1 = new Triangulo(10, 5, 7);
        triangulo1.calcularArea();
        triangulo1.calcularPerimetro();
        
        Cuadrado cuadrado1 = new Cuadrado(4);
        cuadrado1.calcularArea();
        cuadrado1.calcularPerimetro();
        
        Circulo circulo1 = new Circulo(3);
        circulo1.calcularArea();
        circulo1.calcularPerimetro();
        
        System.out.println( triangulo1);
        System.out.println(cuadrado1);
        System.out.println(circulo1);
    }
}
