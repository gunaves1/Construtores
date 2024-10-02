package construtores;

public class Consulta {
	public String data;
	public String nomePcnte;
	public String nomeDents;
	
	public Consulta() {
	}
	
	public Consulta(String data, String nomePcnte, String nomeDents) {
		this.data = data;
		this.nomePcnte = nomePcnte;
		this.nomeDents = nomeDents;
	}
	public void ExibindoConsulta() {
		System.out.println("Data: " + data + " Nome Paciente: " + nomePcnte + " Nome Dentista: " + nomeDents);
	}
}
