import java.util.Arrays;

public class matriz7 {

    public static void main(String[] args) {
        int[][] matrizInt = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        float[][] matrizFloat = {{1.0f, 2.0f, 3.0f}, {4.0f, 5.0f, 6.0f}, {7.0f, 8.0f, 9.0f}};
        boolean[][] matrizBool = {{true, false, true}, {false, true, false}, {true, true, false}};
        String[][] matrizStr = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};

        int[] linhaInt = matrizGetLinhaInt(matrizInt, 1);
        System.out.println("Linha de inteiros: " + Arrays.toString(linhaInt));

        float[] linhaFloat = matrizGetLinhaFloat(matrizFloat, 0);
        System.out.println("Linha de floats: " + Arrays.toString(linhaFloat));

        boolean[] linhaBool = matrizGetLinhaBool(matrizBool, 2);
        System.out.println("Linha de booleanos: " + Arrays.toString(linhaBool));

        String[] linhaStr = matrizGetLinhaStr(matrizStr, 1);
        System.out.println("Linha de strings: " + Arrays.toString(linhaStr));

        int[] colunaInt = matrizGetColunaInt(matrizInt, 2);
        System.out.println("Coluna de inteiros: " + Arrays.toString(colunaInt));

        float[] colunaFloat = matrizGetColunaFloat(matrizFloat, 1);
        System.out.println("Coluna de floats: " + Arrays.toString(colunaFloat));

        boolean[] colunaBool = matrizGetColunaBool(matrizBool, 0);
        System.out.println("Coluna de booleanos: " + Arrays.toString(colunaBool));

        String[] colunaStr = matrizGetColunaStr(matrizStr, 2);
        System.out.println("Coluna de strings: " + Arrays.toString(colunaStr));
    }

    public static int[] matrizGetLinhaInt(int[][] matriz, int linha) {
        return Arrays.copyOf(matriz[linha], matriz[linha].length);
    }

    public static float[] matrizGetLinhaFloat(float[][] matriz, int linha) {
        return Arrays.copyOf(matriz[linha], matriz[linha].length);
    }

    public static boolean[] matrizGetLinhaBool(boolean[][] matriz, int linha) {
        return Arrays.copyOf(matriz[linha], matriz[linha].length);
    }

    public static String[] matrizGetLinhaStr(String[][] matriz, int linha) {
        return Arrays.copyOf(matriz[linha], matriz[linha].length);
    }

    public static int[] matrizGetColunaInt(int[][] matriz, int coluna) {
        int[] colunaArray = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            colunaArray[i] = matriz[i][coluna];
        }
        return colunaArray;
    }

    public static float[] matrizGetColunaFloat(float[][] matriz, int coluna) {
        float[] colunaArray = new float[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            colunaArray[i] = matriz[i][coluna];
        }
        return colunaArray;
    }

    public static boolean[] matrizGetColunaBool(boolean[][] matriz, int coluna) {
        boolean[] colunaArray = new boolean[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            colunaArray[i] = matriz[i][coluna];
        }
        return colunaArray;
    }

    public static String[] matrizGetColunaStr(String[][] matriz, int coluna) {
        String[] colunaArray = new String[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            colunaArray[i] = matriz[i][coluna];
        }
        return colunaArray;
    }
}
