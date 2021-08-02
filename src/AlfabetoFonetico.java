import java.util.Scanner;

public class AlfabetoFonetico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a Palavra: ");
        String palavra = scanner.nextLine();
        String[] alfabetoFonetico = {"alpha", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel", "india", "juliett", "kilo", "lima", "mike",
                "november", "oscar", "papa", "quebec", "romeo", "sierra", "tango", "uniform", "victor", "whiskey", "x-ray", "yankee", "zulu"};
        String[] quebrarPalavra = new String[palavra.length()];

        for (int i = 0; i < palavra.length(); i++) {
            quebrarPalavra[i] = palavra.substring(i, (i + 1)).toUpperCase();

            for (int j = 0; j < alfabetoFonetico.length; j ++){
                if (alfabetoFonetico[j].substring(0, 1).toUpperCase().equals(quebrarPalavra[i])) {
                    System.out.println(quebrarPalavra[i] + " - " + alfabetoFonetico[j].toUpperCase());
                }
            }
        }
    }
}
