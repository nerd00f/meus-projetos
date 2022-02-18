#include <stdio.h>
#include <stdlib.h>

/* Programa que lê as temperaturas dos dias da semana,
e armazenar em um vetor e verifica em quantos dias essa
temperatura foi maior que 15 graus. */

int main() {
  int dias = 0, vet[5];
  for (int i = 0; i < 8; i++) {
    printf("digite a temperatura em graus do dia %i:\n", i);
    scanf("%d", &vet[i]);
    if (vet[i] > 15)
      dias = dias + vet[i];
  }
  printf("dias em que a temperatura excedeu 15 graus:%d\n", dias);
}
