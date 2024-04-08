import java.util.ArrayList;
import java.util.List;

public class ListaPessoa_Q5 {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("João", 25));
        pessoas.add(new Pessoa("Maria", 30));
        pessoas.add(new Pessoa("Pedro", 20));
        pessoas.add(new Pessoa("Ana", 22));
        pessoas.add(new Pessoa("Daniel", 31));
        pessoas.add(new Pessoa("Lucas", 18));

        pessoas.sort((p1, p2) -> Integer.compare(p1.idade, p2.idade));

        System.out.println("Pessoas ordenadas por idade:");
        for (Pessoa pessoa : pessoas) {
            System.out.println("Pessoa{" + "nome='" + pessoa.nome + "', idade=" + pessoa.idade + "}");
        }
    }
}

class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
