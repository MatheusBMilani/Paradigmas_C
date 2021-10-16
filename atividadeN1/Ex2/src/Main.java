import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int opcao = 1, numero;

        Scanner sc = new Scanner(System.in);
        
        do{
       
        menu();
        opcao = sc.nextInt();
        limpar();
        
            switch(opcao){

            case 1:
                System.out.println("Digite o numero de inscrição do primeiro atleta: \n");
                numero = sc.nextInt();
                Arremessador atleta1 = new Arremessador(numero);
                System.out.println("Digite o numero de inscrição do segundo atleta: \n");
                numero = sc.nextInt();
                Arremessador atleta2 = new Arremessador(numero);
                atleta1.calcularArremessos();
                atleta2.calcularArremessos();
                limpar();
                atleta1.exibirArremessos();
                atleta2.exibirArremessos();

                if(atleta1.notaMaior == atleta2.notaMaior){
                    if(atleta1.segundaMaior > atleta2.segundaMaior){
                        System.out.print("\nJogador n1 vencedor!\n");
				        System.out.printf("(Em caso de empate, vale a segunda maior marca do atleta)");
                    }else{
                        System.out.println("\nJogador n2 vencedor!");
                        System.out.println("(Em caso de empate, vale a segunda maior marca do atleta)");
                    }
                }else if(atleta1.notaMaior > atleta2.notaMaior){
                    System.out.println("\nJogador n1 vencedor!");
                }else{
                    System.out.println("\nJogador n2 vencedor!");
                }
                System.out.println("\n\nDigite um numero para continuar");
                sc.next();
                break;

            case 2:
                System.out.println("Digite o numero de inscrição do primeiro atleta: \n");
                numero = sc.nextInt();
                Ginasta ginasta1 = new Ginasta(numero);
                System.out.println("Digite o numero de inscrição do segundo atleta: \n");
                numero = sc.nextInt();
                Ginasta ginasta2 = new Ginasta(numero);
                ginasta1.calcularNotas();
                ginasta2.calcularNotas();
                limpar();
                ginasta1.exibirNotas();
                ginasta2.exibirNotas();
                if(ginasta1.soma == ginasta2.soma){
                    System.out.println("EMPATE!");
                }else if (ginasta1.soma > ginasta2.soma){
                    System.out.println("O jogador (numero " + ginasta1.getNome() + " ) é o vencedor!");
                }else{
                    System.out.println("O jogador (numero " + ginasta2.getNome() + " ) é o vencedor!");
                }
                System.out.println("\n\nDigite um numero para continuar");
                sc.next();
                break;

            case 0:
                System.exit(0);
                break;

            default:
                System.out.println("\nOpção invalida, tente novamente");
                System.out.println("\n\nDigite um numero para continuar");
                sc.next();
                break;
            }
        limpar();
        }while(opcao != 0);
    }

    public static void menu(){
        System.out.println("\nBem - Vindo as Olimpiadas\n");
        System.out.println("Digite o esporte desejado: \n\n");
        System.out.println("1 - Arremesso de peso\n");
        System.out.println("2 - Ginastica Artistica\n");
        System.out.println("0 - Sair\n\n");
    }

    public static void limpar() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }  
}
