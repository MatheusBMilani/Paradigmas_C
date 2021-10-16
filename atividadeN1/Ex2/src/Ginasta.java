import java.util.Scanner;

public class Ginasta{

    Scanner sc = new Scanner(System.in);
    
    protected int id;
    protected double notas[] = new double[6];
    protected double notaMenor;
    protected double soma;
    
    public Ginasta(int id){
        this.id = id;
    }

    public int getNome(){
        return id;
    }
    
    public double getSoma(){
        return soma;
    }

    public void calcularNotas() {
        System.out.println("Digite as 6 notas obtidas pelo/a atleta numero " + this.id + ": \n");
        System.out.println("Digite a nota n1:\n");

        notas[0] = sc.nextDouble();
        notaMenor = notas[0];
        soma = notas[0];

        for(int i = 1; i < 6; i++){
            System.out.println("\nDigite a nota n"+ (i+1) + ": \n");
            notas[i] = sc.nextDouble();
            
            if(notas[i] < notaMenor){
                notaMenor = notas[i];
            }           
            soma += notas[i];           
        }
        soma -= notaMenor;
    }
    
    public void exibirNotas(){
        System.out.println("\n\nA somatoria de notas do atleta numero " + this.id + " é de " + this.soma);
    }
}
