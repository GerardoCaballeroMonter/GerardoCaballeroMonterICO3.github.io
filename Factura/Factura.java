//la clase Factura que implementa a PorPagar
public class Factura implements PorPagar {
    private final String numeroPieza;
    private final String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    //constructor
    public Factura(String numeroPieza, String descripcionPieza, int cantidad,
                   double precioPorArticulo) {
        if (cantidad < 0) // validar cantidad
            throw new IllegalArgumentException("La cantidad debe ser >= 0");

        if (precioPorArticulo < 0.0) //validar el precio por articulo
            throw new IllegalArgumentException("El precio por artículo debe ser >= 0");
        
        this.cantidad = cantidad;
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.precioPorArticulo = precioPorArticulo;
                   }
        
    

    //devuelve el número de pieza
    public String getNumeroPieza() {
        return numeroPieza;
    }

    //devuelve la descripción de la pieza
    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    //establece la cantidad
    public void setCantidad(int cantidad) {
        if (cantidad < 0)
            throw new IllegalArgumentException("La cantidad debe ser >= 0");
        
        this.cantidad = cantidad;
    }

    //devuelve la cantidad
    public int getCantidad() {
        return cantidad;
    }

    //establece el precio por artículo
    public void setPrecioPorArticulo(double precioPorArticulo) {
        if (precioPorArticulo < 0.0)
            throw new IllegalArgumentException(
                    "El precio por artículo debe ser >= 0");
        
        this.precioPorArticulo = precioPorArticulo;
    }

    //devuelve el precio por artículo
    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    //devuelve una representación String del objeto Factura
    @Override
    public String toString() {
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f",
                "Factura", "número de pieza", getNumeroPieza(),
                getDescripcionPieza(), "cantidad", getCantidad(),
                "precio por artículo", getPrecioPorArticulo());
    }

    //metodo obtenerMontoPago de la interfaz PorPagar
    @Override
    public double obtenerMontoPago() {
        return getCantidad() * getPrecioPorArticulo(); //calculando el total
    }
    
}
