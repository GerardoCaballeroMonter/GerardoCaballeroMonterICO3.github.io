class TryAnidadoException {
    public static void main(String args[]) {
        try {
            int c = args.length; //numero de argumentos: linea de comandos
            int a = 10/c; //error si no. de argumentos = 0
            System.err.println("valor de a = " + a);

            try {
                if (c == 1)
                a = a /(c-1);
                if (c == 2) {
                    int[] b = {100,5}; // el array contiene dos elementos 
                    b[3] = 0; //fuera de limites
                }
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("Segunda excepcion. Indice fuera de limites ==> " + e);
            }
            catch (Exception e) {
                System.err.println("Excepcion GENERICA... " + e);
            }
        } 
        catch (ArithmeticException e) {
            System.err.println("Primera excepcion. Division por cero: " + e);
        }
    }
}
