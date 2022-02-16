#include <stdio.h>

int main(void) {
  char nome[30], genero[30];
  float peso;
  int idade, soma;
  for(int i=1;i<=7;i++){
    printf("\ndigite o %i nome:\n",i);
    scanf("%s",nome);
    printf("genero:\n");
    scanf("%s",genero);
    printf("peso:\n");
    scanf("%f",&peso);
    printf("idade:\n");
    scanf("%i",&idade);
    soma += idade;
  }
  printf("media: %i",soma/7);
}
