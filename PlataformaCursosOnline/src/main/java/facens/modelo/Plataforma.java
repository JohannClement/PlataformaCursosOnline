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

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
        this.descricao = descricao;
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
    	
    	for (Trilha trilha : ListaTrilha) {
    		
    		if(trilha.getNome().equals(nomeTrilha)) {
    			
    			trilha.setNome(trilhaNomeEdit);
    			System.out.println("Trilha" + nomeTrilha + " editada para " + trilhaNomeEdit + " com sucesso");
    			
    			trilha.setDescricao(trilhaDescricaoEdit);
    			System.out.println("Descrição da" + trilhaNomeEdit + " editada para " + trilhaDescricaoEdit + " com sucesso");
    			
    			return;
    		}
    	}
    	System.out.println("Trilha '" + nomeTrilha + "' não encontrada.");
    }
    
    public double buscaTrilhaPorNome(String nomeTrilha) {
        Iterator<Trilha> iterator = ListaTrilha.iterator();
        while (iterator.hasNext()) {
            Trilha trilha = iterator.next();
            if (trilha.getNome().equals(nomeTrilha)) {
            	
                System.out.println("Trilha '" + nomeTrilha + "' FOI encontrada.");
                return 1.0;
            }
            
        }        
        System.out.println("Trilha '" + nomeTrilha + "' NAO encontrada.");
        return 0.0;
    }
}

