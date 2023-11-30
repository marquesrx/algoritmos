public class exer11 {
    public static void main(String[] args) {
        
        int i;

        System.out.println("numeros entre 500 e 2000 com resto da divisão por 11 igual a 5:");

        for (i = 500; i <= 2000; i++) {
            if (i % 11 == 5) {
                System.out.println(i);
            }
        }
    }
}
