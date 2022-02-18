class Main {
  public static void main(String[] args) {

    // Cria vetor A
    double[] A = new double[10];
    // Preenche vetor A
    for(int i=0;i<A.length;i++){
      A[i] = i;
    }

    // Cria vetor B
    double[] B = new double[10];
    // Preenche vetor B
    for(int i=0;i<B.length;i++){
      B[i] = i;
    }

    // Exibe valores do vetor A e B
    for(int i=0; i<A.length; i++){
      System.out.println("Valor de A["+ (i+1) + "]: "+ A[i] +
      " | Valor de B["+ (i+1) + "]: " + B[i]);
    }

    // Cria vetor C
    double[] C = new double[10];
    // Preenche vetor C
    for(int i=0;i<C.length;i++){
      C[i] = A[i] * B[i];
    }

    // Pula uma linha
    System.out.println();
    // Exibe valores do vetor C
    for(int i=0; i<C.length; i++){
      System.out.println("O valor de C["+ (i+1) + "]: " + C[i]);
    }

  }
}
