class Main {
  public static void main(String[] args) {

    int[] A = new int[9];
    A[0] = 1;
    A[1] = 2;
    A[2] = 3;
    A[3] = 4;
    A[4] = 5;
    A[5] = 6;
    A[6] = 7;
    A[7] = 8;
    A[8] = 9;

    int[] B = A;

    for(int i=0; i<A.length; i++){
      System.out.println("O valor de A["+ (i+1) + "]: "+ A[i]);
    }

    System.out.println();
    
    for(int i=0; i<B.length; i++){
      System.out.println("O valor de B["+ (i+1) + "]:"+ B[i]*2);
    }
    
  }
}
