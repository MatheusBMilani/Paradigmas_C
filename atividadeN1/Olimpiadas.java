package atividadeN1;

import java.util.Scanner;

//INICIO DOO PROGRAMA
public class Olimpiadas {

	public static void main(String args[]) {

		//VARIAVEIS PARA CRIAÇÃO DO MENU
		char acessarSN = 'S';
		int escolha = 0;

		Scanner leia = new Scanner(System.in); // SCANNER

		//INICIALIZAÇÃO DOS OBJ COM VALORES QUE SERÃO ALTERADOS PELO USUARIO DO PROGRAMA
		GinasticaArtistica atleta1 = new GinasticaArtistica("Matheus", 9, 8, 2, 3, 5);
		GinasticaArtistica atleta2 = new GinasticaArtistica("Flavio", 10, 2, 4, 5, 3);
		ArremesoDePeso arremessador1 = new ArremesoDePeso("Mecha", 101.50, 99.10, 98.75);
		ArremesoDePeso arremessador2 = new ArremesoDePeso("Giga", 102.10, 99.70, 100.55);

		//INICIO LOOP DO MENU
		System.out.print("Deseja entrar nas olimpiadas [S/N]: ");
		acessarSN = leia.next().toUpperCase().charAt(0);
		while (acessarSN == 'S') {
			
			//MENU SIMPLES
			System.out.println("--------------MENU-------------");
			System.out.println("1.Ginastica Artistica");
			System.out.println("2.Arremesso de Peso");
			System.out.println("3.Sair\n");
			System.out.println("Insira o valor: ");

			escolha = leia.nextInt();
			
			//INSERÇÃO DOS DADOS PELO USUARIO
			if (escolha == 1) {
				System.out.println("Insira o nome do Atleta 1");
				atleta1.setNome(leia.next());
				System.out.println("Insira a n1 do Atleta 1");
				atleta1.setN1(leia.nextFloat());
				System.out.println("Insira a n2 do Atleta 1");
				atleta1.setN2(leia.nextFloat());
				System.out.println("Insira a n3 do Atleta 1");
				atleta1.setN3(leia.nextFloat());
				System.out.println("Insira a n4 do Atleta 1");
				atleta1.setN4(leia.nextFloat());
				System.out.println("Insira a n5 do Atleta 1");
				atleta1.setN5(leia.nextFloat());

				System.out.println("Insira o nome do Atleta 2");
				atleta2.setNome(leia.next());
				System.out.println("Insira a n1 do Atleta 2");
				atleta2.setN1(leia.nextFloat());
				System.out.println("Insira a n2 do Atleta 2");
				atleta2.setN2(leia.nextFloat());
				System.out.println("Insira a n3 do Atleta 2");
				atleta2.setN3(leia.nextFloat());
				System.out.println("Insira a n4 do Atleta 2");
				atleta2.setN4(leia.nextFloat());
				System.out.println("Insira a n5 do Atleta 2");
				atleta2.setN5(leia.nextFloat());
				
				//CALCULOS DA PRIMEIRA MODALIDADE
				System.out.println("RESULTADOS!");
				System.out.println("Nome: " + atleta1.getNome() + "\tTotal: " + (atleta1.Total(0) - atleta1.Menor(0)));
				System.out.println("Nome: " + atleta2.getNome() + "\tTotal: " + (atleta2.Total(0) - atleta2.Menor(0)));

				//IMPRESSÃO DO VENCEDOR DA PRIMEIRA MODALIDADE
				if ((atleta1.Total(0) - atleta1.Menor(0)) > (atleta2.Total(0) - atleta2.Menor(0))) {
					System.out.println("Portanto o vencedor da competição de Ginastica é: " + atleta1.getNome());
				} else {
					System.out.println("Portanto o vencedor da competição de Ginastica é: " + atleta2.getNome());
				}

			}

			//INSERÇÃO DOS DADOS PELO USUARIO
			if (escolha == 2) {
				
				System.out.println("Insira o nome do Arremessador 1");
				arremessador1.setNome(leia.next());
				System.out.println("Insira a primeira distancia do Arremessador 1");
				arremessador1.setA1(leia.nextFloat());
				System.out.println("Insira a segunda distancia do Arremessador 1");
				arremessador1.setA2(leia.nextFloat());
				System.out.println("Insira a terceira distancia do Arremessador 1");
				arremessador1.setA3(leia.nextFloat());

				System.out.println("Insira o nome do Arremessador 2");
				arremessador2.setNome(leia.next());
				System.out.println("Insira a primeira distancia do Arremessador 2");
				arremessador2.setA1(leia.nextFloat());
				System.out.println("Insira a segunda distancia do Arremessador 2");
				arremessador2.setA2(leia.nextFloat());
				System.out.println("Insira a terceira distancia do Arremessador 2");
				arremessador2.setA3(leia.nextFloat());

				//CALCULO DOS RESULTADOS COM BASE NA REGRA PROPOSTA
				System.out.println("RESULTADOS!");
				System.out.println("Nome: " + arremessador1.getNome() + "\tMaior arremesso: "
						+ (arremessador1.M1(0) + "\tSegundo maior arremesso: " + arremessador1.M2(0)));
				System.out.println("Nome: " + arremessador2.getNome() + "\tMaior arremesso: "
						+ (arremessador2.M1(0) + "\tSegundo maior arremesso: " + arremessador2.M2(0)));
				
				//IMPRESSÃO DO VENCEDOR POR LÓGICA BÁSICA PROPOSTA
				if (arremessador1.M1(0) == arremessador2.M1(0)) {

					if (arremessador1.M2(0) > arremessador2.M2(0)) {
						System.out.println("O vencedor da disputa de Arremessos foi: " + arremessador1.getNome());
					} else if (arremessador1.M2(0) < arremessador2.M2(0)) {
						System.out.println("O vencedor da disputa de Arremessos foi: " + arremessador2.getNome());
					}
				} else if (arremessador1.M1(0) > arremessador2.M1(0)) {
					System.out.println("O vencedor da disputa de Arremessos foi: " + arremessador1.getNome());
				} else {
					System.out.println("O vencedor da disputa de Arremessos foi: " + arremessador2.getNome());
				}

			}
			//OPÇÃO QUE REPRESENTA FIM DO LOOP DO MENU
			if (escolha == 3) {
				acessarSN = 'N';
			}

		}
	}
}
//FIM DO PROGRAMA
