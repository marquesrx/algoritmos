public class vetor6 {

    public static int vetorSomaInt(int[] vetor) {
        int soma = 0;
        for (int elemento : vetor) {
            soma += elemento;
        }
        return soma;
    }

    public static float vetorSomaFloat(float[] vetor) {
        float soma = 0.0f;
        for (float elemento : vetor) {
            soma += elemento;
        }
        return soma;
    }

    public static void main(String[] args) {
        int[] vetorInt = {1, 6, 7, 4, 5};
        float[] vetorFloat = {5.4f, 2.3f, 3.9f, 4.5f, 4.7f};
        
        int somaInt = vetorSomaInt(vetorInt);
        float somaFloat = vetorSomaFloat(vetorFloat);
       
        System.out.println("Soma dos inteiros: " + somaInt);
        System.out.println("Soma dos floats: " + somaFloat);
    }
}
