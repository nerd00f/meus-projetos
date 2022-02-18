import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // variaveis
    int n, cont = 0;
    
    // leitura de entradas do usuario
    Scanner sc = new Scanner(System.in);
    
    // imprimir em tela
    System.out.println("digitar o numero:");
    //atribuir valor
    n = sc.nextInt();
    // verificar e informar
    if(n<=1) System.out.println("Numero não aceito, deve ser maior que 1");
    else {
      for(int i=1;i<=n;i++){
        if(n%i==0) cont++;
      }
      if(cont==2) System.out.println("Numero primo");
      else System.out.println("Numero não primo");
    }

  }
}
