import java.util.Scanner;

public class exer6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, soma, contador, i;
        double media;

        System.out.print("Digite o valor de a: ");
        a = scanner.nextInt();

        System.out.print("Digite o valor de b: ");
        b = scanner.nextInt();
       
        if (a > b) {
            System.out.println("Erro: a deve ser menor ou igual a b.");
            scanner.close();
            return;
        }
        
        soma = 0;
        contador = 0;
       
        i = a;
        while (i <= b) {
            soma = soma + i;
            contador++;
            i++;
        }
        
        media = (double) soma / contador;
       
        System.out.println("Soma dos números no intervalo [" + a + ", " + b + "]: " + soma);
        System.out.println("Média dos números no intervalo [" + a + ", " + b + "]: " + media);
        
        scanner.close();
    }
}
