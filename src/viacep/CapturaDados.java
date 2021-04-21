package viacep;

import java.util.Scanner;

public class CapturaDados {
    public static void main(String[] args) throws Exception {

        Scanner dado = new Scanner(System.in);
        System.out.print("Digite seu CEP: ");
        String cep = dado.nextLine(); //Captura o Cep e armazena na variavel
        Endereco endereco = ServicoDeCep.buscaEnderecoPelo(cep); //Em seguida a variavel cep é inserida no objeto endereco que chama a ServicoDeCep

        System.out.println("Logradouro: " + endereco.getLogradouro());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Localidade: " + endereco.getLocalidade());

    }
}
