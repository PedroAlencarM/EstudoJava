import java.util.Scanner;

public class Ex10 {

    //Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double f=0, c=0;

        System.out.println("Digite a temperatura em Celsius: ");
        c = sc.nextDouble();


        f = c * 1.8 +32;


        System.out.print("A temperatura em Fahrenheit é "+f+" graus.");

        sc.close();
    }

}
