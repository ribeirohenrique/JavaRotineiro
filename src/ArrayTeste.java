import java.util.Arrays;

public class ArrayTeste {
    public static void main(String[] args) {
        String string = "This|is|a|string";
        System.out.println(string);

        String[] words = string.split("\\|");
        System.out.println(Arrays.toString(words));
        System.out.println(words[1]);

        String[][] wordsArray = new String[words.length][];
        for (int i = 0; i < words.length; i++)
            wordsArray[i] = new String[]{words[i]};
        System.out.println(Arrays.deepToString(wordsArray));

        String teste1 = "0123";
        String teste2 = "0120";
        String teste3 = "0100";
        String teste4 = "0011";
        String teste5 = "0901";
        String teste6 = "0800";

        int intFinal = Integer.parseInt(teste4) % 2;
        System.out.println("O valor é: " + teste1 + " e o resto da visão por 2 é: " + intFinal);
        if (intFinal == 0) {
            System.out.println("Sou zero");
        }
    }
}
