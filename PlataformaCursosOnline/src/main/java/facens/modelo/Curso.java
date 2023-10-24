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
	
	public void adicionaAlunoLista(Aluno aluno) {
        ListaAluno.add(aluno);
    }
	
	public void modificarCurso(Curso curso) {
        this.nome = curso.nome;
        this.descricao = curso.descricao;
        this.materia = curso.materia;
        this.ListaAluno = curso.ListaAluno;
    }
}