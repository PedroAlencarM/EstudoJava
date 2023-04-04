import java.util.Scanner;

public class Ex2 {

    //Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;

        System.out.println("Digite um numero:");
        n = sc.nextInt();

        System.out.println("O numero informado foi " + n);

        sc.close();

    }
}
