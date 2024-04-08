import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe que representa um item da lista de compras
class ItemLista {
    private String nome;
    private int quantidade;

    public ItemLista(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

// Classe que representa a lista de compras
public class ListaCompras_Q2 {
    private List<ItemLista> lista;

    public ListaCompras_Q2() {
        lista = new ArrayList<>();
    }

    public void adicionarItem(String nome, int quantidade) {
        lista.add(new ItemLista(nome, quantidade));
    }

    public void removerItem(String nome) {
        lista.removeIf(item -> item.getNome().equals(nome));
    }

    public void exibirLista() {
        System.out.println("Lista de compras:");
        for (ItemLista item : lista) {
            System.out.println(item.getNome() + " - Quantidade: " + item.getQuantidade());
        }
    }

    public static void main(String[] args) {
        ListaCompras_Q2 listaDeCompras = new ListaCompras_Q2();
        Scanner sc = new Scanner(System.in);
        int a = 1;
        while (a != 0) {        	
        	
        	System.out.println("Adicionando novo item a lista");
    		System.out.println("Item: ");
    		String item = sc.nextLine();
    		
    		System.out.println("Quantidade: ");
    		int quantidade = sc.nextInt();
    		listaDeCompras.adicionarItem(item, quantidade);    		
    		
    		System.out.println("Deseja adicionar mais algum item? (1) Sim / (0) Não");
    		a = sc.nextInt();
    		sc.nextLine();
        }
        System.out.println("- - - - - - - - - - - - - - -");
        listaDeCompras.exibirLista();
        String itemRemover = null;
        int r = 1;
        while (r != 0) {        	
        	
        	System.out.println("\nQual item deseja remover? ");
    		itemRemover = sc.nextLine();
    		
    		listaDeCompras.removerItem(itemRemover);  	
    		System.out.println("- - - - - - - - - - - - - - -");
    		listaDeCompras.exibirLista();
    		
    		System.out.println("\nDeseja remover mais algum item? (1) Sim / (0) Não");
    		r = sc.nextInt();
    		sc.nextLine();
        }
    }
}
