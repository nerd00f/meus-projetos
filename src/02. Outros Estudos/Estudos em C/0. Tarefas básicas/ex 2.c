#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num;
    printf("digite um numero:");
    scanf("%d",&num);
    num-=1;
    printf("antecessor:%d\n",num);
    num+=2;
    printf("sucessor:%d\n",num);
}
