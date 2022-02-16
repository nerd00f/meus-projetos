#include <stdio.h>  // printf e scanf
#include <stdlib.h> // prompt
#include <string.h> // string

/* a lista */
int main() {
  char lista[1000] = "lista vazia";
  printf("_______________Bem vindo a sua lista_________________\n");
  printf("%s\n", lista);
  printf("_____________________________________________________\n");
  printf("Para editar a lista digite a senha: ");
  char senha[7];
  char dig[1000];
  int i = 0;
  scanf("%s", senha);
  if (strcmp(senha, "projeto") == 0) {
    printf(" editar a lista: /editar\n ver a lista: /lista\n");
    do {
      scanf("%s", dig);
      if (strcmp(dig, "/lista") == 0) {
        printf("---->%s\n", lista);
      }
      if (strcmp(dig, "/editar") == 0) {
        printf("digite o item a ser adicionado:\n");
        scanf("%s", dig);
        printf("item adicionado\n");
        strcpy(lista, dig);
        printf("%s\n", lista);
      }
    } while (i == 0);
  }
}
