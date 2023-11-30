import java.util.Scanner;

public class exer9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaPares = 0, a, b, i;

        System.out.print("Digite o valor de a: ");
        a = scanner.nextInt();

        System.out.print("Digite o valor de b: ");
        b = scanner.nextInt();
        
        if (a > b) {
            System.out.println("Erro: a deve ser menor ou igual a b.");
            scanner.close();
            return;
        }

        for (i = a; i <= b; i++) {
            if (i % 2 == 0) {
                somaPares = somaPares + i;
            }
        }
        
        System.out.println("Soma dos números pares no intervalo [" + a + ", " + b + "]: " + somaPares);
        
        scanner.close();
    }
}
