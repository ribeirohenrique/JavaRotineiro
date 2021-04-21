package viacep;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServicoDeCep {

    static String webService = "http://viacep.com.br/ws/"; //URL Fixa da API
    static int codigoSucesso = 200; //Código de retorno

    public static Endereco buscaEnderecoPelo(String cep) throws Exception {
        String urlParaChamada = webService + cep + "/json"; //Monta a url pra passar

        try {
            URL url = new URL(urlParaChamada); //Cria um objeto URL
            HttpURLConnection conexao = (HttpURLConnection) url.openConnection(); //Faz a conexão

            if (conexao.getResponseCode() != codigoSucesso)
                throw new RuntimeException("HTTP error code: " + conexao.getResponseCode()); //Se receber diferente de codigoSucesso, ele joga um erro

            BufferedReader resposta = new BufferedReader(new InputStreamReader((conexao.getInputStream()))); //Pega a resposta da API
            String jsonEmString = UtilJson.converteJsonEmString(resposta); //Conversor do Json

            Gson gson = new Gson(); //Transforma Json em String
            Endereco endereco = gson.fromJson(jsonEmString, Endereco.class);
            return endereco;

        } catch (Exception e) {
            throw new Exception("Erro: " + e);
        }
    }
}
