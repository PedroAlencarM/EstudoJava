import java.util.Scanner;
public class Ex8 {

    //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    //Calcule e mostre o total do seu salário no referido mês.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora, horasT, salario = 0;

        System.out.println("Quanto voce ganha por hora?");
        hora = sc.nextInt();

        System.out.println("Quantas horas voce trabalhou esse mês?");
        horasT = sc.nextInt();

        salario = hora * horasT;

        System.out.printf("Seu salario esse mês será R$ %.1s", salario,".");

        sc.close();
    }
}
