import java.util.Scanner;

public class exer14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        boolean resultado;
        
        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

       
        resultado = numeroPf(numero);
        
        if (resultado) {
            System.out.println(numero + " é um número perfeito.");
        } else {
            System.out.println(numero + " não é um número perfeito.");
        }
        
        scanner.close();
    }
    
    private static boolean numeroPf(int num) {
        if (num <= 0) {
            return false;
        }

        int somaDivisores = 0, i;
        
        for (i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                somaDivisores = somaDivisores + i;
            }
        }
        
        return somaDivisores == num;
    }
}
