#include <stdio.h>
#include <stdlib.h>

int main()
{
    float salario;
    printf("digite o salario:");
    scanf("%f",&salario);
    salario*=1.25;
    printf("salario com juros de 5 por cento: %f\n",salario);
}
