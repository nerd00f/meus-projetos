#include <stdio.h>
#include <stdlib.h>

int main() {
  for (;;) // loop do menu
  {
    int codigo, qtd_itens, i, loop;
    float preco, desconto;
    // Menu para selecao de pedidos
    printf("\n------------------------ MENU -----------------------\n");
    printf("| Especificao         Codigo                Preco   |\n");
    printf("| Cachorro Quente     100                   1.20    |\n");
    printf("| Bauru Simples       101                   1.30    |\n");
    printf("| Bauru com Ovo       102                   1.50    |\n");
    printf("| Hamburguer          103                   1.20    |\n");
    printf("| Cheeseburguer       104                   1.70    |\n");
    printf("| Suco                105                   2.20    |\n");
    printf("| Refrigerante        106                   1.00    |\n");
    printf("---------------------------------------------------- \n");
    printf("                                                     \n");
    printf("\nQuantidade de pedidos, digite 0 para fechar o programa:");
    scanf("%d", &qtd_itens);
    if (qtd_itens == 0)
      return 0;                     // escape do loop
    for (i = 0; i < qtd_itens; i++) // contador de pedidos
    {
      printf(
          "Para realizar o pedido por favor digite o codigo correspodente:\n");
      scanf("%d", &codigo);
      switch (codigo) // selecao por codigo
      {
      case 100:
        preco += 1.20;
        break;
      case 101:
        preco += 1.30;
        break;
      case 102:
        preco += 1.50;
        break;
      case 103:
        preco += 1.20;
        break;
      case 104:
        preco += 1.70;
        break;
      case 105:
        preco += 2.20;
        break;
      case 106:
        preco += 1.00;
        break;
      }
    }
    if (preco > 10.00) {
      // desconto 10%
      desconto = preco * 0.10;
      preco -= desconto;
    }
    if (preco > 20.00) {
      // desconto 20%
      desconto = preco * 0.20;
      preco -= desconto;
    }
    if (preco > 30.00) {
      // desconto 30%
      desconto = preco * 0.30;
      preco -= desconto;
    }
    printf("Valor do pedido:%.2f", preco);
    preco = 0;
  }
}
