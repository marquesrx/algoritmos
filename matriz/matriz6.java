import java.util.Arrays;

public class matriz6 {

    public static void main(String[] args) {
        int[][] matrizA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matrizB = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        System.out.println("Matrizes de inteiros são iguais? " + matrizesComparacaoInt(matrizA, matrizB));

        float[][] matrizC = {{1.0f, 2.0f, 3.0f}, {4.0f, 5.0f, 6.0f}, {7.0f, 8.0f, 9.0f}};
        float[][] matrizD = {{1.0f, 2.0f, 3.0f}, {4.0f, 5.0f, 6.0f}, {7.0f, 8.0f, 9.0f}};

        System.out.println("Matrizes de floats são iguais? " + matrizesComparacaoFloat(matrizC, matrizD));

        String[][] matrizE = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};
        String[][] matrizF = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};

        System.out.println("Matrizes de strings são iguais? " + matrizesComparacaoString(matrizE, matrizF));

        boolean[][] matrizG = {{true, false}, {true, true}};
        boolean[][] matrizH = {{true, false}, {true, true}};

        System.out.println("Matrizes de booleanos são iguais? " + matrizesComparacaoBool(matrizG, matrizH));
    }

    public static boolean matrizesComparacaoInt(int[][] matrizA, int[][] matrizB) {
        return Arrays.deepEquals(matrizA, matrizB);
    }

    public static boolean matrizesComparacaoFloat(float[][] matrizA, float[][] matrizB) {
        return Arrays.deepEquals(matrizA, matrizB);
    }

    public static boolean matrizesComparacaoString(String[][] matrizA, String[][] matrizB) {
        return Arrays.deepEquals(matrizA, matrizB);
    }

    public static boolean matrizesComparacaoBool(boolean[][] matrizA, boolean[][] matrizB) {
        return Arrays.deepEquals(matrizA, matrizB);
    }
}
