package atividadeN1;

//INICIO DO PROGRAMA
public class GinasticaArtistica extends Atletas {

	//CRIAÇÃO DAS VARIAVEIS NECESSÁRIAS
	private double n1, n2, n3, n4, n5;

	//CONSTRUTOR
	public GinasticaArtistica(String nome, double n1, double n2, double n3, double n4, double n5) {
		super(nome);
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.n4 = n4;
		this.n5 = n5;
	}

	//GET-SET
	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public double getN4() {
		return n4;
	}

	public void setN4(double n4) {
		this.n4 = n4;
	}

	public double getN5() {
		return n5;
	}

	public void setN5(double n5) {
		this.n5 = n5;
	}

	//CRIAÇÃO DO METODO PARA DESCOBRIR O MENOR VALOR
	public double Menor(double menor) {
		menor = 10;
		if (this.n2 < menor) {
			menor = this.n2;
		}
		if (this.n1 < menor) {
			menor = this.n1;
		}
		if (this.n3 < menor) {
			menor = this.n3;
		}
		if (this.n4 < menor) {
			menor = this.n4;
		}
		if (this.n5 < menor) {
			menor = this.n5;
		}
		return menor;

	}

	//METODO PARA DESCOBRIR O VALOR TOTAL
	public double Total(double total) {
		total = this.n1 + this.n2 + this.n3 + this.n4 + this.n5;
		return total;
	}

}
//FINAL DO PROGRAMA