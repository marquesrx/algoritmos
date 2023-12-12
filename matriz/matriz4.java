import java.util.Scanner;

public class matriz4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a ordem da matriz (número de linhas e colunas):");
        int ordem = scanner.nextInt();

        int[][] matrizInteiros = matrizLeiaInt(ordem);
        imprimirMatriz(matrizInteiros);

        float[][] matrizFloat = matrizLeiaFloat(ordem);
        imprimirMatriz(matrizFloat);

        String[][] matrizString = matrizLeiaString(ordem);
        imprimirMatriz(matrizString);
    }

    public static int[][] matrizLeiaInt(int ordem) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[ordem][ordem];

        System.out.println("Digite os valores da matriz de inteiros:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        return matriz;
    }

    public static float[][] matrizLeiaFloat(int ordem) {
        Scanner scanner = new Scanner(System.in);
        float[][] matriz = new float[ordem][ordem];

        System.out.println("Digite os valores da matriz de floats:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                matriz[i][j] = scanner.nextFloat();
            }
        }

        return matriz;
    }

    public static String[][] matrizLeiaString(int ordem) {
        Scanner scanner = new Scanner(System.in);
        String[][] matriz = new String[ordem][ordem];

        System.out.println("Digite os valores da matriz de strings:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                matriz[i][j] = scanner.next();
            }
        }

        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz) {
        System.out.println("Matriz de inteiros:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirMatriz(float[][] matriz) {
        System.out.println("Matriz de floats:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void imprimirMatriz(String[][] matriz) {
        System.out.println("Matriz de strings:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
