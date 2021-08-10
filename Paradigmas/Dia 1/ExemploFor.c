#include <stdio.h>
#include <stdlib.h>

int ExemploFor(){

    double entradaUsuario;
    double soma = 0;
    double media;


    for(int i = 0; i<10; i++){
        printf("Digite o %d numero: ",(i+1));
        scanf("%lf", &entradaUsuario);
        soma += entradaUsuario;
    }


        media = soma / 10;
        printf("A soma e: %.1lf\n e a media: %.1lf",soma, media);

    return 0;
}
