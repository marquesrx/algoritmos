public class matriz12 {

    public static void main(String[] args) {
        int[][] matrizInt = {{1, 2}, {3, 4}};
        float[][] matrizFloat = {{1.0f, 2.0f}, {3.0f, 4.0f}};
        int escalarInt = 2;
        float escalarFloat = 1.5f;

        int[][] resultadoInt = matrizMultEscalarInt(matrizInt, escalarInt);
        imprimirMatriz(resultadoInt);

        float[][] resultadoFloat = matrizMultEscalarFloat(matrizFloat, escalarFloat);
        imprimirMatriz(resultadoFloat);
    }

    // Função para multiplicar uma matriz de inteiros por um escalar
    public static int[][] matrizMultEscalarInt(int[][] matriz, int escalar) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        int[][] resultado = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matriz[i][j] * escalar;
            }
        }

        return resultado;
    }

    // Função para multiplicar uma matriz de floats por um escalar
    public static float[][] matrizMultEscalarFloat(float[][] matriz, float escalar) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;
        float[][] resultado = new float[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                resultado[i][j] = matriz[i][j] * escalar;
            }
        }

        return resultado;
    }

    // Função para imprimir uma matriz de inteiros
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Função para imprimir uma matriz de floats
    public static void imprimirMatriz(float[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
