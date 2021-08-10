#include <stdio.h>
#include <stdlib.h>

int ExemploBase()
{

    char nome[40];
    int idade;
    float altura;

    printf("\nQual seu nome: ");
    scanf("%s",nome);

    printf("\nQual sua idade: ");
    scanf("%d", &idade);

    printf("\nQual sua altura: ");
    scanf("%f", &altura);

    printf("\nOla %s, voce tem %d anos e mede %.2f",nome, idade, altura);

    return 0;
}
