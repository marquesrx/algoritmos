public class matriz1 {

    public static void main(String[] args) {
        
        int[][] matrizInt = matrizNovaInt(3, 3);
        float[][] matrizFloat = matrizNovaFloat(2, 2);
        boolean[][] matrizBool = matrizNovaBool(4, 4);
        String[][] matrizString = matrizNovaString(2, 3);
        
        exibirMatriz(matrizInt);
        exibirMatriz(matrizFloat);
        exibirMatriz(matrizBool);
        exibirMatriz(matrizString);
    }

    public static int[][] matrizNovaInt(int linhas, int colunas) {
        int[][] matriz = new int[linhas][colunas];
        return matriz;
    }

    public static float[][] matrizNovaFloat(int linhas, int colunas) {
        float[][] matriz = new float[linhas][colunas];
        return matriz;
    }

    public static boolean[][] matrizNovaBool(int linhas, int colunas) {
        boolean[][] matriz = new boolean[linhas][colunas];
        return matriz;
    }

    public static String[][] matrizNovaString(int linhas, int colunas) {
        String[][] matriz = new String[linhas][colunas];
        return matriz;
    }

    public static void exibirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void exibirMatriz(float[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void exibirMatriz(boolean[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void exibirMatriz(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
