#include <stdio.h>
#include <stdlib.h>

int encontraMenor(int numeros[], int tam){
  int menor = numeros[0];
  for(int i=0;i<tam;i++){
    if(numeros[i] < menor){
      menor = numeros[i];
    }
  }
  return menor;
}

int ExemploFuncao2(){

  int numeros[5]; 

  for(int i = 0;i<5;i++){
  printf("Digite o %d numero: \n", (i+1));
    scanf("%d", &numeros[i]);
  }

  int menor = encontraMenor(numeros, 5);
  printf("O menor numero e: %d", menor);
  return 0;
}