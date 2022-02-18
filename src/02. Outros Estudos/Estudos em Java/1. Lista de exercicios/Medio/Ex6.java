class Main {
  public static void main(String[] args) {

    // Cria vetor A
    double[] A = new double[10];
    // Preenche vetor A
    for(int i=0;i<A.length;i++){
      A[i] = i;
    }
    // Cria e preenche vetor B
    double[] B = A;
    // Exibe valores do vetor A e B
    for(int i=0; i<A.length; i++){
      if(i+1==10){// If para melhor exibição do texto
      System.out.println("Valor de A["+ (i+1) + "]: "+ A[i] +
      " | Valor de B["+ (i+1) + "]: " + B[i]);
      } else
      System.out.println("Valor de A["+ (i+1) + "] : "+ A[i] +
      " | Valor de B["+ (i+1) + "] : " + B[i]);
    }
    // Cria vetor C
    double[] C = new double[10];
    // Preenche vetor C
    for(int i=0;i<C.length;i++){
      C[i] = A[i] + B[i];
    }
    // Pula uma linha
    System.out.println();
    // Exibe valores do vetor C
    for(int i=0; i<C.length; i++){
      System.out.println("O valor de B["+ (i+1) + "]: " + C[i]);
    }

  }
}
