public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super(0, 0);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
        calcularArea();
        calcularPerimetro();
    }

    public void calcularArea() {
        // Área de un círculo: π * radio²
        double area = Math.PI * radio * radio;
        setArea(area);
    }

    public void calcularPerimetro() {
        // Perímetro (circunferencia) de un círculo: 2 * π * radio
        double perimetro = 2 * Math.PI * radio;
        setPerimetro(perimetro);
    }

    public double calcularDiametro() {
        // Diámetro del círculo: 2 * radio
        return 2 * radio;
    }

    @Override
    public String toString() {
        return "Circulo [radio=" + radio + ", area=" + getArea() + ", perimetro=" + getPerimetro() + "]";
    }
}
