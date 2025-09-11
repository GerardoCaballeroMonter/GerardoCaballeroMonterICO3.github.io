class TryAnidado {
    public static void main(String args []) {
       try {
        int c = args.length; //no. de argumentos en la linea de comandos
        int a = 10/c; //error si no. de argumentos = 0
        System.out.println("a= " + a);
        try {
            if (c == 1) a = a/(c-1); 
            if (c == 2) {
                int[] b = {100,5}; //el array contiene dos elementos
                b[3] = 0; //fuera de limites
            }
        } //segundo try
        catch (ArrayIndexOutOfBoundsException e) { //catch para el segundo try
            System.out.println("Segunda excepcion. Indice fuera de limites =>" + e);
        }
       } //primer try
       catch (ArithmeticException e) { //catch para el primer try
        System.out.println("Primera excepcion. Division por cero ==>" + e);
       }
    }    
}
