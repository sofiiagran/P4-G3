#include <stdbool.h>
#include <stdlib.h>
#include <stdio.h>
#include <math.h>
#include <string.h>
void myfunc();

int main() { 

    myfunc();
    return 0;
}
void myfunc() { 
    char person1[];
    char temp;
    printf( "What is your name?" );
    scanf("%c"&temp);
    scanf("%[^\n]s", person1);

    printf( "%s" , person1);
}

