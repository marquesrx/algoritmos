public class matriz10 {

    public static void main(String[] args) {
        int[][] matrizInt = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        System.out.println("Valores iguais na linha 1 (inteiros): " + matrizValoresIguaisLinhaInt(matrizInt, 0));

        float[][] matrizFloat = {{1.0f, 1.0f, 1.0f}, {2.0f, 2.0f, 2.0f}, {3.0f, 3.0f, 3.0f}};
        System.out.println("Valores iguais na linha 1 (floats): " + matrizValoresIguaisLinhaFloat(matrizFloat, 0));

        boolean[][] matrizBool = {{true, true, true}, {false, false, false}, {true, true, true}};
        System.out.println("Valores iguais na coluna 2 (booleanos): " + matrizValoresIguaisColunaBool(matrizBool, 1));
    }

    // Funções para verificar se os valores de uma linha são iguais
    public static boolean matrizValoresIguaisLinhaInt(int[][] matriz, int linha) {
        int primeiroValor = matriz[linha][0];
        for (int coluna = 1; coluna < matriz[linha].length; coluna++) {
            if (matriz[linha][coluna] != primeiroValor) {
                return false;
            }
        }
        return true;
    }

    public static boolean matrizValoresIguaisLinhaFloat(float[][] matriz, int linha) {
        float primeiroValor = matriz[linha][0];
        for (int coluna = 1; coluna < matriz[linha].length; coluna++) {
            if (matriz[linha][coluna] != primeiroValor) {
                return false;
            }
        }
        return true;
    }

    public static boolean matrizValoresIguaisLinhaBool(boolean[][] matriz, int linha) {
        boolean primeiroValor = matriz[linha][0];
        for (int coluna = 1; coluna < matriz[linha].length; coluna++) {
            if (matriz[linha][coluna] != primeiroValor) {
                return false;
            }
        }
        return true;
    }

    // Funções para verificar se os valores de uma coluna são iguais
    public static boolean matrizValoresIguaisColunaInt(int[][] matriz, int coluna) {
        int primeiroValor = matriz[0][coluna];
        for (int linha = 1; linha < matriz.length; linha++) {
            if (matriz[linha][coluna] != primeiroValor) {
                return false;
            }
        }
        return true;
    }

    public static boolean matrizValoresIguaisColunaFloat(float[][] matriz, int coluna) {
        float primeiroValor = matriz[0][coluna];
        for (int linha = 1; linha < matriz.length; linha++) {
            if (matriz[linha][coluna] != primeiroValor) {
                return false;
            }
        }
        return true;
    }

    public static boolean matrizValoresIguaisColunaBool(boolean[][] matriz, int coluna) {
        boolean primeiroValor = matriz[0][coluna];
        for (int linha = 1; linha < matriz.length; linha++) {
            if (matriz[linha][coluna] != primeiroValor) {
                return false;
            }
        }
        return true;
    }
}
