class Main {
  public static void main(String[] args) {

    double[] A = new double[15];
    
    for(int i=0;i<A.length;i++){
      A[i] = i;
    }

    double[] B = A;

    for(int i=0; i<A.length; i++){
      System.out.println("O valor de A["+ (i+1) + "]: "+ A[i]);
    }

    System.out.println();
    
    for(int i=0; i<B.length; i++){
      System.out.println("O valor de B["+ (i+1) + "]: " + Math.sqrt(B[i]));
    }

  }
}
