public class vetor8 {

    public static int vetorMenorInt(int[] vetor) {
        if (vetor.length == 0) {
            throw new IllegalArgumentException("O vetor não pode ser vazio.");
        }

        int menor = vetor[0];

        for (int elemento : vetor) {
            if (elemento < menor) {
                menor = elemento;
            }
        }

        return menor;
    }

    public static float vetorMenorFloat(float[] vetor) {
        if (vetor.length == 0) {
            throw new IllegalArgumentException("O vetor não pode ser vazio.");
        }

        float menor = vetor[0];

        for (float elemento : vetor) {
            if (elemento < menor) {
                menor = elemento;
            }
        }

        return menor;
    }

    public static int vetorMaiorInt(int[] vetor) {
        if (vetor.length == 0) {
            throw new IllegalArgumentException("O vetor não pode ser vazio.");
        }

        int maior = vetor[0];

        for (int elemento : vetor) {
            if (elemento > maior) {
                maior = elemento;
            }
        }

        return maior;
    }

    public static float vetorMaiorFloat(float[] vetor) {
        if (vetor.length == 0) {
            throw new IllegalArgumentException("O vetor não pode ser vazio.");
        }

        float maior = vetor[0];

        for (float elemento : vetor) {
            if (elemento > maior) {
                maior = elemento;
            }
        }

        return maior;
    }

    public static void main(String[] args) {
        int[] vetorInt = {3, 1, 4, 1, 5, 9, 2};
        float[] vetorFloat = {3.14f, 1.0f, 4.0f, 1.0f, 5.0f, 9.0f, 2.0f};
        
        int menorInt = vetorMenorInt(vetorInt);
        float menorFloat = vetorMenorFloat(vetorFloat);
        int maiorInt = vetorMaiorInt(vetorInt);
        float maiorFloat = vetorMaiorFloat(vetorFloat);
       
        System.out.println("Menor valor do vetor de inteiros: " + menorInt);
        System.out.println("Menor valor do vetor de floats: " + menorFloat);
        System.out.println("Maior valor do vetor de inteiros: " + maiorInt);
        System.out.println("Maior valor do vetor de floats: " + maiorFloat);
    }
}
