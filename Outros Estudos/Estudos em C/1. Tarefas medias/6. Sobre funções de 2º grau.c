#include <stdio.h>

int main(void) {
  int a, b, c, delta;
  //leitura das variaveis acima
  printf("digite o valor de a:\n");
  scanf("%d",&a);
  printf("digite o valor de b:\n");
  scanf("%d",&a);
  printf("digite o valor de c:\n");
  scanf("%d",&a);
  //concavidade pra cima ou para baixo
  if(a>0) printf("função com concavidade voltada para baixo\n");
  if(a<0) printf("função com concavidade voltada para cima\n");
  //quantidade de raizes da função
  delta=-b+4*a*c;
  if(delta==0) printf("somente 1 raiz real");
  if(delta>0) printf("existem 2 raizes reais");
  if(delta<0) printf("nao existe raiz real");
  return 0;
}
