import java.util.Scanner;

public class exer10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número n: ");
        int n = scanner.nextInt();

        
        boolean ehPrimo = true;

        if (n < 2) {
            ehPrimo = false;  
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    ehPrimo = false;
                    break;
                }
            }
        }
      
        if (ehPrimo) {
            System.out.println(n + " é um número primo.");
        } else {
            System.out.println(n + " não é um número primo.");
        }
        
        scanner.close();
    }
}
