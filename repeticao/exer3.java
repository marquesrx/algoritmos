import java.util.Scanner;

public class exer3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, i;

        System.out.print("Digite um valor inteiro n: ");
        n = scanner.nextInt();
        
        System.out.println("Números de " + n + " a 1, na ordem decrescente:");

        for (i = n; i >= 1; i--) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}
