import java.util.Scanner;
public class Ex5 {

    //Faça um Programa que converta metros para centímetros

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int metros, cent;

        System.out.println("Digite o valor em metros: ");
        metros = sc.nextInt();

        cent = metros * 100;

        System.out.println("O valor em centimetros é: "+cent+" centimetros");

        sc.close();
    }
}
