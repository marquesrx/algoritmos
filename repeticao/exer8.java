import java.util.Scanner;

public class exer8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite um número x para calcular o fatorial: ");
        int x = scanner.nextInt();
        int fatorial = 1;          

        if (x < 0) {
            System.out.println("O numero não pode ser negativo, tente novamente.");
        } else {
            for (int i = 1; i <= x; i++) {
                fatorial = fatorial * i;
            }
            
            System.out.println("Fatorial de " + x + ": " + fatorial);
        }
        
        scanner.close();
    }
}
