// Anotações
/*
A primeira lista deve conter estes valores, de 12 a 19

S1 = 12
     14
     15
     ...
     19

Apos isso imprima na tela: passo dois

Enquanto a pilha não estiver vazia faça isso:

- remova o elemento igual ao contador
da pilha

- se o valor do contador atual for par
adiciona na segunda pilha

Apos isso imprima na tela: final
*/

// Bibliotecas necessarias ao programa
#include <stdio.h>
#include <stdlib.h>

// Cria um no de lista(pilha)
struct Node {
  int num;           // vai guardar um valor
  struct Node *prox; // aponta para o proximo no
};
typedef struct Node node; // define o tipo de estrutura

// Variavel que armazena o tamanho
int tam;

// Contador da pilha S1
int valor;

// Faz a chamada das funções
int menu(void);
void inicia(node *PILHA);
void inicia(node *PILHA2);
void opcao(node *PILHA, int op, node *PILHA2);
void exibe(node *PILHA);
void libera(node *PILHA);
void push(node *PILHA);
node *pop(node *PILHA);

// Funcao principal
int main(void) {

  // Cria a pilha S1
  node *PILHA = (node *)malloc(sizeof(node));
  // Cria a pilha S2
  node *PILHA2 = (node *)malloc(sizeof(node));

  // Verifica memoria do computador
  if (!PILHA) {
    printf("Sem memoria disponivel!\n");
    exit(1);
  }

  else {
    inicia(PILHA);
    inicia(PILHA2);

    int opt;

    opt = menu();
    opcao(PILHA, opt, PILHA2);

    free(PILHA);

    printf("Pilha S2: ");
    exibe(PILHA2);
    printf("\nFinal\n");

    return 0;
  }
}

int menu(void) {
  // Guarda o valor que será digitado
  int opt;

  // Exibir o menu de opções
  printf("Escolha a opcao\n");
  printf("1. Zerar PILHA\n");
  printf("2. Exibir PILHA\n");
  printf("3. Adicionar elemento\n");
  printf("4. Remover elemento\n");

  // Lê a opção escolhida
  opt = 3;

  // Retorna a opção
  return opt;
}

// Funcao verifica escolha do menu
void opcao(node *PILHA, int op, node *PILHA2) {

  node *tmp;

  // -- Verifica a opcao escolhida
  if (op == 3) {

    // Adiciona os valores na pilha S1
    for (valor = 12; valor <= 19; valor++) {
      push(PILHA);

      system("clear");
      system("cls");
      printf("\n---------------\n");

      printf("Pilha S1: ");
      exibe(PILHA);
    }

    printf("\nPasso dois\n\n");
    printf("Pilha S1: ");
    exibe(PILHA);
  }

  // Remove os valores da pilha S1
  for (valor = 19; valor >= 12; valor--) {
    // caso valor par
    if (valor % 2 == 0) {
      push(PILHA2);
    }

    tmp = pop(PILHA);
    if (tmp != NULL)
      printf("Pilha S1: ");
    exibe(PILHA);
  }
}

// Função que inicia a lista(pilha)
void inicia(node *PILHA) {
  PILHA->prox = NULL;
  tam = 0;
}

// Função que verifica se a lista(pilha) esta vazia
int vazia(node *PILHA) {
  if (PILHA->prox == NULL)
    return 1;
  else
    return 0;
}

// Função que adiciona elementos na lista(pilha)
node *aloca() {

  node *novo = (node *)malloc(sizeof(node));

  if (!novo) {
    printf("Sem memoria disponivel!\n");
    exit(1);
  }

  else {
    novo->num = valor;
    return novo;
  }
}

// Função que retorna a lista(pilha)
void exibe(node *PILHA) {

  // Caso a pilha esteja vazia
  if (vazia(PILHA)) {
    // Exibir na tela
    printf(" PILHA vazia!\n\n");
    return;
  }

  node *tmp;
  tmp = PILHA->prox;

  while (tmp != NULL) {
    printf("%3d", tmp->num);
    tmp = tmp->prox;
  }

  printf("\n");
}

// Funcao que libera a lista(pilha)
void libera(node *PILHA) {
  if (!vazia(PILHA)) {
    node *proxNode, *atual;
    atual = PILHA->prox;

    while (atual != NULL) {
      proxNode = atual->prox;
      free(atual);
      atual = proxNode;
    }
  }
}

// Função que adiciona elementos na pilha(lista)
void push(node *PILHA) {

  node *novo = aloca();
  novo->prox = NULL;

  // em caso de pilha vazia
  if (vazia(PILHA)) {
    PILHA->prox = novo;
  }

  // caso contrario
  else {
    node *tmp = PILHA->prox;
    while (tmp->prox != NULL)
      tmp = tmp->prox;
    tmp->prox = novo;
  }

  tam++;
}

// Função que remove elementos da pilha(lista)
node *pop(node *PILHA) {
  // Caso o proximo elemento for vazio
  if (PILHA->prox == NULL) {
    // Exiba "Pilha ja vazia"
    printf("Pilha ja vazia\n\n");
    return NULL;
  }

  // Caso contrario
  else {
    // Remova o ultimo elemento adicionado
    node *ultimo = PILHA->prox, *penultimo = PILHA;

    while (ultimo->prox != NULL) {
      penultimo = ultimo;
      ultimo = ultimo->prox;
    }

    penultimo->prox = NULL;
    tam--;
    return ultimo;
    //--------------------------------------
  }
}
