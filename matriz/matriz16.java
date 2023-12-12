import java.util.Arrays;

public class matriz16 {

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

        System.out.println("Matriz Original (Int):");
        imprimirMatriz(matrizInt);

        matrizPermutacaoLinhasInt(matrizInt, 0, 2);
        System.out.println("Matriz Após Permutação de Linhas (Int):");
        imprimirMatriz(matrizInt);

        System.out.println("Matriz Original (Float):");
        imprimirMatriz(matrizFloat);

        matrizPermutacaoLinhasFloat(matrizFloat, 0, 2);
        System.out.println("Matriz Após Permutação de Linhas (Float):");
        imprimirMatriz(matrizFloat);

        int[][] matrizIntColunas = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        float[][] matrizFloatColunas = {
            {1.0f, 2.0f, 3.0f},
            {4.0f, 5.0f, 6.0f},
            {7.0f, 8.0f, 9.0f}
        };

        System.out.println("Matriz Original (Int) para Permutação de Colunas:");
        imprimirMatriz(matrizIntColunas);

        matrizPermutacaoColunasInt(matrizIntColunas, 0, 2);
        System.out.println("Matriz Após Permutação de Colunas (Int):");
        imprimirMatriz(matrizIntColunas);

        System.out.println("Matriz Original (Float) para Permutação de Colunas:");
        imprimirMatriz(matrizFloatColunas);

        matrizPermutacaoColunasFloat(matrizFloatColunas, 0, 2);
        System.out.println("Matriz Após Permutação de Colunas (Float):");
        imprimirMatriz(matrizFloatColunas);
    }

    // Função para permutar linhas em uma matriz de inteiros
    public static void matrizPermutacaoLinhasInt(int[][] matriz, int linha1, int linha2) {
        int[] temp = Arrays.copyOf(matriz[linha1], matriz[linha1].length);
        matriz[linha1] = matriz[linha2];
        matriz[linha2] = temp;
    }

    // Função para permutar linhas em uma matriz de floats
    public static void matrizPermutacaoLinhasFloat(float[][] matriz, int linha1, int linha2) {
        float[] temp = Arrays.copyOf(matriz[linha1], matriz[linha1].length);
        matriz[linha1] = matriz[linha2];
        matriz[linha2] = temp;
    }

    // Função para permutar colunas em uma matriz de inteiros
    public static void matrizPermutacaoColunasInt(int[][] matriz, int coluna1, int coluna2) {
        for (int i = 0; i < matriz.length; i++) {
            int temp = matriz[i][coluna1];
            matriz[i][coluna1] = matriz[i][coluna2];
            matriz[i][coluna2] = temp;
        }
    }

    // Função para permutar colunas em uma matriz de floats
    public static void matrizPermutacaoColunasFloat(float[][] matriz, int coluna1, int coluna2) {
        for (int i = 0; i < matriz.length; i++) {
            float temp = matriz[i][coluna1];
            matriz[i][coluna1] = matriz[i][coluna2];
            matriz[i][coluna2] = temp;
        }
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
