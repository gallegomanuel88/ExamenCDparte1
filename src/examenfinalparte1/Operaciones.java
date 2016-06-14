package examenfinalparte1;

public class Operaciones {
    /**
     * Esta variable contiene el valor aplicado por el constructor.
     */
    int resultado;
    /**
     * Recibe 2 valores int que seran aplicado a los 2 valores del metodo "sumaVariables". El resultado del metodo "sumaValores" dara valor a int resultado.
     * @param j Recibe un valor int que sera aplicado al primer valor del metodo "sumaVariables"
     * @param m Recie un valor int que sera aplicado al segundo valor del metodo "sumaVariables"
     */
    public Operaciones(int j, int m) {
        resultado = sumaVariables(j, m);
    }
    /**
     * Recibe 1 valor int que sera aplicado a los 2 valores del metodo "sumaVariables". El resultado del metodo "sumaValores" dara valor a int resultado.
     * @param j Recibe un valor int que sera aplicado a los 2 valores del metodo "sumaVariables"
     */
    public Operaciones(int j) {
        resultado = sumaVariables(j, j);
    }
    /**
     * Da a int resultado un valor por defecto de -1.
     */
    public Operaciones() {
        resultado = -1;
    }
    /**
     * Recibe 2 variables int, las suma y retorna mediante un int el resultado
     * @param x recibe el primer valor que sera sumado
     * @param y recibe el segundo valor que sera sumado
     * @return retorna el resultado de la suma de las 2 variables introducidas
     */
    public int sumaVariables(int x, int y) {
        return x + y;
    }
}
