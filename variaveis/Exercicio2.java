/*
1. Crie uma variável que armazena o valor de uma laranja;
2. Crie uma variável que informa o valor de uma uva;
3. Some o valor da laranja com a uva;
*/
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner iscaner = new Scanner(System.in);
        // Escreva seu código aqui ⬇️ ✌       
        System.out.println("Valor da Laranja: R$");
        double laranja = iscaner.nextDouble();

        
        System.out.println("Valor da Uva: R$");
        double uva = iscaner.nextDouble();

        double laranjaComUva = laranja + uva;
        System.out.println("Os Valores somados dão este valor: " + laranjaComUva);
        
        // recebam duas idades, faça a soma e imprima
        System.out.println();

        System.out.println("insira a primeira idade: ");
        int idade1 = iscaner.nextInt();

        System.out.println("insira a segunda idade: ");
        int idade2 = iscaner.nextInt();

        int soma = idade1 + idade2;
        System.out.println("a soma das duas idades é: " + soma);
    }
}
