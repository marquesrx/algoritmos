import java.util.Scanner;

public class matriz5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a ordem da matriz (número de linhas e colunas):");
        int ordem = scanner.nextInt();

        System.out.println("Digite o valor a ser buscado na matriz:");
        int valorBusca = scanner.nextInt();

        int[][] matrizInteiros = matrizLeiaInt(ordem);
        imprimirMatriz(matrizInteiros);

        int[][] posicoesInt = matrizBuscaInt(matrizInteiros, valorBusca);
        imprimirPosicoes(posicoesInt);

        float[][] matrizFloat = matrizLeiaFloat(ordem);
        imprimirMatriz(matrizFloat);

        float[][] posicoesFloat = matrizBuscaFloat(matrizFloat, valorBusca);
        imprimirPosicoes(posicoesFloat);

        String[][] matrizString = matrizLeiaString(ordem);
        imprimirMatriz(matrizString);

        String[][] posicoesString = matrizBuscaString(matrizString, Integer.toString(valorBusca));
        imprimirPosicoes(posicoesString);
    }

    private static String[][] matrizLeiaString(int ordem) {
        return null;
    }

    private static float[][] matrizLeiaFloat(int ordem) {
        return null;
    }

    private static int[][] matrizLeiaInt(int ordem) {
        return null;
    }

    public static int[][] matrizBuscaInt(int[][] matriz, int valorBusca) {
        int quantidade = contarOcorrencias(matriz, valorBusca);
        int[][] posicoes = new int[quantidade][2];

        int k = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valorBusca) {
                    posicoes[k][0] = i;
                    posicoes[k][1] = j;
                    k++;
                }
            }
        }

        return posicoes;
    }

    public static float[][] matrizBuscaFloat(float[][] matriz, float valorBusca) {
        int quantidade = contarOcorrencias(matriz, valorBusca);
        float[][] posicoes = new float[quantidade][2];

        int k = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == valorBusca) {
                    posicoes[k][0] = i;
                    posicoes[k][1] = j;
                    k++;
                }
            }
        }

        return posicoes;
    }

    public static String[][] matrizBuscaString(String[][] matriz, String valorBusca) {
        int quantidade = contarOcorrencias(matriz, valorBusca);
        String[][] posicoes = new String[quantidade][2];

        int k = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j].equals(valorBusca)) {
                    posicoes[k][0] = Integer.toString(i);
                    posicoes[k][1] = Integer.toString(j);
                    k++;
                }
            }
        }

        return posicoes;
    }

    public static int contarOcorrencias(int[][] matriz, int valorBusca) {
        int quantidade = 0;
        for (int[] linha : matriz) {
            for (int valor : linha) {
                if (valor == valorBusca) {
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

    public static int contarOcorrencias(float[][] matriz, float valorBusca) {
        int quantidade = 0;
        for (float[] linha : matriz) {
            for (float valor : linha) {
                if (valor == valorBusca) {
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

    public static int contarOcorrencias(String[][] matriz, String valorBusca) {
        int quantidade = 0;
        for (String[] linha : matriz) {
            for (String valor : linha) {
                if (valor.equals(valorBusca)) {
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

    public static void imprimirPosicoes(int[][] posicoes) {
        System.out.println("Posições encontradas:");
        for (int i = 0; i < posicoes.length; i++) {
            System.out.println("Linha: " + posicoes[i][0] + ", Coluna: " + posicoes[i][1]);
        }
    }

    public static void imprimirPosicoes(float[][] posicoes) {
        System.out.println("Posições encontradas:");
        for (int i = 0; i < posicoes.length; i++) {
            System.out.println("Linha: " + posicoes[i][0] + ", Coluna: " + posicoes[i][1]);
        }
    }

    public static void imprimirPosicoes(String[][] posicoes) {
        System.out.println("Posições encontradas:");
        for (int i = 0; i < posicoes.length; i++) {
            System.out.println("Linha: " + posicoes[i][0] + ", Coluna: " + posicoes[i][1]);
        }
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
