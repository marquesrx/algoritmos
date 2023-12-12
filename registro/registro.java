import java.util.Scanner;

class PontoR2 {
    double x, y;

    // Construtor para inicializar um PontoR2
    public PontoR2(double x, double y) {
        this.x = x;
        this.y = y;
    }
}

class PontoR3 {
    double x, y, z;

    // Construtor para inicializar um PontoR3
    public PontoR3(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}

public class registro {

    // Função para calcular a distância entre dois pontos PontoR2
    public static double pontosDistancia(PontoR2 ponto1, PontoR2 ponto2) {
        return Math.sqrt(Math.pow(ponto2.x - ponto1.x, 2) + Math.pow(ponto2.y - ponto1.y, 2));
    }

    // Função para calcular o ponto médio entre dois pontos PontoR2
    public static PontoR2 pontosPontoMedio(PontoR2 ponto1, PontoR2 ponto2) {
        double medioX = (ponto1.x + ponto2.x) / 2;
        double medioY = (ponto1.y + ponto2.y) / 2;
        return new PontoR2(medioX, medioY);
    }

    // Função para calcular a distância entre dois pontos PontoR3
    public static double pontosDistanciaR3(PontoR3 ponto1, PontoR3 ponto2) {
        return Math.sqrt(Math.pow(ponto2.x - ponto1.x, 2) + Math.pow(ponto2.y - ponto1.y, 2) + Math.pow(ponto2.z - ponto1.z, 2));
    }

    // Função para calcular o ponto médio entre dois pontos PontoR3
    public static PontoR3 pontosPontoMedioR3(PontoR3 ponto1, PontoR3 ponto2) {
        double medioX = (ponto1.x + ponto2.x) / 2;
        double medioY = (ponto1.y + ponto2.y) / 2;
        double medioZ = (ponto1.z + ponto2.z) / 2;
        return new PontoR3(medioX, medioY, medioZ);
    }

    public static void main(String[] args) {
        // Exemplo de uso
        PontoR2 ponto2D1 = new PontoR2(1, 2);
        PontoR2 ponto2D2 = new PontoR2(4, 6);

        System.out.println("Distância entre os pontos PontoR2: " + pontosDistancia(ponto2D1, ponto2D2));

        PontoR2 pontoMedio2D = pontosPontoMedio(ponto2D1, ponto2D2);
        System.out.println("Ponto médio entre os pontos PontoR2: (" + pontoMedio2D.x + ", " + pontoMedio2D.y + ")");

        PontoR3 ponto3D1 = new PontoR3(1, 2, 3);
        PontoR3 ponto3D2 = new PontoR3(4, 6, 8);

        System.out.println("Distância entre os pontos PontoR3: " + pontosDistanciaR3(ponto3D1, ponto3D2));

        PontoR3 pontoMedio3D = pontosPontoMedioR3(ponto3D1, ponto3D2);
        System.out.println("Ponto médio entre os pontos PontoR3: (" + pontoMedio3D.x + ", " + pontoMedio3D.y + ", " + pontoMedio3D.z + ")");
    }
}
