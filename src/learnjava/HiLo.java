package learnjava;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Random rdm = new Random();
        String valorTentativa;
        Scanner sc = new Scanner(System.in);
        do {
            int numero = rdm.nextInt(11); //Esse valor é o máximo do range, tem que ser 1 a mais
            int tentativa = 0;
            while (tentativa != numero) {
                System.out.print("Adivinhe o valor: ");
                tentativa = sc.nextInt();
                if (tentativa < numero) {
                    System.out.println("Muito baixo, tente novamente");
                } else if (tentativa > numero) {
                    System.out.println("Muito alto, tente novamente");
                } else {
                    System.out.println("Você acertou, o valor era: " + numero);
                }
            }
            System.out.print("Deseja jogar novamente? S/n: ");
            valorTentativa = sc.next();
        } while (valorTentativa.equalsIgnoreCase("S"));
        System.out.println("Goodbye!");
        sc.close();
    }
}
