import java.util.ArrayList;
import java.util.List;

public class ListaDePaises_Q4 {
    public static void main(String[] args) {
        List<Pais> listaPaises = new ArrayList<>();
        listaPaises.add(new Pais("Brasil"));
        listaPaises.add(new Pais("Argentina"));
        listaPaises.add(new Pais("Chile"));
        listaPaises.add(new Pais("Uruguai"));
        listaPaises.add(new Pais("Portugal"));
        listaPaises.add(new Pais("Bolívia"));
        listaPaises.add(new Pais("China"));
        listaPaises.add(new Pais("Estados Unidos"));
        listaPaises.add(new Pais("França"));
        listaPaises.add(new Pais("Japão"));
        listaPaises.add(new Pais("Coréia"));

        listaPaises.sort((pais1, pais2) -> pais1.getNome().compareTo(pais2.getNome()));

        for (Pais pais : listaPaises) {
            System.out.println(pais.getNome());
        }
    }
}

class Pais {
    private String nome;

    public Pais(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
