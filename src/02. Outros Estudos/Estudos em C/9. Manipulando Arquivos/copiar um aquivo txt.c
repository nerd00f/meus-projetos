#include <stdio.h>
#include <stdlib.h>

int main() {

  FILE *entrada, *saida;

  char ch;

  // arquivo que sera copiado
  if (!(entrada = fopen("Original.txt", "rb"))) {
    printf("arquivo de origem não achado.\n");
    exit(1);
  }

  // arquivo clone
  if (!(saida = fopen("Copia.txt", "wb"))) {
    printf("Arquivo destino não pode ser aberto.\n");
    exit(1);
  }

  // faz a copia o arquivo
  while (!feof(entrada))
    putc(getc(entrada), saida);

  fclose(entrada);
  fclose(saida);
}
