package atividadeN1;

//INICIO DO PROGRAMA
public class ArremesoDePeso extends Atletas {
	//INICIALIZAÇÃO DAS VARIAVEIS NECESSÁRIAS PARA LÓGICA PROPOSTA
	public double tempM1;
	private double a1, a2, a3;

	//CONSTRUTOR
	public ArremesoDePeso(String nome, double a1, double a2, double a3) {
		super(nome);
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
	}

	//GET-SET
	public double getA1() {
		return a1;
	}

	public void setA1(double a1) {
		this.a1 = a1;
	}

	public double getA2() {
		return a2;
	}

	public void setA2(double a2) {
		this.a2 = a2;
	}

	public double getA3() {
		return a3;
	}

	public void setA3(double a3) {
		this.a3 = a3;
	}

	//METODO PARA OBTENÇÃO DO MAIOR VALOR
	public double M1(double m1) {
		m1 = 0;

		if (this.a1 > m1) {
			m1 = this.a1;
			tempM1 = m1;
		}
		if (this.a2 > m1) {
			m1 = this.a2;
			tempM1 = m1;
		}
		if (this.a3 > m1) {
			m1 = this.a3;
			tempM1 = m1;
		}
		return m1;
	}

	//METODO PARA OBTENÇÃO DO SEGUNDO MAIOR VALOR
	public double M2(double m2) {
		m2 = 0;

		if (this.a1 > m2 && this.a1 < tempM1) {
			m2 = this.a1;
		}
		if (this.a2 > m2 && this.a2 < tempM1) {
			m2 = this.a2;
		}
		if (this.a3 > m2 && this.a3 < tempM1) {
			m2 = this.a3;
		}

		return m2;
	}

}
//FINAL DO PROGRAMA
