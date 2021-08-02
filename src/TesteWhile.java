import java.util.Random;

public class TesteWhile {
    public static void main(String[] args) {
        Random r1 = new Random();
        int valor = r1.nextInt((2) + 1);
        int contador = 0;
        System.out.println("Valor gerado: " + valor);
        while (valor > 1) {
            contador++;
            System.out.println("Contou o valor. O contador está em: " + contador);
            break;
        }
    }
}
