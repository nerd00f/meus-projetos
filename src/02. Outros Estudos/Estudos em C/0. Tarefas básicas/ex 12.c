#include <stdio.h>

int main() {
    double num;
    printf("digite a temperatura em fahrenheit:\n");
    scanf("%lf", &num);
    num = 5*(num-32)/9;
    printf("temperatura em celsius: %lf\n",num);
    return 0;
}
