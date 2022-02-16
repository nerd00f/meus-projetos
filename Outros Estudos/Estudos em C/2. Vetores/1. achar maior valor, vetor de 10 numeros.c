#include <stdio.h>
#include <stdlib.h>

/* Criar um vetor (Array) chamado A com 10 números
inteiros, formular um algoritmo que determine o maior
elemento deste array. */

int main() {
  int vet[10] = {1, 8, 300, 98, 201, 127, 83, 7, 29, 88};
  int m = 0, i;
  for (i = 0; i < 10; i++) {
    if (vet[i] > m)
      m = vet[i];
  }
  printf("o maior: %d", m);
  return 0;
}
