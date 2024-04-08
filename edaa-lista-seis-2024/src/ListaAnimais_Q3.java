import java.util.ArrayList;
import java.util.List;

public class ListaAnimais_Q3 {

	public static void main(String[] args) {
		List<Animal> listaAnimais = new ArrayList<>();
		listaAnimais.add(new Animal("Jacaré"));
		listaAnimais.add(new Animal("Leão"));
		listaAnimais.add(new Animal("Girafa"));
		listaAnimais.add(new Animal("Elefante"));
		listaAnimais.add(new Animal("Zebra"));
		listaAnimais.add(new Animal("Cachorro"));
		listaAnimais.add(new Animal("Gato"));
		listaAnimais.add(new Animal("Cobra"));
		listaAnimais.add(new Animal("Morcego"));

		listaAnimais.sort((animal1, animal2) -> animal1.getNome().compareTo(animal2.getNome()));

        listaAnimais.forEach(animal -> System.out.println(animal.getNome()));
	}

}

class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
