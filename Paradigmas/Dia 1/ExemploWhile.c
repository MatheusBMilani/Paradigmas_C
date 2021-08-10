#include <stdio.h>
#include <stdlib.h>

int ExemploWhile(){

    double entradaUsuario;
    double soma = 0;
    double media;

    int i=0;
    while(i<10){
        printf("Digite o %d numero: ",(i+1));
        scanf("%lf", &entradaUsuario);
        soma += entradaUsuario;
        i++;
    }
        media = soma / 10;
        printf("A soma e: %.1lf",&soma);
        printf("A media e: %.1lf",&media);

    return 0;
}
