#include <stdio.h>
#include <stdlib.h>

void quickSort(int *ListaDeValores, int menorValor, int maiorValor) {

  int valor, guia = menorValor;

  // Ordenacao
  for (int i = menorValor + 1; i <= maiorValor; i++) {
    int j = i;
    if (ListaDeValores[j] < ListaDeValores[guia]) {
      valor = ListaDeValores[j];
      while (j > guia) {
        ListaDeValores[j] = ListaDeValores[j - 1];
        j--;
      }
      ListaDeValores[j] = valor;
      guia++;
    }
  }

  // Caso ainda nao ordenado, executar a funcao de novo
  if (guia - 1 >= menorValor)
    quickSort(ListaDeValores, menorValor, guia - 1);

  if (guia + 1 <= maiorValor)
    quickSort(ListaDeValores, guia + 1, maiorValor);
}

int main() {

  int tamanho = 5, ListaDeValores[] = {2, 5, 3, 4, 1};

  quickSort(ListaDeValores, 0, tamanho - 1);

  for (int i = 0; i < tamanho; i++) {
    printf("%i ", ListaDeValores[i]);
  }

  return 0;
}
