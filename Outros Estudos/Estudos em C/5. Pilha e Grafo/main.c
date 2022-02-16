/*
    ----------------------------------------------------------------------------------
    Objetivo do programa: Montar um programa que realiza a entrada de dados de duas 
    cidades e a partir de um grafo com 10 cidades, mostra na tela a menor distancia 
    entre as duas cidades. 
    ----------------------------------------------------------------------------------
*/

// ------ [ Declaracoes e funcoes necessarias para o calculo da distancia ] ------

// Bliblioteca de entrada e saida de dados
#include <stdio.h>
// Bliblioteca padrão da linguagem de programação C
#include <stdlib.h>
// Declara a constante infinito...
#define Infinito -1

// Define um Tipo inteiro
typedef int Tipo;

// Define a fila
Tipo *fila;

// Variaveis de operação
int s, t, N;

// Função que verifica se a fila esta vazia
int fila_vazia() { return (s == t); }

// Função que retorna a fila cheia
int fila_cheia() { return ((t + 1) % N == s); }

// Função que insere um elemento na fila
void insere_na_fila(Tipo x) {
  fila[t++] = x;
  if (t == N)
    t = 0;
}

// Função que remove um elemento da fila
Tipo remove_da_fila() {
  Tipo x = fila[s++];
  if (s == N)
    s = 0;
  return x;
}

// Função que inicia a fila
void inicializa_fila(int n) {
  // Aloca memoria do computador para armazenar a fila
  fila = malloc(n * sizeof(Tipo));

  N = n;
  s = t = 0;
}

// Finaliza a fila
void finaliza_fila() {
  /*
   *  Libera a memoria alocada
   *  e esvazia a fila
   */
  free(fila);
}

// Primeiro elemento
Tipo primeiro() {
  /*
   *  Retorna o primeiro
   *  elemento da fila
   */
  return fila[s];
}

// Ultimo elemento
Tipo ultimo() {
  /*
   *  Retorna o ultimo
   *  elemento da fila
   */
  return fila[t - 1];
}

/*
 *  Funcao que calcula a Distancia das cidades,
 *  representadas pelo valor 1 em um grafo.
 */
int *Calcula_Distancia(int Grafo[6][6], int n, int o) {
  /*
   *  Declara a variavel para armazenamento
   *  da distancia entre as duas cidades
   */
  int *distancia, x, y;

  /*
   *  Aloca memoria do computador para
   *  armazenar a distancia das cidades
   */
  distancia = malloc(n * sizeof(int));

  for (x = 0; x < n; x++)

    distancia[x] = Infinito;

  distancia[o] = 0;

  /*
   *  Chama a funcao que
   *  inicia a fila
   */
  inicializa_fila(n);

  /*
   *  Chama a funcao que
   *  insere um elemento na fila
   */
  insere_na_fila(o);

  /*
   *  Enquanto tiver elementos na fila,
   *  essa função sera executada
   */
  while (!fila_vazia()) {

    x = remove_da_fila();

    for (y = 0; y < n; y++)

      if (Grafo[x][y] && distancia[y] == Infinito) {
        distancia[y] = distancia[x] + 1;
        insere_na_fila(y);
      }
  }
  /*-----------------------------------*/

  finaliza_fila();

  return distancia;
}

// ------------[ Fim do calculo ]------------------------

/* ------------ Programa principal---------------------- */
int main() {
  /*
   * Grafo com as dez cidades
   * representadas pelo valor 1
   */
  int Grafo[6][6] = {
      {0, 1, 0, 0, 0, 0}, {0, 0, 1, 0, 1, 0}, {0, 0, 0, 0, 1, 1},
      {1, 1, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 0}, {0, 1, 1, 0, 1, 0},
  };

  // Variaveis das duas cidades
  int cidade1, cidade2;

  // Ponteiro que mede a distancia
  int *distancia;

  // Leitura das cidades
  printf("Digite o valor da primeira cidade:\n");
  scanf("%d", &cidade1);

  printf("Digite o valor da segunda cidade:\n");
  scanf("%d", &cidade2);
  // --------------------

  // Atribui o resultado do calculo da distancia na variavel
  distancia = Calcula_Distancia(Grafo, 6, 1);

  // Exibe na tela a distancia
  printf("Menor distancia entre %i e %i  = %i", cidade1, cidade2, distancia[5]);

  return 0;
}
/*-------------------------------------------------------------------------*/
