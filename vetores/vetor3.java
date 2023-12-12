public class vetor3 {

    public static void vetorPrintInt(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void vetorPrintFloat(float[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void vetorPrintString(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }

    public static void vetorPrintLnInt(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void vetorPrintLnFloat(float[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void vetorPrintLnString(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] vetorInt = {1, 2, 3, 4};
        float[] vetorFloat = {1.0f, 2.0f, 3.0f, 4.0f};
        String[] vetorString = {"A", "B", "C", "D"};

        
        vetorPrintInt(vetorInt);
        System.out.println();

        vetorPrintFloat(vetorFloat);
        System.out.println();

        vetorPrintString(vetorString);
        System.out.println();

        vetorPrintLnInt(vetorInt);
        vetorPrintLnFloat(vetorFloat);
        vetorPrintLnString(vetorString);
    }
}
