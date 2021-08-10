#include <stdio.h>
#include <stdlib.h>

void mostrarImpares(int numeros[10], int tam){
  for(int i = 0;i<tam;i++){
      if(numeros[i] % 2 !=0){
        printf("O numero %d e impar!\n",numeros[i]);
      }
  }
}

int ExemploFuncao(){

  int numeros[5]; 

  for(int i = 0;i<5;i++){
    printf("Digite o %d numero: \n", (i+1));
    scanf("%d", &numeros[i]);
  }
  mostrarImpares(numeros, 5);
    return 0;
}