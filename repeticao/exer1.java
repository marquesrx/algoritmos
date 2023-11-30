import java.util.Scanner;

public class exer1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, i;
       
        System.out.print("Digite um valor inteiro n: ");
        n = scanner.nextInt();
        
        for (i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        scanner.close();
    }
}
