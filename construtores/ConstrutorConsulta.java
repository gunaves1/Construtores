package construtores;

public class ConstrutorConsulta {

	public static void main(String[] args) {
		Consulta consulta1 = new Consulta();
		Consulta consulta2 = new Consulta("26/12/24","Gustavo","João");
		Consulta consulta3 = new Consulta("14/09/25","Rodolfo","Naves");
		
		consulta1.ExibindoConsulta();
		consulta2.ExibindoConsulta();
		consulta3.ExibindoConsulta();
	}

}
