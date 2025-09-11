class MultiplesCatch {
    public static void main(String args[]) {
        int a;
        int b[];
        int c = args.length; //numero de argumentos: linea de comandos

        try {
            a = 10 / c; //error si no. de argumentos = 0
            System.err.println("valor de a = " + a);
            b = new int [5];

            for (int i=0; i < a; i++) { //si c = 1, se produce error
                b[i] = i;
                System.out.println("\t" + i);
            }
        }
        catch (ArithmeticException e) {
            System.out.println("Primera excepcion. Division por cero: " + e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Segunda excepcion. Indice fuera de limites =>: " + e);
        }
    }
}
