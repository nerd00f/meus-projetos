package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Positivo_ou_negativo {

  public static void main(String[] args) {
        // definir padrão us
        @SuppressWarnings("unused")
        Locale US = Locale.US;
        
        // variaveis
        int n;
        
        // leitura de entradas do usuario
        Scanner sc = new Scanner(System.in);
        
        // imprimir em tela
        System.out.println("digitar o numero:");
        //atribuir valor
        n = sc.nextInt();
        
        // verificar e informar
        if(n<0) System.out.println("o numero é negativo");
        else System.out.println("o numero é positivo");
        sc.close();
	}

}
