package examenfinalparte1;

import java.io.IOException;

public class Prin {

    public static void main(String[] args) throws IOException {
        Principal suma = new Principal(10, 20);
        int resultadoSuma = suma.resultado;
        System.out.println("Es: " + resultadoSuma);
        
        Principal multiplicacionX2 = new Principal(10);
        int resultadoMulti = multiplicacionX2.resultado;
        System.out.println("Es: " + resultadoMulti);
        
        Principal valorFijo = new Principal();
        int resultadoValorFijo = valorFijo.resultado;
        System.out.println("Es: " + resultadoValorFijo);
    }
}
