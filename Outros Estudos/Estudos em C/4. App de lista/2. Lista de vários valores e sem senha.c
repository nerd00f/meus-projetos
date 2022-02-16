#include <stdio.h>
#include <stdlib.h>

// Cria um no da lista
struct Node {
  int num;           // vai guardar um valor
  struct Node *prox; // aponta para o proximo no
};
typedef struct Node node; // define o tipo de estrutura

// variavel que armazena o tamanho
int tam;

// Faz a chamada das funções
int menu(void);
void inicia(node *PILHA);
void opcao(node *PILHA, int op);
void exibe(node *PILHA);
void libera(node *PILHA);
void push(node *PILHA);
node *pop(node *PILHA);

// Funcao principal
int main(void) {

  node *PILHA = (node *)malloc(sizeof(node));

  if (!PILHA) {
    printf("Sem memoria disponivel!\n");
    exit(1);
  }

  else {
    inicia(PILHA);
    int opt;

    do {
      opt = menu();
      opcao(PILHA, opt);
    } while (opt);

    free(PILHA);
    return 0;
  }
}

// Função que inicia a lista(pilha)
void inicia(node *PILHA) {
  PILHA->prox = NULL;
  tam = 0;
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
  printf("Opcao: ");

  // Lê a opção escolhida
  scanf("%d", &opt);

  // Retorna a opção
  return opt;
}

// Funcao verifica escolha do menu
void opcao(node *PILHA, int op) {

  node *tmp;

  // -- Verifica a opcao escolhida
  switch (op) {
  case 1:
    libera(PILHA);
    inicia(PILHA);
    break;

  case 2:
    // Limpar a tela
    system("clear");
    system("cls");
    printf("---------------\n");
    exibe(PILHA);
    break;

  case 3:
    push(PILHA);
    break;

  case 4:
    tmp = pop(PILHA);
    if (tmp != NULL)
      printf("Retirado: %3d\n\n", tmp->num);
    break;

  default:
    printf("Comando invalido\n\n");
  }
  //-----------------------------
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
    printf("Novo elemento: ");
    scanf("%d", &novo->num);
    return novo;
  }
}

// Função que retorna a lista(pilha)
void exibe(node *PILHA) {
  if (vazia(PILHA)) {
    // Exibir na tela
    printf("PILHA vazia!\n\n");
    return;
  }

  node *tmp;
  tmp = PILHA->prox;

  printf("PILHA:");

  while (tmp != NULL) {
    printf("%5d", tmp->num);
    tmp = tmp->prox;
  }

  printf("\n        ");

  int count;

  for (count = 0; count < tam; count++)
    printf("  ^  ");
  printf("\nOrdem:");

  for (count = 0; count < tam; count++)
    printf("%5d", count + 1);
  printf("\n\n");
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

  if (vazia(PILHA)) {
    PILHA->prox = novo;
  }

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
