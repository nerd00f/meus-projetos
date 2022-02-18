import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    for(;;){
      System.out.println("Digite um valor:");
      n = sc.nextInt();
      if(n<1) return;
      System.out.println("Valor digitado: "+n);
      System.out.println("Quadrado do valor: "+n*n);
      System.out.println("Cubo do valor: "+n*n*n);
      System.out.println("Raiz quadrada do valor: "+Math.sqrt(n));

    }
  }
}
