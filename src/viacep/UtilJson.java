package viacep;

import java.io.BufferedReader;
import java.io.IOException;

public class UtilJson {
    public static String converteJsonEmString(BufferedReader bufferedReader) throws IOException {
        String resposta;
        StringBuilder jsonEmString = new StringBuilder();
        while ((resposta = bufferedReader.readLine()) != null) {
            jsonEmString.append(resposta);
        }
        return jsonEmString.toString();
    }
}
