package examenfinalparte1;

public class Principal {

    int i;

    public Principal(int j, int m) {
        i = sumaVariables(j, m);
    }

    public Principal(int j) {
        i = sumaVariables(j, j);
    }

    public Principal() {
        i = -1;
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
