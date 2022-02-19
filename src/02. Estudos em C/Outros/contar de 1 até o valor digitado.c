#include <stdio.h>

int main(void) {

  int qtd;

  printf("digitar quantidade de valores: ");
  scanf("%d", &qtd);

  int v[qtd];

  for (int i = 0; i < qtd; i++) {
    v[i] = i + 1;
  }

  for (int i = 0; i < qtd; i++) {
    printf("%d ", v[i]);
  }

  printf("\n");

  return 0;
}
