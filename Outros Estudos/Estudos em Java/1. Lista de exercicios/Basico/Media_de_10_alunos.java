// Objetivo: Faça um programa em Java 
// que calcule a média de 3 notas de 10 alunos.

// Importação do leitor 
// de variaveis (Scanner)
import java.util.Scanner;

// Programa
class Main {
  public static void main(String[] args) {
      // Instancia do Scanner
      Scanner sc = new Scanner(System.in);
      // Loop para os 10 alunos
      for(int i=1; i<=10; i++) {
        System.out.println();
        System.out.println("Notas do " + i + "º Aluno:");
        // Loop para as 3 notas de cada aluno
        System.out.println("1 ª nota:");
        int n1 = sc.nextInt();
        System.out.println("2 ª nota:");
        int n2 = sc.nextInt();
        System.out.println("3 ª nota:");
        int n3 = sc.nextInt();
        // Calculo da media
        int media = (n1 + n2 + n3)/3;
        System.out.println("Media do " + i + "º Aluno :" + media);
      }
      // Fecha o Scanner
      sc.close();
  }
}
// Fim do programa
