public class Cuadrado extends Figura {
    private double lado;
    
    public Cuadrado(double lado) {
        super(0, 0);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }

    public void calcularArea() {
        // Área de un cuadrado: lado * lado
        double area = lado * lado;
        setArea(area);
    }

    public void calcularPerimetro() {
        // Perímetro de un cuadrado: 4 * lado
        double perimetro = 4 * lado;
        setPerimetro(perimetro);
    }

    @Override
    public String toString() {
        return "Cuadrado [lado=" + lado + ", area=" + getArea() + ", perimetro=" + getPerimetro() + "]";
    }
}
