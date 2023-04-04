import java.util.*;

public class Ex16 {

    // Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser pintada. 
    // Considere que a cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00. 
    // Informe ao usuário a quantidades de latas de tinta a serem compradas e o preço total.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int tamanho, preco, latas, litros;

        System.out.println("Tamanho da área a ser pinta em m²: ");
        tamanho = sc.nextInt();
        
        litros = tamanho/3;

        if (tamanho % 54 == 0){
            latas = litros / 18;
            System.out.println(""+latas+" lata");
        }else{
            latas = (litros / 18) + 1;
            System.out.println(""+latas+" latas");
        }
        preco = latas * 80;

        System.out.println("Preço: R$ "+preco);

        sc.close();
   }
    
}
