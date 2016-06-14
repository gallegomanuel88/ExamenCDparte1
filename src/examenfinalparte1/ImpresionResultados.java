package examenfinalparte1;

import java.io.IOException;

public class ImpresionResultados {

    public static void main(String[] args) throws IOException {
        Operaciones suma = new Operaciones(10, 20);
        int resultadoSuma = suma.resultado;
        System.out.println("El resultado es: " + resultadoSuma);
        
        Operaciones multiplicacionX2 = new Operaciones(10);
        int resultadoMulti = multiplicacionX2.resultado;
        System.out.println("El resultado es: " + resultadoMulti);
        
        Operaciones valorFijo = new Operaciones();
        int resultadoValorFijo = valorFijo.resultado;
        System.out.println("El resultado es: " + resultadoValorFijo);
    }
}
