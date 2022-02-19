#include <stdio.h>
#include <stdlib.h>

int main()
{
   const float pi=3.141592;
   float area, raio;
   printf("digite o raio:");
   scanf("%f",&raio);
   area=pi*(raio*raio);
   printf("raio:%f\n",area);
}
