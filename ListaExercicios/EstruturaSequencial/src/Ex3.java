import java.util.Scanner;

public class Ex3 {

    // Faça um Programa que peça dois números e imprima a soma.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0, i, soma = 0;

        for (i = 1; i <= 2; i++) {
            System.out.println("Digite " + i + "° numero:");
            n = sc.nextInt();

            soma += n;
          
        }
        sc.close();
        System.out.println("A soma é " + soma);  
    } 
}
