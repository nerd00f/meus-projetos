#include <stdio.h>
#include <stdlib.h>

int main() {

  FILE *saida;

  char ch[] = "Linha 1\nLinha 2";

  if (!(saida = fopen("Novo.txt", "wb"))) {
    printf("Arquivo destino não pode ser aberto.\n");
    exit(1);
  }

  int i = 0;

  while (ch[i] != 0) {
    putc(ch[i], saida);
    i++;
  }

  fclose(saida);
}
