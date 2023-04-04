import java.util.Scanner;

public class Ex11 {

    //Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
    //A. o produto do dobro do primeiro com metade do segundo .
    //B. soma do triplo do primeiro com o terceiro.
    //C. o terceiro elevado ao cubo.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, a, b;
        float n3, c;

        System.out.println("Digite o 1° numero: ");
        n1 = sc.nextInt();

        System.out.println("Digite o 2° numero: ");
        n2 = sc.nextInt();

        System.out.println("Digite o 3° numero: ");
        n3 = sc.nextFloat();

        a = n1 * 2 * (n2/2);

        b = (n1 * 3) + n3;

        c = n3*n3*n3;

        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
   

        sc.close();

    }
}
