#include <stdio.h>
#include <stdlib.h>
#include "aritmetica.h"

int main() {
 int x, y, z;
 char ch;

 printf("Digite uma operação matematica (+,-,*,/): ");
 ch = getchar();
 
 printf("Digite 2 numeros: ");
 scanf("%i %i", &x, &y);

 switch(ch) {
  case '+' : z = soma(x,y); break;
  case '-' : z = subtracao(x,y); break;
  case '*' : z = produto(x,y); break;
  case '/' : z = divisao(x,y); break;
  default: z = soma(x,y);
 }

 printf("Resultado: %i\n", z);

 return 0;
}
