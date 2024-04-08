import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

class Contato {
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }
}

class ListaDeContatos {
    private List<Contato> contatos;

    public ListaDeContatos() {
        contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone) {
        contatos.add(new Contato(nome, telefone));
    }

    public Optional<Contato> buscarContato(String nome) {
        return contatos.stream().filter(contato -> contato.getNome().equals(nome)).findFirst();
    }

    public void listarContatos() {
        contatos.forEach(contato -> System.out.println("Nome: " + contato.getNome() + ", Telefone: " + contato.getTelefone()));
    }
}

public class ListaContatos_Q1 {
    public static void main(String[] args) {
        ListaDeContatos listaDeContatos = new ListaDeContatos();
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int a = 1;
        while (a != 0) {        	
        	
        	System.out.println("Adicionando a " + i + "° pessoa");
        	i++;
    		System.out.println("Nome: ");
    		String nome = sc.nextLine();
    		
    		System.out.println("Contato: ");
    		String contato = sc.nextLine();
    		listaDeContatos.adicionarContato(nome, contato);
    		
    		
    		System.out.println("Deseja adicionar mais algum contato? (1) Sim / (0) Não");
    		a = sc.nextInt();
    		sc.nextLine();
        }
        
        System.out.println("Buscar contato pelo nome: ");
        String nomeContato = sc.nextLine();
        String nomeBusca = nomeContato;
        Optional<Contato> contatoEncontrado = listaDeContatos.buscarContato(nomeBusca);
        if (contatoEncontrado.isPresent()) {
            System.out.println("\nContato " + nomeBusca + " encontrado:");
            System.out.println("Nome: " + contatoEncontrado.get().getNome() + ", Telefone: " + contatoEncontrado.get().getTelefone());
        } else {
            System.out.println("\nContato " + nomeBusca + " não encontrado.");
        }
        
        System.out.println("\nTodos os contatos:");
        listaDeContatos.listarContatos();
    }
}
