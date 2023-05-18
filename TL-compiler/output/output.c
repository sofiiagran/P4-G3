#include <stdbool.h>
#include <stdlib.h>
#include <stdio.h>
#include <math.h>
#include <string.h>
void myfunc(char k[], double g);
void newfunc(char b[]);
    double x;
    char h[] = "lol";

 struct Student { 
    char name[];
    double age;
};

 struct Car { 
    char carType[];
};

int main() { 

    return 0;
}
void myfunc(char k[], double g) { 
    Student sofia = {"sofia", 20.0};
    strcpy(sofia.name, "lol");
    Student truls = {"truls", 44.0};
    truls.age = 55.0;
}


void newfunc(char b[]) { 
    Car jaguar = {jaguar};
    char cartype[] = "cool";
}

