import java.util.Scanner;

public class exer5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, soma;
        double media;
        
        System.out.print("Digite um valor inteiro: ");
        n = scanner.nextInt();
        
        soma = 0;

         for (int i = 1; i <= n; i++) {
            soma = soma + i;
        }       
        
        media = (double) soma / n;
       
        System.out.println("soma dos primeiros " + n + " números: " + soma);
        System.out.println("media dos primeiros " + n + " números: " + media);

        scanner.close();
    }
}
