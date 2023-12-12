import java.util.Arrays;

public class vetor9 {

    public static int[] vetoresConjuntoUniaoInt(int[] vetorA, int[] vetorB) {
        int tamanhoUniao = vetorA.length + vetorB.length;
        int[] vetorUniao = new int[tamanhoUniao];

        System.arraycopy(vetorA, 0, vetorUniao, 0, vetorA.length);
        System.arraycopy(vetorB, 0, vetorUniao, vetorA.length, vetorB.length);
       
        vetorUniao = Arrays.stream(vetorUniao).distinct().toArray();

        return vetorUniao;
    }

    public static int[] vetoresConjuntoInterseccaoInt(int[] vetorA, int[] vetorB) {
        int tamanhoInterseccao = Math.min(vetorA.length, vetorB.length);
        int[] vetorInterseccao = new int[tamanhoInterseccao];

        int index = 0;

        for (int elemento : vetorA) {
            if (Arrays.binarySearch(vetorB, elemento) >= 0) {
                vetorInterseccao[index++] = elemento;
            }
        }
        
        vetorInterseccao = Arrays.copyOf(vetorInterseccao, index);

        return vetorInterseccao;
    }

    public static void main(String[] args) {
        int[] vetorA = {1, 2, 3, 4, 5};
        int[] vetorB = {3, 4, 5, 6, 7};
        
        int[] uniao = vetoresConjuntoUniaoInt(vetorA, vetorB);
        int[] interseccao = vetoresConjuntoInterseccaoInt(vetorA, vetorB);
        
        System.out.println("União dos vetores: " + Arrays.toString(uniao));
        System.out.println("Interseção dos vetores: " + Arrays.toString(interseccao));
    }
}
