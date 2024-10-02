package construtores;

public class ConstrutorAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal(90,"Branco");
		Animal animal2 = new Animal();
		Animal animal3 = new Animal("Marrom");
		
		System.out.println(animal1.getTamanho());
		System.out.println(animal1.getCor());
		
		System.out.println(animal2.getTamanho());
		System.out.println(animal2.getCor());
		
		System.out.println(animal3.getCor());

	}

}
