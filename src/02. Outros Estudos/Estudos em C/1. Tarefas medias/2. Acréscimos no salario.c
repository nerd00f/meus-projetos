#include <stdio.h>

int main(void) {
  double salario, salarioMinimo=998;
  printf("digite o salario: ");
  scanf("%lf", &salario);
  /*----------------Condicões--------------------------------------------
  * Se salário for igual a um salário mínimo atual, acrescente a ele 20%.
  * Se salário for maior que um salário mínimo, acrescente 10%.
  ----------------------------------------------------------------------*/
  if(salario == salarioMinimo) salario = salario + salario * 0.20;
  if(salario > salarioMinimo) salario = salario + salario * 0.10;
  printf("Valor total: %.2lf", salario);
  return 0;
}
