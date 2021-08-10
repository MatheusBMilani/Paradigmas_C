#include <stdio.h>
#include <stdlib.h>

int ExemploIf(){

    int numero;

    printf("Insira um numero inteiro: ");
    scanf("%d", &numero);

    if(numero % 2 == 0){
        printf("O numero e divisivel por 2!");
    } else if(numero % 5 == 0) {
        printf("O numero e divisivel por 5!");
    } else {
        printf("O numero e nao divide por 2 nem por 5!");
    }
    return 0;
}
