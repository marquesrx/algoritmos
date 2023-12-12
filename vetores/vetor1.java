import java.util.Arrays;

public class vetor1 {

    public static int[] vetorNovoInt(int tamanho) {
        int[] vInt = new int[tamanho];
        Arrays.fill(vInt, 0);
        return vInt;
    }

    public static float[] vetorNovoFloat(int tamanho) {
        float[] vFloat = new float[tamanho];
        Arrays.fill(vFloat, 0.0f);
        return vFloat;
    }

    public static boolean[] vetorNovoBool(int tamanho) {
        boolean[] vBool = new boolean[tamanho];
        Arrays.fill(vBool, false);
        return vBool;
    }

    public static String[] vetorNovoString(int tamanho) {
        String[] vetorString = new String[tamanho];
        Arrays.fill(vetorString, "");
        return vetorString;
    }

    public static void main(String[] args) {
        int[] inteiros = vetorNovoInt(5);
        float[] floats = vetorNovoFloat(5);
        boolean[] booleans = vetorNovoBool(5);
        String[] strings = vetorNovoString(5);

        System.out.println("Vetor de inteiros: " + Arrays.toString(inteiros));
        System.out.println("Vetor de floats: " + Arrays.toString(floats));
        System.out.println("Vetor de booleans: " + Arrays.toString(booleans));
        System.out.println("Vetor de strings: " + Arrays.toString(strings));
    }
}
