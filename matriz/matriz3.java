public class matriz3 {

    public static void main(String[] args) {
        int[][] matrizInt = new int[3][3];
        float[][] matrizFloat = new float[3][3];
        boolean[][] matrizBool = new boolean[3][3];

        matrizInt = matrizPreencherInt(matrizInt, 5);
        matrizFloat = matrizPreencherFloat(matrizFloat, 2.5f);
        matrizBool = matrizPreencherBool(matrizBool, true);

        matrizPrintInt(matrizInt);
        matrizPrintFloat(matrizFloat);
        matrizPrintBool(matrizBool);
    }

    public static int[][] matrizPreencherInt(int[][] matriz, int valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor;
            }
        }
        return matriz;
    }

    public static float[][] matrizPreencherFloat(float[][] matriz, float valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor;
            }
        }
        return matriz;
    }

    public static boolean[][] matrizPreencherBool(boolean[][] matriz, boolean valor) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = valor;
            }
        }
        return matriz;
    }

    public static void matrizPrintInt(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void matrizPrintFloat(float[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void matrizPrintBool(boolean[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
