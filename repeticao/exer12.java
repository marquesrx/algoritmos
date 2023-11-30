import java.util.Scanner;

public class exer12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i,n;
        double soma;
        
        System.out.print("Digite um número: ");
        n = scanner.nextInt();
        
        soma = 0.0;
        
        for (i = 1; i <= n; i++) {
            soma = soma + 1.0 / i;
        }
        
        System.out.println("A soma é: " + soma);
        
        scanner.close();
    }
}
