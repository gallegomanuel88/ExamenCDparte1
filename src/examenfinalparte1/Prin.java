package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {
        Principal obj1Principal = new Principal(10, 20);
        int valor1 = obj1Principal.resultado;
        System.out.println("Es: " + valor1);
        
        Principal obj2Principal = new Principal(10);
        int valor2 = obj2Principal.resultado;
        System.out.println("Es: " + valor2);
        
        Principal obj3Principal = new Principal();
        int valor3 = obj3Principal.resultado;
        System.out.println("Es: " + valor3);
    }
}
