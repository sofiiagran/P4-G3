#include <stdbool.h>
#include <stdlib.h>
#include <stdio.h>
#include <math.h>
#include <string.h>
void getName();
void getAge();

int main() { 

    getName();
    getAge();
    return 0;
}
void getName() { 
    char question1[100];
    printf( "What is your name?\n" );
    scanf("%[^\n]s", question1);

    printf( "%s" , question1);
}


void getAge() { 
    double question2;
    printf( "what is your age?\n" );
    scanf("%lf", &question2);

    printf( "%lf" , question2);
}

