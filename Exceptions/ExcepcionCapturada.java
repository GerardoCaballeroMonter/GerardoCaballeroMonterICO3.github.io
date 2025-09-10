class ExcepcionCapturada {
    public static void main(String[] args) {
        int a,b;

        try {
            a = 0;
            b = 10 / a; //aqui ocurre la excepción
            System.out.println("Esta linea de código ya no se lee");
        }
        catch(ArithmeticException exc) { 
            System.out.println("Error, Division entre cero" + exc );
        }

        System.out.println("Aqui continua el programa despues de la gestion de excepcion");
    }
}