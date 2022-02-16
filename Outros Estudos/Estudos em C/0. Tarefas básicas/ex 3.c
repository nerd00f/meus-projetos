#include <stdio.h>
#include <stdlib.h>

int main()
{
    int result,n1,n2,n3;
    printf("digite 3 numeros:");
    scanf("%d %d %d",&n1,&n2,&n3);
    result=(n1*n1)+(n2*n2)+(n3*n3);
    printf("a soma do quadrado dos numeros digitados e: %d\n",result);
}
