#include <stdio.h>

int main(void) {
  float a, b;
  printf("Ola por favor digite o valor das variaveis\n");
  printf("a: ");
  scanf("%f", &a);
  printf("b: ");
  scanf("%f", &b);

  printf("o valor da raiz(x) eh: %.2f", -b/a );
  return 0;
}
