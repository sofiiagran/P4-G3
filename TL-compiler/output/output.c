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
    char * person1;
    printf( "What is your name?" );
    scanf("%[^\n]s", &person1);

    printf( "%s" , &person1);
}

