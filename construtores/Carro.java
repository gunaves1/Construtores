package construtores;

public class Carro {
	private String placa;
	private int numChasi;
	
	public Carro() {
	}
	
	public Carro(String placa) {
		this.placa = placa;
	}
	
	public Carro(int numChasi) {
		this.numChasi = numChasi;
	}
	
	public Carro(String placa, int numChasi) {
		this.placa = placa;
		this.numChasi = numChasi;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getNumChasi() {
		return numChasi;
	}

	public void setNumChasi(int numChasi) {
		this.numChasi = numChasi;
	}
}
