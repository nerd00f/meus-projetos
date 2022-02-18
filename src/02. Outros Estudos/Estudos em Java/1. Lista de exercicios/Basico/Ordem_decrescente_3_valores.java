package javaapplication1;

import java.util.Locale;
import java.util.Scanner;


public class JavaApplication1 {


    public static void main(String[] args) {
        // variaveis
        double a, b, c, maior=0,medio=0,menor=0;
        // definir padrão us
        Locale US = Locale.US;
        
        // leitura de entradas do usuario
        Scanner sc = new Scanner(System.in);
        
        // imprimir em tela
        System.out.println("digitar valor 1:");
        //atribuir valor
        a = sc.nextDouble();
        
        // imprimir em tela
        System.out.println("digitar valor 2:");
        //atribuir valor
        b = sc.nextDouble();
        
        // imprimir em tela
        System.out.println("digitar valor 3:");
        //atribuir valor
        c = sc.nextDouble();
        
        // identificar a maior
        if(a>b && a>c){
            maior = a;
        }
        if(b>a && b>c){
            maior = b;
        }
        if(c>b && c>a){
            maior = c;
        }
        
        // identificar a menor
        if(a<b && a<c){
            menor = a;
        }
        if(b<a && b<c){
            menor = b;
        }
        if(c<b && c<a){
            menor = c;
        }
        
        // identificar valor medio
        if(a<maior && a>menor){
            medio = a;
        }
        if(b<maior && b>menor){
            medio = b;
        }
        if(c<maior && c>menor){
            medio = c;
        }
        
        System.out.println("maior:"+maior+", medio:"+medio+", menor:"+menor);
        
        // liberar a memoria
        sc.close();
    }
    
}
