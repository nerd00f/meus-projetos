#include <stdio.h>

int main(void) {
  char nome[60], curso[26];
  int periodo, nota1, nota2, media;
  //Leitura das variaveis acima
  for(int i=1;i<=10;i++){
    printf("digite o %i nome:\n",i);
    scanf("%s",nome);
    printf("digite o periodo:\n");
    scanf("%d", &periodo);
    printf("digite o curso:\n");
    scanf("%s",curso);
    printf("digite a 1ª nota:\n");
    scanf("%d", &nota1);
    printf("digite a 2ª nota:\n");
    scanf("%d", &nota2);
  //Calculo da media
  media =(nota1 + nota2)/2;
  printf("media do aluno: %d\n", media);
  //--------Criterios de aprovação---------
  //Considere aprovado acima ou igual a 70,
  //Reprovado abaixo de 40 e
  //Prova final 40 a 69
  if(media>=7) printf("Aprovado\n");
  if(media<6.9 && media>=4) printf("Prova final\n");
  if(media<4) printf("Reprovado\n");
  }
  return 0;
}
