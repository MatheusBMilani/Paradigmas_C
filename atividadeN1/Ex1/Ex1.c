//Bibliotecas padrão
#include <stdio.h>
#include <stdlib.h>

//Inicio do código
int main(){

//Declaração das variáveis principais e auxiliares
	int opcao = 1, i;
	float a_notas1[3],a_notas2[3], notaMaior1 = 0, segundaMaior1 = 0, notaMaior2 = 0, segundaMaior2 = 0;
	float g_notas1[5], notaMenor1, soma1, g_notas2[5], notaMenor2, soma2;

//Inicio do loop do menu
	do{
//Impressão do Menu
    printf("Bem - Vindo as Olimpiadas\n");
	printf("Digite o esporte desejado: \n\n");
	printf("1 - Arremesso de peso\n");
	printf("2 - Ginastica Artistica\n");
	printf("0 - Sair\n\n");

//Armazena valor em opcao para entrada em casos
	scanf("%d", &opcao);

//Limpa tela (estetica apenas)
	system("cls");

//Abertura de casos utilizando as opções do menu
	switch (opcao){
		case 1:

			printf("Digite as 3 distancias obtidas pelo primeiro atleta\n\n");

//For com variavel I que acrescenta 1 a cada loop até chegar a 3
			for(i = 0; i < 3; i++){
				printf("Digite a distancia do arremesso n%d\n", i + 1);
				scanf("%f", &a_notas1[i]);

//Cumprimento da lógica proposta pela modalidade
				if (a_notas1[i] > notaMaior1){
					segundaMaior1 = notaMaior1;
					notaMaior1 = a_notas1[i];
				}else if (notaMaior1 > a_notas1[i]){
					if(a_notas1[i] > segundaMaior1){
						segundaMaior1 = a_notas1[i];
					};
				};
			};

//Limpa tela (estetica apenas)
			system("cls");

			printf("\n\nDigite as 3 distancias obtidas pelo segundo atleta\n\n");

//For com variavel I que acrescenta 1 a cada loop até chegar a 3
			for(i = 0; i < 3; i++){
				printf("Digite a distancia do arremesso n%d\n", i + 1);
				scanf("%f", &a_notas2[i]);

//Cumprimento da lógica proposta pela modalidade
				if (a_notas2[i] > notaMaior2){
					segundaMaior2 = notaMaior2;
					notaMaior2 = a_notas2[i];
				}else if (notaMaior2 > a_notas2[i]){
					if(a_notas2[i] > segundaMaior2){
						segundaMaior2 = a_notas2[i];
					};
				};
			};

//Limpa tela (estetica apenas)
			system("cls");

//Impressão dos resultados finais
			printf("\n\nNotas do primeiro jogador: \n");

//For com variavel I que acrescenta 1 a cada loop até chegar a 3 para impressão do vetor completo
			for(i = 0; i < 3; i++){
				printf("Nota %d - %.2f metros.\n", i, a_notas1[i]);
			};

			printf("\nNotas do segundo jogador: \n");


//For com variavel I que acrescenta 1 a cada loop até chegar a 3 para impressão do vetor completo
			for(i = 0; i < 3; i++){
				printf("Nota %d - %.2f metros.\n", i, a_notas2[i]);
			};

//Lógica para obtenção da maior e segunda maior nota assim determinando o vencedor
			if(notaMaior1 == notaMaior2){
				if(segundaMaior1 > segundaMaior2){
				printf("\nJogador n1 vencedor!\n");
				printf("(Em caso de empate, vale a segunda maior marca do atleta)");
				}else{
				printf("\nJogador n2 vencedor!");
				printf("(Em caso de empate, vale a segunda maior marca do atleta)");
				}
			}else if(notaMaior1 > notaMaior2){
				printf("\nJogador n1 vencedor!");
			}else{
				printf("\nJogador n2 vencedor!");
			}
			getch();

//Encerramento caso 1
			break;

//Inicio caso 2
		case 2:


			printf("Digite as 6 notas obtidas pelo primeiro atleta\n\n");
			printf("Digite a nota n1\n");

//Guarda o valor em 3 variaveis para utilizar na lógica do resultado
			scanf("%f", &g_notas1[0]);
			notaMenor1 = g_notas1[0];
			soma1 = g_notas1[0];

//Loop para ler 5 notas e armazenar no vetor utilizando a variavel i que se acrescenta a cada entrada
			for(i = 1; i < 6; i++){
				printf("Digite a nota n%d\n", i + 1);
				scanf("%f", &g_notas1[i]);

//Armazenamento da menor nota
				if (g_notas1[i] < notaMenor1){
					notaMenor1 = g_notas1[i];
				};

//Calculo do total por participante
				soma1 += g_notas1[i];
			};

//Calculo seguindo a regra do exercicio proposto
			soma1 -= notaMenor1;

//Limpa tela (estetica apenas)
			system("cls");


			printf("Digite as 6 notas obtidas pelo segundo atleta\n\n");
			printf("Digite a nota n1\n");

//Guarda o valor em 3 variaveis para utilizar na lógica do resultado
			scanf("%f", &g_notas2[0]);
			notaMenor2 = g_notas2[0];
			soma2 = g_notas2[0];

//Loop para ler 5 notas e armazenar no vetor utilizando a variavel i que se acrescenta a cada entrada
			for(i = 1; i < 6; i++){
				printf("Digite a nota n%d\n", i + 1);
				scanf("%f", &g_notas2[i]);

//Armazenamento da menor nota do atleta 2
				if (g_notas2[i] < notaMenor2){
					notaMenor2 = g_notas2[i];
				};

//Calculo do total do participante 2
				soma2 += g_notas2[i];
			};

//Calculo seguindo a regra do exercicio proposto
			soma2 -= notaMenor2;

			system("cls");

//Impressão dos totais de ambos participantes
			printf("\n\nA somatoria de notas do primeiro jogador eh de %.2f", soma1);
			printf("\n\nA somatoria de notas do segundo jogador eh de %.2f\n\n", soma2);

//Impressão do resultado final da modalidade 2
			if (soma1 == soma2){
				printf("EMPATE!");
			}else if(soma1 > soma2){
				printf("Jogador n1 vencedor!");
			}else{
				printf("Jogador n2 vencedor!");
			}

			getch();

//Encerramento caso 2
			break;

		case 0:
			exit(0);
			break;

		default:
			printf("Opcao invalida, tente novamente");
			getch();
			break;
	};

	system("cls");

//Lógica para cancelamento do loop e encerramento do programa
	}while(opcao != 0);
};
