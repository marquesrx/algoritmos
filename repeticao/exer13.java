import java.util.Scanner;

public class exer13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero, i;
        
        System.out.print("Digite um número: ");
        numero = scanner.nextInt();
        
        System.out.println("Divisores menores que " + numero + ":");
        for (i = 1; i < numero; i++) {
            if (numero % i == 0) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}