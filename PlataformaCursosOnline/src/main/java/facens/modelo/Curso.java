package facens.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String nome, descricao, materia;
	private List<Aluno> ListaAluno;
	private int id;
	private static int proximoId=1; 
	
	public Curso(String nome, String descricao, String materia) {
		this.nome = nome;
		this.descricao = descricao;
		this.materia= materia;
		this.ListaAluno = new ArrayList<Aluno>();
		this.id = proximoId++;
	}

	public String getNome() {
		return nome ;
	}
	
	public void setNome(String nome) {
        this.nome = nome;
    }
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
	
	public String getMateria() {
		return materia;
	}
	
	public void setMateria(String materia) {
        this.materia = materia;
    }
	
	public List<Aluno> getListaAluno() {
		return ListaAluno;
	}
	
	public void adicionaAlunoLista(Aluno aluno) {
        ListaAluno.add(aluno);
    }
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
        this.id = id;
    }
	
	public void modificarCurso(Curso curso) {
        this.nome = curso.nome;
        this.descricao = curso.descricao;
        this.materia = curso.materia;
        this.ListaAluno = curso.ListaAluno;
    }
	
	
	
}
