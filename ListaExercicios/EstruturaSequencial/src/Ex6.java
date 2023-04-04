import java.util.Scanner;
public class Ex6 {

    //Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int raio, area;

        System.out.print("Digite o raio do circulo: ");
        raio = sc.nextInt();

        area = 3 * (raio*raio);

        System.out.println("O valor da Aréa do circulo é: "+ area);

        sc.close();
    }
}
