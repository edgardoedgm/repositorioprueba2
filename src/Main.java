
public class Main {

	public static void main(String[] args) {
		Animal miAnimal;

		miAnimal = new Perro();
		miAnimal.sonido(); // Se invoca el método sonido() de la clase Perro

		miAnimal = new Gato();
		miAnimal.sonido(); // Se invoca el método sonido() de la clase Gato

	}

}
