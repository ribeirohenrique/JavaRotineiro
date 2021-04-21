import java.util.Random;
import java.util.Scanner;

public class ExercitandoArray {
    public static void main(String[] args) {
        //Aqui será declarado um novo array de Strings chamado "nomes"
        String[] nomes;


        //Aqui será declarado um novo array de Strings chamado "carros" e com valores já definidos
        String[] carros = {"Tesla", "BMW", "Ford", "Mazda"};

        //Aqui será declarado um novo array de numeros inteiros chamado "numeros"
        int[] numeros;

        //Aqui será declarado um novo array de numeros inteiros chamado "notas" e com valores já definidos
        int[] notas = {10, 8, 5, 3, 1};

        //Aqui será impresso o valor na tela referente à posição 1 do array de carros
        System.out.println("Posição 2 do array de carros: " + carros[1]);
        System.out.println("-------------------");

        //Aqui será impresso o valor na tela referente à posição 5 do array de notas
        System.out.println("Posição 4 do array de notas: " + notas[3]);
        System.out.println("-------------------");

        //Mudando o valor de um elemento específico do array
        carros[1] = "Volkswagen";
        System.out.println("Posição 2 atualizada do array de carros: " + carros[1]);
        System.out.println("-------------------");

        //Saber o tamanho do array criado
        System.out.println("Tamanho do array carros: " + carros.length);
        System.out.println("Tamanho do array notas: " + notas.length);
        System.out.println("-------------------");

        //Fazendo um loop para percorrer um array
        for (int i = 0; i < carros.length; i++) {
            System.out.println("Posição " + i + " do array Carros: " + carros[i]);
        }
        System.out.println("-------------------");

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Posição " + i + " do array Notas: " + notas[i]);
        }
        System.out.println("-------------------");

        //Fazendo um loop para percorrer arrays usando For-Each (para cada)
        //Leia-se: Para cada elemento String (chamado i - como indexador) em carros, escreva o valor de i
        for (String i : carros) {
            System.out.println("Array Carros usando For-Each: " + i);
        }
        System.out.println("-------------------");

        //Fazendo um loop para percorrer arrays usando For-Each (para cada)
        //Leia-se: Para cada elemento int (chamado i - como indexador) em notas, escreva o valor de i
        for (int i : notas) {
            System.out.println("Array Notas usando For-Each: " + i);
        }
        System.out.println("-------------------");

        /*
        Exemplo de Array bidimensional, que cria mais de um array e é acessado como um jogo de batalha naval
        precisa informar o primeiro valor para o array desejado e o outro valor para o elemento dentro do array desejado
        No exemplo ele acessa o terceiro elemento (2) no segundo array (1) de meusValores
        */

        int[][] meusValores = {{1, 2, 3, 4}, {5, 6, 7}};
        int x = meusValores[1][2];
        System.out.println("Valor 2 do array 1: " + x);
        System.out.println("-------------------");

        //Exemplo de for para arrays bidimensionais, é necessário fazendo um dentro do outro (mas ainda deve apontar os dois indexadores
        int[][] arrayLoop = {{1, 2, 3, 4}, {5, 6, 7}};
        for (int i = 0; i < arrayLoop.length; ++i) {
            for (int j = 0; j < arrayLoop[i].length; ++j) {
                System.out.println("Valor encontrado no array " + i + " e indexador " + j + ": " + arrayLoop[i][j]);
            }
        }
        System.out.println("-------------------");

        //Entrada de dados pelo usuario alimentando um array e posteriormente exibindo os valores
        Scanner entrada = new Scanner(System.in);
        Random dadoRandom = new Random();
        int[] valoresDigitados = new int[5];
        for (int i = 0; i < valoresDigitados.length; i++) {
            valoresDigitados[i] = dadoRandom.nextInt(11);
        }

        for (int i : valoresDigitados) {
            System.out.println("Valor registrado através do For-Each: " + i);
        }
        System.out.println("-------------------");
        System.out.println("O Tamanho do array valoresDigitados é: " + valoresDigitados.length);



    }
}
