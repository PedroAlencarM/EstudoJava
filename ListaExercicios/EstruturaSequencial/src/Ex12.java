import java.util.Scanner;

public class Ex12 {
    
    //Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double pesoIdeal=0, alt; 

        System.out.println("Digite sua altura: ");
        alt = sc.nextDouble();

        pesoIdeal = 72.7 * alt - 58;

        System.out.println("Seu peso Ideal é: "+pesoIdeal+"Kg");

        sc.close();
    }
}