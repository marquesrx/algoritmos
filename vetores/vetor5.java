public class vetor5 {

    public static boolean vetorValoresIguaisInt(int[] vetor) {       
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] != vetor[0]) {
                return false;
            }
        }
        return true;
    }

    public static boolean vetorValoresIguaisFloat(float[] vetor) {        
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] != vetor[0]) {
                return false;
            }
        }
        return true;
    }

    public static boolean vetorValoresIguaisBoolean(boolean[] vetor) {        
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] != vetor[0]) {
                return false;
            }
        }
        return true;
    }

    public static boolean vetorValoresIguaisString(String[] vetor) {       
        for (int i = 1; i < vetor.length; i++) {
            if (!vetor[i].equals(vetor[0])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] vetorInt = {1, 1, 1, 1, 1};
        float[] vetorFloat = {2.0f, 2.0f, 2.0f, 2.0f, 2.0f};
        boolean[] vetorBoolean = {true, true, true, true, true};
        String[] vetorString = {"A", "A", "A", "A", "A"};
       
        System.out.println("Inteiros iguais: " + vetorValoresIguaisInt(vetorInt));
        System.out.println("Floats iguais: " + vetorValoresIguaisFloat(vetorFloat));
        System.out.println("Booleanos iguais: " + vetorValoresIguaisBoolean(vetorBoolean));
        System.out.println("Strings iguais: " + vetorValoresIguaisString(vetorString));
    }
}
