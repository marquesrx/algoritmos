import java.util.Arrays;

public class vetor4 {

    public static int[] vBooleanParaInt(boolean[] vBoolean) {
        int[] vetorInt = new int[vBoolean.length];

        for (int i = 0; i < vBoolean.length; i++) {
            if (vBoolean[i]) {
                vetorInt[i] = 1;
            } else {
                vetorInt[i] = 0;
            }
        }

        return vetorInt;
    }

    public static boolean[] vetorIntParaBoolean(int[] vetorInt) {
        boolean[] vBoolean = new boolean[vetorInt.length];

        for (int i = 0; i < vetorInt.length; i++) {
            vBoolean[i] = (vetorInt[i] != 0);
        }

        return vBoolean;
    }

    public static void main(String[] args) {
        boolean[] vBoolean = {true, false, true, true, true};
        
        int[] vetorInt = vBooleanParaInt(vBoolean);
        boolean[] vBooleanConv = vetorIntParaBoolean(vetorInt);
        
        System.out.println("Vetor Boolean original: " + Arrays.toString(vBoolean));
        System.out.println("Vetor Int convertido: " + Arrays.toString(vetorInt));
        System.out.println("Vetor Boolean convertido: " + Arrays.toString(vBooleanConv));
    }
}
