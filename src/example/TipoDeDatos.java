package example;

public class TipoDeDatos {

    /**
     * punto de entrada a la aplicación java
     * @param args argumentos de de entrada para la aplicación
     */
    public static void main(String[] args) {
        // enteros
        byte variable1 = 5;
        short variable2 = 10;
        int variable3 = 15;
        long variable4 = 20;

        // decimales
        float variable5 = 5.5f;
        double variable6 = 10.5;

        //booleans
        boolean variable8 = true;

        // Texto
        char variable7 = 'a';
        String variable9 = "Hola Mundo";

        System.out.println("Enteros\n"+variable1+"\n"+variable2+"\n"+variable3+" \n"+ variable4+
                "\nDecimales\n"+variable5+"\n"+variable6+"\nBooleans\n"+variable8+"\nTexto\n"+variable7+"\n"+variable9);
    }
}
