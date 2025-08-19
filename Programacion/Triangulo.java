public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double lado;

    public Triangulo(double base, double altura, double lado){
        super(0, 0);
        this.base = base;
        this.altura = altura;
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
        calcularArea();
        calcularPerimetro();
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
        calcularArea();
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
        calcularPerimetro();
    }

    public void calcularArea() {
        // Área de un triángulo: (base * altura) / 2
        double area = (base * altura) / 2;
        setArea(area);
    }

    public void calcularPerimetro() {
        // Perímetro de un triángulo: base + lado + lado (asumiendo triángulo isósceles)
        // Si es un triángulo equilátero, todos los lados serían iguales
        double perimetro = base + lado + lado;
        setPerimetro(perimetro);
    }

    @Override
    public String toString() {
        return "Triangulo [base=" + base + ", altura=" + altura + ", lado=" + lado + 
               ", area=" + getArea() + ", perimetro=" + getPerimetro() + "]";
    }
}
