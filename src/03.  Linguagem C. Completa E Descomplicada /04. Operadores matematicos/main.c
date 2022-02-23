#include <stdio.h>
#include <stdlib.h>

int main() {
 int x = 10, y = 20;  

 x *= y - 10;  
 x++;
 printf("x = %d\n",x);  

 x -= 5 + y;  
 x--;
 printf("x = %d\n",x);  

 return 0;
}
