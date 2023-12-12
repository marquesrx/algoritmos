public class matriz2 {

    public static void main(String[] args) {
        int[][] matrizInt = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        float[][] matrizFloat = {{1.1f, 2.2f, 3.3f}, {4.4f, 5.5f, 6.6f}, {7.7f, 8.8f, 9.9f}};
        String[][] matrizString = {{"A", "B", "C"}, {"D", "E", "F"}, {"G", "H", "I"}};

        matrizPrintInt(matrizInt);
        matrizPrintFloat(matrizFloat);
        matrizPrintString(matrizString);
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

    public static void matrizPrintString(String[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
