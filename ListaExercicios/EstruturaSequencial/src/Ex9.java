import java.util.Scanner;

public class Ex9 {

    //Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
    //C = 5 * ((F-32) / 9).

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double f, c;

        System.out.println("Digite a temperatura em Fahrenheit: ");
        f = sc.nextDouble();

        c = 5 * ((f-32) / 9);


        System.out.printf("A temperatura em Celsius é ",c," graus.");

        sc.close();
    }

}