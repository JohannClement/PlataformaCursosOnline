package test;
import static org.junit.Assert.assertEquals;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import facens.modelo.Aluno;
import facens.modelo.Curso;
import facens.modelo.Plataforma;
import facens.modelo.Trilha;


public class BDDEdicao{

    private Plataforma plataforma;
    private Aluno aluno1, aluno2, aluno3, aluno4, aluno5;
    private Curso curso1, curso2, curso3;
    private Trilha trilha1, trilha2;
    private double i = 0.0;

    @Before
    public void setUp() {
        plataforma = new Plataforma("Minha Plataforma de Educação");
        trilha1 = new Trilha("Desenvolvimento de Software", "Trilha de desenvolvimento de software");
        trilha2 = new Trilha("Inteligência Artificial", "Trilha de IA");
        curso1 = new Curso("Java Programming", "Curso de programação Java", "Java");
		curso2 = new Curso("Web Development", "Curso de desenvolvimento web", "Web");
		curso3 = new Curso("Machine Learning", "Curso de aprendizado de máquina", "ML");
		
		aluno1 = new Aluno("João","123.456.789-00", "Masculino");
		aluno2 = new Aluno("Maria","133.456.789-00", "Feminino");
		aluno3 = new Aluno("Pedro", "124.456.789-00", "Masculino");
		aluno4 = new Aluno("Ana", "125.456.789-00", "Feminino");
		aluno5 = new Aluno("Luiz", "126.456.789-00", "Masculino");
    }
    
    //Teste

    @Test
    public void testEditarTrilhaExistente() {
    	//ARANGE
    	curso1.adicionaAlunoLista(aluno1);
    	curso1.adicionaAlunoLista(aluno2);
    	curso2.adicionaAlunoLista(aluno3);
    	curso2.adicionaAlunoLista(aluno4);
    	curso3.adicionaAlunoLista(aluno5);
		
    	trilha1.adicionaCursoLista(curso1);
    	trilha1.adicionaCursoLista(curso2);
    	trilha2.adicionaCursoLista(curso3);
		
    	plataforma.adicionarTrilhaLista(trilha1);
    	plataforma.adicionarTrilhaLista(trilha2);
		
    	//ACTION
    	plataforma.editarTrilhaPorNome("Inteligência Artificial", "Processamento de Sinais", "Trilha de PS");
		
    	Iterator<Trilha> iterator= plataforma.getListaTrilha().iterator();
		
    	while(iterator.hasNext()) {
    		Trilha trilha= iterator.next();
			
    		if(trilha.getNome().equals("Processamento de Sinais")) {
    			i++;
    		}
    	}
		
    	//ASSERT
    	assertEquals(i, 1.0, 0.0001);
    }
    
}