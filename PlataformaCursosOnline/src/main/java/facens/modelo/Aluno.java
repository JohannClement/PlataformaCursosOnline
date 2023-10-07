package facens.modelo;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	private int id ;
	private static int proximoId=1; 
	private String nome, cpf, sexo;
    private List<Trilha> ListaTrilhasInscrita;

	public Aluno(String nome, String cpf, String sexo) {
		this.nome = nome;
		this.cpf = cpf;
		this.sexo= sexo;
		this.id = proximoId++;
		this.ListaTrilhasInscrita = new ArrayList<Trilha>();
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
        this.id = id;
    }

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
        this.nome = nome;
    }
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
        this.sexo = sexo;
    }
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
        this.cpf = cpf;
    }

	public void modificarAluno(Aluno aluno) {
        this.nome = aluno.nome;
        this.cpf = aluno.cpf;
        this.sexo = aluno.sexo;
    }
	
	
	
	 public void inscreverNaTrilha(Trilha trilha) {
	        if (!ListaTrilhasInscrita.contains(trilha)) {
	        	ListaTrilhasInscrita.add(trilha);
	            trilha.inscreverAluno(this);
	        }
	    }

	    public List<Trilha> getTrilhasInscritas() {
	        return ListaTrilhasInscrita;
	    }
	    
}
