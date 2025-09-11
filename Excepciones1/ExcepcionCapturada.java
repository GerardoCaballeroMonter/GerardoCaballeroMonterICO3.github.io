class ExcepcionCapturada {
    public static void main(String args []) {
        int a,b;
        try { //controla el codigo peligroso
            a=0;
            b=10/a;
            System.err.println("Esto ya no se imprime");
        }
        catch (ArithmeticException objetoExcep) { 
            System.out.println("Division por cero" + objetoExcep);
        }
        System.out.println("Continua el programa...");
    }
}
