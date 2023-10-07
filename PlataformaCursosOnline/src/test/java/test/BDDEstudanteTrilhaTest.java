package test;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import facens.modelo.Aluno;
import facens.modelo.Curso;
import facens.modelo.Plataforma;
import facens.modelo.Trilha;

public class BDDEstudanteTrilhaTest {
    @Before
    public void setUp() {
        new Plataforma("Minha Plataforma de Educação");
        new Trilha("Desenvolvimento de Software", "Trilha de desenvolvimento de software");
        new Trilha("Inteligência Artificial", "Trilha de IA");
        new Curso("Java Programming", "Curso de programação Java", "Java");
		new Curso("Web Development", "Curso de desenvolvimento web", "Web");
		new Curso("Machine Learning", "Curso de aprendizado de máquina", "ML");
		
		new Aluno("João","123.456.789-00", "Masculino");
		new Aluno("Maria","133.456.789-00", "Feminino");
		new Aluno("Pedro", "124.456.789-00", "Masculino");
		new Aluno("Ana", "125.456.789-00", "Feminino");
		new Aluno("Luiz", "126.456.789-00", "Masculino");
		
    }
    
    @Test
    public void testInscricaoNaTrilha() {
    	
        Aluno aluno = new Aluno("Danilo de Paula Vieira", "123456789", "Masculino");

        Trilha trilhaFrontEnd = new Trilha("Trilha de Estudos Front End", "Descrição da Trilha De estudos Front End");
        aluno.inscreverNaTrilha(trilhaFrontEnd);
        
        assertTrue(aluno.getTrilhasInscritas().contains(trilhaFrontEnd));
    }
    
}
