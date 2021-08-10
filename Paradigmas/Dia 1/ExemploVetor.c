#include <stdio.h>
#include <stdlib.h>

int ExemploVetor(){

    int vetor[10];
    int maior=0;
    int menor=10;

    for(int i=0;i<10;i++){
      printf("Insira um numero inteiro: ");
      scanf("%d", &vetor[i]);
      if(vetor[i] > maior){
        maior = vetor[i];
      }
      if(vetor[i] < menor){
        menor = vetor[i];
      }
    }
    printf("O maior numero e: %d e o menor numero e: %d\n",maior, menor);
    
    return 0;
}
