package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {
        Principal obj1Principal = new Principal(10, 20);
        int n = obj1Principal.i;
        System.out.println("Es: " + n);
        
        Principal obj2Principal = new Principal(10);
        int m = obj2Principal.i;
        System.out.println("Es: " + m);
        
        Principal obj3Principal = new Principal();
        int nn = obj3Principal.i;
        System.out.println("Es: " + nn);
    }
}
