import java.util.Scanner;

public class Arremessador {

    Scanner sc = new Scanner(System.in);

    protected int id;
    protected double notas[] = new double[3];
    protected double notaMaior = 0;
    protected double segundaMaior = 0;

    public Arremessador(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public double getNotaMaior(){
        return notaMaior;
    }

    public double getSegundaMaior(){
        return segundaMaior;
    }

    public void calcularArremessos(){
        System.out.println("Digite os 3 arremessos: \n\n");
        for(int i = 0; i < 3; i++){
            System.out.println("\nNota " + (i+1) + " :\n");
            notas[i] = sc.nextDouble();

            if (notas[i] > notaMaior){
                segundaMaior = notaMaior;
                notaMaior = notas[i];
            }else if (notaMaior > notas[i]){
                if(notas[i] > segundaMaior){
                    segundaMaior = notas[i];
                };
            };
        }
    }

    public void exibirArremessos(){
        System.out.println("\nArremessos do atleta " + this.id + " :\n");
        System.out.println("Arremesso 1: " + notas[0] + "\n");
        System.out.println("Arremesso 2: " + notas[1] + "\n");
        System.out.println("Arremesso 3: " + notas[2] + "\n\n");
    }
}
