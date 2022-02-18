package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Produto_mais_barato {
	
  public static void main(String[] args) {
        // definir padrão us
        @SuppressWarnings("unused")
        Locale US = Locale.US;
        
        // variaveis
        int p1, p2, p3;
        
        // leitura de entradas do usuario
        Scanner sc = new Scanner(System.in);
        
        // imprimir em tela
        System.out.println("digite o primeiro produto:");
        //atribuir valor
        p1 = sc.nextInt();
        
        // imprimir em tela
        System.out.println("digite o segundo produto:");
        //atribuir valor
        p2 = sc.nextInt();
        
        // imprimir em tela
        System.out.println("digite o terceiro produto:");
        //atribuir valor
        p3 = sc.nextInt();
        
        // calcular e informar o resultado
        if(p1<=p2 && p1<=p3) System.out.printf("o produto mais barato é o 1º");
        if(p2<=p1 && p2<=p3) System.out.printf("o produto mais barato é o 2º");
        if(p3<=p1 && p3<=p2) System.out.printf("o produto mais barato é o 3º");

        // fechar scanner
        sc.close();
	}
}
