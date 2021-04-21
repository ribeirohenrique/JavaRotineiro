import java.text.Normalizer;

public class RegexTest {

    public static String trataNomeArquivo(String nomeArquivo) {
        return Normalizer.normalize(nomeArquivo, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").toUpperCase();
    }

    public static void main(String[] args) {
        String str1 = "This# string% contains^ special* charaçcters&.";
        str1 = str1.replaceAll("[^a-zA-Z0-9 ]", "");
        System.out.println(str1);

        System.out.println(trataNomeArquivo("Teste do Çapetá que não come purê com cação"));
        final String input = "Tĥïŝ ĩš â fůňķŷ Šťŕĭńġ - - - - Teste de Çabedoriá que não come purê com cação - - - - TAMPA RELAÇÃO";
        System.out.println(Normalizer.normalize(input, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").toUpperCase());

        String str4 = "12341234   E_2W";
        String str5 = "12341234SDFASDF_2W";
        String str6 = "1234123123123123123123123123123dfhdfghdfgh_4W";
        String str7 = "1234 E_3W";

        System.out.println(str4.replaceAll("\\_([^_]+)$", ""));
        System.out.println(str5.replaceAll("\\_([^_]+)$", ""));
        System.out.println(str6.replaceAll("\\_([^_]+)$", ""));
        System.out.println(str7.replaceAll("\\_([^_]+)$", ""));

    }
}
