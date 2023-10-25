package facens.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Plataforma {

	private String descricao;
	private List<Trilha> ListaTrilha;
	
	public Plataforma(String descricao) {
		this.descricao = descricao;
		this.ListaTrilha = new ArrayList<Trilha>();
	}		

	
	public List<Trilha> getListaTrilha() {
        return ListaTrilha;
    }
	
    public void adicionarTrilhaLista(Trilha trilha) {
        ListaTrilha.add(trilha);
    }
    
    public void excluirTrilhaPorNome(String nomeTrilha) {
        Iterator<Trilha> iterator = ListaTrilha.iterator();
        while (iterator.hasNext()) {
            Trilha trilha = iterator.next();
            if (trilha.getNome().equals(nomeTrilha)) {
                iterator.remove();
                System.out.println("Trilha '" + nomeTrilha + "' excluída com sucesso.");
                return;
            }
        }
        System.out.println("Trilha '" + nomeTrilha + "' não encontrada.");
    }
    
    public void editarTrilhaPorNome(String nomeTrilha, String trilhaNomeEdit, String trilhaDescricaoEdit) {
        ListaTrilha.stream()
                .filter(trilha -> trilha.getNome().equals(nomeTrilha))
                .findFirst()
                .ifPresent(trilha -> {
                    trilha.setNome(trilhaNomeEdit);
                    trilha.setDescricao(trilhaDescricaoEdit);
                    System.out.println("Trilha e descrição editadas com sucesso.");
                });
    }
    
    public boolean buscaTrilhaPorNome(String nomeTrilha) {
        return ListaTrilha.stream().anyMatch(trilha -> trilha.getNome().equals(nomeTrilha));
    }

}

