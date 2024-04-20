/*
1. Crie uma variável que informa a primeira letra do seu nome;
2. Crie uma variável que informa a sua idade;
3. Crie uma variável informando se você tomou café da manhã;
*/

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Escreva seu código aqui ⬇️
        char letraNome = 'L';
        System.out.println("Primeira letra do nome: " + letraNome);
    

        int idade = 16;
        System.out.println("Idade: " + idade);
        

        double alturaMetros = 1.79;
        System.out.println("Altura: " + alturaMetros);


        boolean tomouCafe = true;
        System.out.println("Tomou? " + tomouCafe);

    
    }
}
