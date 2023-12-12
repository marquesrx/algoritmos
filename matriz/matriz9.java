public class matriz9 {

    public static void main(String[] args) {
        int[][] matrizInt = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Matriz de inteiros original: ");
        matrizPrintInt(matrizInt);

        float[][] matrizFloat = matrizConverteIntParaFloat(matrizInt);
        System.out.println("Matriz de floats após conversão: ");
        matrizPrintFloat(matrizFloat);
    }

    public static float[][] matrizConverteIntParaFloat(int[][] matrizInt) {
        int linhas = matrizInt.length;
        int colunas = matrizInt[0].length;

        float[][] matrizFloat = new float[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizFloat[i][j] = (float) matrizInt[i][j];
            }
        }

        return matrizFloat;
    }

    public static void matrizPrintInt(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static void matrizPrintFloat(float[][] matriz) {
        for (float[] linha : matriz) {
            for (float valor : linha) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }
}
