import java.util.Scanner;

public class Ex14 {
    // João Papo-de-Pescador, homem de bem, comprou um microcomputador para
    // controlar o rendimento diário de seu trabalho.
    // Toda vez que ele traz um peso de peixes maior que o estabelecido pelo
    // regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa
    // de R$ 4,00 por
    // quilo excedente. João precisa que você faça um programa que leia a variável
    // peso (peso de peixes) e calcule o excesso.
    // Gravar na variável excesso a quantidade de quilos além do limite e na
    // variável multa o valor da multa que João deverá pagar.
    // Imprima os dados do programa com as mensagens adequadas.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pesoPeixe, multa = 4, excesso = 0;

        System.out.println("Digite a quantidade de peixe em quilos:");
        pesoPeixe = sc.nextInt();

        excesso = pesoPeixe - 50;

        if (pesoPeixe <= 50){

            System.out.println("O peso foi de "+pesoPeixe+"Kg portanto não haverá multa");

        }else{

            multa *= excesso;
            System.out.printf("O excesso foi de %dKg e o valor da multa é de R$ %d", excesso, multa);
        }
        sc.close();
    }
}