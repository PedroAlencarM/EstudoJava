import java.util.Scanner;

public class Ex13 {

    // Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo
    // que calcule seu peso ideal, utilizando as seguintes fórmulas:
    // Para homens: (72.7*h) - 58
    // Para mulheres: (62.1*h) - 44.7

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char letra;
        double pesoIdeal = 0, alt = 0;

        System.out.println("Digite M para o sexo maculino e F para o sexo feminino:");
        letra = sc.next().charAt(0);
        System.out.println("Digite sua altura: (Ex: 1,70)");
        alt = sc.nextDouble();

        if (letra == 'm')

            pesoIdeal = (72.7 * alt) - 58;

        else if (letra == 'f')

            pesoIdeal = (62.1 * alt) - 44.7;

        System.out.printf("Seu peso Ideal é: %.1f Kg",pesoIdeal);
        sc.close();

    }
}
