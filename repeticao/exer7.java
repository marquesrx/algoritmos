import java.util.Scanner;

public class exer7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i, x;

        System.out.print("Digite um número x: ");
        x = scanner.nextInt();
        
        System.out.println("Números de 1 a 100 divisíveis por " + x + ":");

        for (i = 1; i <= 100; i++) {
            if (i % x == 0) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
}
