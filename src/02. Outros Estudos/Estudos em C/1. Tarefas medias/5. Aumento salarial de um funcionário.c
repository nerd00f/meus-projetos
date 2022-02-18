#include <stdio.h>
/*2010 recebe R$ 1000,00
2011 recebeu aumento de 1,5%
A partir de 2012 o aumento corresponde ao dobro do percentual anual anterior determine o salario atual*/
int main(void) {
  double salario=1000, percentual=0.015;
  printf("salario de 2010: %.2lf\n", salario);
  salario = salario + (salario * percentual);
  printf("salario de 2011: %.2lf\n", salario);
  for(int i=2012;i<=2019;i++){
  printf("salario de %d",i);
  printf(": %.2f\n",salario += salario *(percentual*2) );
  } 
  return 0; 
}
