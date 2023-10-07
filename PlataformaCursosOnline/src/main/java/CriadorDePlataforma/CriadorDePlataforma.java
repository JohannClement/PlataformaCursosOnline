package CriadorDePlataforma;

import facens.modelo.Aluno;
import facens.modelo.Curso;
import facens.modelo.Plataforma;
import facens.modelo.Trilha;

public class CriadorDePlataforma {
	
	public static void main(String[] args) {
	
		Plataforma plataforma = new Plataforma("Minha Plataforma de Educação");

		Aluno aluno1 = new Aluno("João","123.456.789-00", "Masculino");
		Aluno aluno2 = new Aluno("Maria","133.456.789-00", "Feminino");
		Aluno aluno3 = new Aluno("Pedro", "124.456.789-00", "Masculino");
		Aluno aluno4 = new Aluno("Ana", "125.456.789-00", "Feminino");
		Aluno aluno5 = new Aluno("Luiz", "126.456.789-00", "Masculino");

		Curso curso1 = new Curso("Java Programming", "Curso de programação Java", "Java");
		Curso curso2 = new Curso("Web Development", "Curso de desenvolvimento web", "Web");
		Curso curso3 = new Curso("Machine Learning", "Curso de aprendizado de máquina", "ML");

		Trilha trilha1 = new Trilha("Desenvolvimento de Software", "Trilha de desenvolvimento de software");
		Trilha trilha2 = new Trilha("Inteligência Artificial", "Trilha de IA");

		
		curso1.adicionaAlunoLista(aluno1);
		curso1.adicionaAlunoLista(aluno2);
		curso2.adicionaAlunoLista(aluno3);
		curso2.adicionaAlunoLista(aluno4);
		curso3.adicionaAlunoLista(aluno5);
    

		trilha1.adicionaCursoLista(curso1);
		trilha1.adicionaCursoLista(curso2);
		trilha2.adicionaCursoLista(curso3);

}
}
