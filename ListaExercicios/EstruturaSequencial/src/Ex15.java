import java.util.Scanner;

public class Ex15 {
    // Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que 
    // são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
    // salário bruto.
    // quanto pagou ao INSS.
    // quanto pagou ao sindicato.
    // o salário líquido.
    // calcule os descontos e o salário líquido, conforme a tabela abaixo:
    // + Salário Bruto : R$
    // - IR (11%) : R$
    // - INSS (8%) : R$
    // - Sindicato ( 5%) : R$
    // = Salário Liquido : R$
    // Obs.: Salário Bruto - Descontos = Salário Líquido.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double hora, horasT, salarioBruto = 0, salarioLiquido, inss, impostoDeRenda, sindicato;

        System.out.println("Quanto voce ganha por hora?");
        hora = sc.nextInt();
        System.out.println("Quantas horas voce trabalhou esse mês?");
        horasT = sc.nextInt();

        salarioBruto = hora * horasT;
        impostoDeRenda = salarioBruto * 0.11;
        inss = salarioBruto * 0.08;
        sindicato = salarioBruto * 0.05;
        salarioLiquido = salarioBruto - impostoDeRenda - inss - sindicato; 
    
        System.out.printf("Salario Bruto: R$ %.2f\n", salarioBruto);
        System.out.printf("Pago ao INSS: R$ %.2f\n", inss);
        System.out.printf("Imposto de renda: R$ %.2f\n", impostoDeRenda);
        System.out.printf("Pago ao sindicato R$ %.2f\n", sindicato);
        System.out.printf("Salário liquido: R$ %.2f\n", salarioLiquido);
    
        sc.close();
    }
}
