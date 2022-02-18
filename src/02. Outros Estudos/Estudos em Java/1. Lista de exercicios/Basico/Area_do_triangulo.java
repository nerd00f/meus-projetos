package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Area_do_triangulo {
	
  public static void main(String[] args) {
        // definir padrão us
        @SuppressWarnings("unused")
        Locale US = Locale.US;
        
        // variaveis
        double base, altura;
        
        // leitura de entradas do usuario
        Scanner sc = new Scanner(System.in);
        
        // imprimir em tela
        System.out.println("digite a base:");
        //atribuir valor
        base = sc.nextInt();
        
        // imprimir em tela
        System.out.println("digite a altura:");
        //atribuir valor
        altura = sc.nextInt();
        
        // calcular
        System.out.printf("resultado: " + (base*altura)/2 );
        sc.close();
	}
}
