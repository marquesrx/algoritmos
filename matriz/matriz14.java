public class matriz14 {

    public static void main(String[] args) {
        int ordem = 4;

        int[][] identidadeInt = matrizNovaIdentidadeInt(ordem);
        imprimirMatriz(identidadeInt);

        float[][] identidadeFloat = matrizNovaIdentidadeFloat(ordem);
        imprimirMatriz(identidadeFloat);
    }

    // Função para criar uma matriz identidade de inteiros
    public static int[][] matrizNovaIdentidadeInt(int ordem) {
        int[][] identidade = new int[ordem][ordem];

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                identidade[i][j] = (i == j) ? 1 : 0;
            }
        }

        return identidade;
    }

    // Função para criar uma matriz identidade de floats
    public static float[][] matrizNovaIdentidadeFloat(int ordem) {
        float[][] identidade = new float[ordem][ordem];

        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                identidade[i][j] = (i == j) ? 1.0f : 0.0f;
            }
        }

        return identidade;
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
