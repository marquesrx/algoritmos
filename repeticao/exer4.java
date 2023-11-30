
import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k, resultado, i;

        System.out.print("Digite um número para a tabuada: ");
        k = scanner.nextInt();

        
        System.out.println("Tabuada do " + k + ":");

        for (i = 1; i <= 20; i++) {
            resultado = k * i;
            System.out.println(k + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
}