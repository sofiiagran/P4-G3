#include <stdbool.h>
#include <stdlib.h>
#include <stdio.h>
#include <math.h>
#include <string.h>
double myfunc(char k[], double g);
const char* newFunc();
    double x;
    char h[] = "lol";

 struct Student { 
    char name[];
    double age;
};

int main() { 

    return 0;
}
double myfunc(char k[], double g) { 
    char list1[][] = {"sofia", "kari", "inga"};
    Student sofia = {list1[0], g};
    return sofia.age;
}


const char* newFunc() { 
    char person1[];
    char temp;
    printf( "hvad hedder du????" );
    scanf("%c"&temp);
    scanf("%[^\n]s", person1);

    return person1;
}

