import java.util.Random;

public class TesteWhile {
    public static void main(String[] args) {
        Random r1 = new Random();
        int valor = r1.nextInt((2 - 0) + 1) + 0;
        int contador = 0;
        System.out.println("Valor gerado: " + valor);
        while (valor > 0) {
            contador++;
            System.out.println("Contou o valor. O contador está em: " + contador);
            if (valor != 0) {
                break;
            }
        }
    }
}
