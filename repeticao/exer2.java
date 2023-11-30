import java.util.Scanner;

public class exer2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior, menor, numero;
        
        System.out.println("Digite 5 números (valores entre 0 e 1000):");

        
        maior = Integer.MIN_VALUE;
        menor = Integer.MAX_VALUE;
       
        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            numero = scanner.nextInt();
            
            if (numero > maior) {
                maior = numero;
            }
            
            if (numero < menor) {
                menor = numero;
            }
        }
        
        System.out.println("Maior número digitado: " + maior);
        System.out.println("Menor número digitado: " + menor);

        scanner.close();
    }
}
