import java.util.Scanner;
public class Ex4 {

    //Faça um Programa que peça as 4 notas bimestrais e mostre a média.
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);

        double n, soma=0, media;

        for(int i = 1; i <= 4; i++){
            System.out.println("Digite a "+i+"° nota bimestral: ");
            n = sc.nextDouble();

            soma += n;
        }

        media = soma/4;

        System.out.printf("A media das 4 notas é de: %.1f ", media);
        
        sc.close();
    }
}