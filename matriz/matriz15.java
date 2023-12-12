public class matriz15 {

    public static void main(String[] args) {
        int[][] matrizInt = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        float[][] matrizFloat = {
            {1.0f, 2.0f, 3.0f},
            {4.0f, 5.0f, 6.0f},
            {7.0f, 8.0f, 9.0f}
        };

        boolean[][] matrizBool = {
            {true, false, true},
            {false, true, false}
        };

        int[][] transpostaInt = matrizTransporInt(matrizInt);
        imprimirMatriz(transpostaInt);

        float[][] transpostaFloat = matrizTransporFloat(matrizFloat);
        imprimirMatriz(transpostaFloat);

        boolean[][] transpostaBool = matrizTransporBool(matrizBool);
        imprimirMatriz(transpostaBool);
    }

    // Função para transpor uma matriz de inteiros
    public static int[][] matrizTransporInt(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }

    // Função para transpor uma matriz de floats
    public static float[][] matrizTransporFloat(float[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        float[][] transposta = new float[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }

    // Função para transpor uma matriz de booleanos
    public static boolean[][] matrizTransporBool(boolean[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        boolean[][] transposta = new boolean[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
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

    // Função para imprimir uma matriz de booleanos
    public static void imprimirMatriz(boolean[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
