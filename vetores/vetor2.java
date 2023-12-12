import java.util.Scanner;
import java.util.Arrays;

public class vetor2 {

    public static int[] vetorLeituraInt() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tam do vetor de inteiros: ");
        int tam = scanner.nextInt();

        int[] vInt = new int[tam];

        for (int i = 0; i < tam; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vInt[i] = scanner.nextInt();
        }

        return vInt;
    }

    public static float[] vetorLeituraFloat() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tam do vetor de floats: ");
        int tam = scanner.nextInt();

        float[] vfloat = new float[tam];

        for (int i = 0; i < tam; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vfloat[i] = scanner.nextFloat();
        }

        return vfloat;
    }

    public static String[] vetorLeituraString() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tam do vetor de strings: ");
        int tam = scanner.nextInt();

        String[] vStrings = new String[tam];

        for (int i = 0; i < tam; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vStrings[i] = scanner.next();
        }

        return vStrings;
    }

    public static void main(String[] args) {
        int[] vInt = vetorLeituraInt();
        float[] vfloat = vetorLeituraFloat();
        String[] vStrings = vetorLeituraString();

        System.out.println("Vetor de inteiros: " + Arrays.toString(vInt));
        System.out.println("Vetor de floats: " + Arrays.toString(vfloat));
        System.out.println("Vetor de strings: " + Arrays.toString(vStrings));
    }
}
