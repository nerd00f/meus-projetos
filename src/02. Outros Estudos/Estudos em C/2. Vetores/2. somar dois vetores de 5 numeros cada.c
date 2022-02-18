#include <stdio.h>
#include <stdlib.h>

/* Criar algoritmo que leia os valores para dois vetores
(Arrays) chamados vetA e vetB com 5 números inteiros
cada e somar os vetores. (Obs.: Neste caso será
necessário criar um terceiro vetor) */

int main() {
  int soma = 0, vetA[5], vetB[5];
  for (int i = 1; i < 6; i++) {
    printf("digite o %d valor do vetor A:\n", i);
    scanf("%d", &vetA[i]);
    soma = soma + vetA[i];
  }
  for (int i = 1; i < 6; i++) {
    printf("digite o %d valor do vetor B:\n", i);
    scanf("%d", &vetB[i]);
    soma = soma + vetB[i];
  }
  printf("soma total: %d", soma);
  return 0;
}
