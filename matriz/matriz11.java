public class matriz11 {

    public static void main(String[] args) {
        int[][] matrizAInt = {{1, 2}, {3, 4}};
        int[][] matrizBInt = {{5, 6}, {7, 8}};
        int[][] matrizCInt = matrizSomaInt(matrizAInt, matrizBInt);
        imprimirMatriz(matrizCInt);

        float[][] matrizAFloat = {{1.0f, 2.0f}, {3.0f, 4.0f}};
        float[][] matrizBFloat = {{5.0f, 6.0f}, {7.0f, 8.0f}};
        float[][] matrizCFloat = matrizSomaFloat(matrizAFloat, matrizBFloat);
        imprimirMatriz(matrizCFloat);
    }

    // Função para somar duas matrizes de inteiros
    public static int[][] matrizSomaInt(int[][] matrizA, int[][] matrizB) {
        int linhas = matrizA.length;
        int colunas = matrizA[0].length;
        int[][] matrizSoma = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return matrizSoma;
    }

    // Função para somar duas matrizes de floats
    public static float[][] matrizSomaFloat(float[][] matrizA, float[][] matrizB) {
        int linhas = matrizA.length;
        int colunas = matrizA[0].length;
        float[][] matrizSoma = new float[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return matrizSoma;
    }

    // Função para imprimir uma matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

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
