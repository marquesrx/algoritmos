public class vetor7 {

    public static int[] vetorSomaVetoresInt(int[] vetorV, int[] vetorW) {
        int tamanho = vetorV.length;
        int[] vetorZ = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetorZ[i] = vetorV[i] + vetorW[i];
        }

        return vetorZ;
    }

    public static float[] vetorSomaVetoresFloat(float[] vetorV, float[] vetorW) {
        int tamanho = vetorV.length;
        float[] vetorZ = new float[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetorZ[i] = vetorV[i] + vetorW[i];
        }

        return vetorZ;
    }

    public static void main(String[] args) {
        int[] vetorVInt = {1, 2, 3, 4, 5};
        int[] vetorWInt = {5, 4, 3, 2, 1};
        float[] vetorVFloat = {1.5f, 2.5f, 3.5f, 4.5f, 5.5f};
        float[] vetorWFloat = {5.5f, 4.5f, 3.5f, 2.5f, 1.5f};
       
        int[] vetorZInt = vetorSomaVetoresInt(vetorVInt, vetorWInt);
        float[] vetorZFloat = vetorSomaVetoresFloat(vetorVFloat, vetorWFloat);
        
        System.out.println("Soma dos vetores inteiros: " + java.util.Arrays.toString(vetorZInt));
        System.out.println("Soma dos vetores floats: " + java.util.Arrays.toString(vetorZFloat));
    }
}
