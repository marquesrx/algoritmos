public class matriz13 {

    public static void main(String[] args) {
        int[][] matrizA = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrizB = {{7, 8}, {9, 10}, {11, 12}};

        int[][] resultadoInt = matrizMultInt(matrizA, matrizB);
        imprimirMatriz(resultadoInt);

        float[][] matrizAFloat = {{1.0f, 2.0f, 3.0f}, {4.0f, 5.0f, 6.0f}};
        float[][] matrizBFloat = {{7.0f, 8.0f}, {9.0f, 10.0f}, {11.0f, 12.0f}};

        float[][] resultadoFloat = matrizMultFloat(matrizAFloat, matrizBFloat);
        imprimirMatriz(resultadoFloat);
    }

    // Função para multiplicar matrizes de inteiros
    public static int[][] matrizMultInt(int[][] matrizA, int[][] matrizB) {
        int linhasA = matrizA.length;
        int colunasA = matrizA[0].length;
        int linhasB = matrizB.length;
        int colunasB = matrizB[0].length;

        if (colunasA != linhasB) {
            System.out.println("As matrizes não podem ser multiplicadas. Dimensões incompatíveis.");
            return new int[0][0];
        }

        int[][] resultado = new int[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        return resultado;
    }

    // Função para multiplicar matrizes de floats
    public static float[][] matrizMultFloat(float[][] matrizA, float[][] matrizB) {
        int linhasA = matrizA.length;
        int colunasA = matrizA[0].length;
        int linhasB = matrizB.length;
        int colunasB = matrizB[0].length;

        if (colunasA != linhasB) {
            System.out.println("As matrizes não podem ser multiplicadas. Dimensões incompatíveis.");
            return new float[0][0];
        }

        float[][] resultado = new float[linhasA][colunasB];

        for (int i = 0; i < linhasA; i++) {
            for (int j = 0; j < colunasB; j++) {
                for (int k = 0; k < colunasA; k++) {
                    resultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
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
