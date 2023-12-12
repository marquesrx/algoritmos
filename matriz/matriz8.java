import java.util.Arrays;

public class matriz8 {

    public static void main(String[] args) {
        int[][] matrizInt = new int[3][3];
        float[][] matrizFloat = new float[3][3];
        boolean[][] matrizBool = new boolean[3][3];
        int[] vetorInt = {1, 2, 3};
        float[] vetorFloat = {1.0f, 2.0f, 3.0f};
        boolean[] vetorBool = {true, false, true};

        matrizSetLinhaInt(matrizInt, vetorInt, 1);
        System.out.println("Matriz de inteiros após setLinha: ");
        matrizPrintInt(matrizInt);

        matrizSetLinhaFloat(matrizFloat, vetorFloat, 0);
        System.out.println("Matriz de floats após setLinha: ");
        matrizPrintFloat(matrizFloat);

        matrizSetLinhaBool(matrizBool, vetorBool, 2);
        System.out.println("Matriz de booleanos após setLinha: ");
        matrizPrintBool(matrizBool);

        int[] novoVetorInt = {4, 5, 6};
        float[] novoVetorFloat = {4.0f, 5.0f, 6.0f};
        boolean[] novoVetorBool = {false, true, false};

        matrizSetColunaInt(matrizInt, novoVetorInt, 2);
        System.out.println("Matriz de inteiros após setColuna: ");
        matrizPrintInt(matrizInt);

        matrizSetColunaFloat(matrizFloat, novoVetorFloat, 1);
        System.out.println("Matriz de floats após setColuna: ");
        matrizPrintFloat(matrizFloat);

        matrizSetColunaBool(matrizBool, novoVetorBool, 0);
        System.out.println("Matriz de booleanos após setColuna: ");
        matrizPrintBool(matrizBool);
    }

    public static void matrizSetLinhaInt(int[][] matriz, int[] vetor, int linha) {
        matriz[linha] = Arrays.copyOf(vetor, vetor.length);
    }

    public static void matrizSetLinhaFloat(float[][] matriz, float[] vetor, int linha) {
        matriz[linha] = Arrays.copyOf(vetor, vetor.length);
    }

    public static void matrizSetLinhaBool(boolean[][] matriz, boolean[] vetor, int linha) {
        matriz[linha] = Arrays.copyOf(vetor, vetor.length);
    }

    public static void matrizSetColunaInt(int[][] matriz, int[] vetor, int coluna) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][coluna] = vetor[i];
        }
    }

    public static void matrizSetColunaFloat(float[][] matriz, float[] vetor, int coluna) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][coluna] = vetor[i];
        }
    }

    public static void matrizSetColunaBool(boolean[][] matriz, boolean[] vetor, int coluna) {
        for (int i = 0; i < matriz.length; i++) {
            matriz[i][coluna] = vetor[i];
        }
    }

    public static void matrizPrintInt(int[][] matriz) {
        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }
    }

    public static void matrizPrintFloat(float[][] matriz) {
        for (float[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }
    }

    public static void matrizPrintBool(boolean[][] matriz) {
        for (boolean[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }
    }
}
