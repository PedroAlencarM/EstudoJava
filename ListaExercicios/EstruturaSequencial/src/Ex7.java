import java.util.Scanner;
public class Ex7 {

    //Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lado, dobro, area;

        System.out.print("Digite o área do quadrado: ");
        lado = sc.nextInt();

        area = lado * lado;
        dobro = area * 2;

        System.out.println("O valor da área do quadrado é: "+ area);

        System.out.println("O dobro da sua área é: "+ dobro);
        
        sc.close();
    }
}