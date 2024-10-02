package construtores;

public class ConstrutorCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro("ABC 1D23",123456789);
		Carro carro3 = new Carro("FDL 0E80");
		
		System.out.println(carro1.getPlaca());
		
		System.out.println(carro2.getPlaca());
		System.out.println(carro2.getNumChasi());
		
		System.out.println(carro3.getPlaca());
	}

}
