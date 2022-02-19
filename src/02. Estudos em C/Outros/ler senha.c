#include <stdio.h>
#include <string.h>

int main() {
  char senha[7];
  scanf("%s", senha);
  if (strcmp(senha, "senha") == 0) {
    printf("senha aceita\n");
  } else
    printf("senha incorreta\n");
}
