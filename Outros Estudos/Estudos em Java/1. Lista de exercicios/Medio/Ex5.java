class Main {
  public static void main(String[] args) {

    int[] A = new int[10];
    
    for(int i=0;i<A.length;i++){
      A[i] = i;
    }

    int[] B = A;

    for(int i=0; i<A.length; i++){
      System.out.println("O valor de A["+ (i+1) + "]: "+ A[i]);
    }

    System.out.println();
    
    for(int i=0; i<B.length; i++){
      System.out.println("O valor de B["+ (i+1) + "]:"+ B[i] * (i+1) );
    }

  }
}
