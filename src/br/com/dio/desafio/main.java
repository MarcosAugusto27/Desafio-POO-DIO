package br.com.dio.desafio;
import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class main {

	public static void main(String[] args){
		
	        Curso curso1 = new Curso();
	        curso1.setTitulo("curso java");
	        curso1.setDescricao("descrição curso java");
	        curso1.setCargaHoraria(8);

	        Curso curso2 = new Curso();
	        curso2.setTitulo("curso programaçao orientada a objetos");
	        curso2.setDescricao("descrição curso programaçao orientada a objetos");
	        curso2.setCargaHoraria(4);

	        Mentoria mentoria = new Mentoria();
	        mentoria.setTitulo("mentoria de java");
	        mentoria.setDescricao("descrição mentoria java");
	        mentoria.setData(LocalDate.now());

	        System.out.println(curso1);
	        System.out.println(curso2);
	        System.out.println(mentoria);

	  
	        Bootcamp bootcamp = new Bootcamp();
	        bootcamp.setNome("Bootcamp java Developer");
	        bootcamp.setDescriçao("Descrição Bootcamp java Developer");
	        bootcamp.getConteudo().add(curso1);
	        bootcamp.getConteudo().add(curso2);
	        bootcamp.getConteudo().add(mentoria);
	        
	        System.out.println("-----------------------------");

	        Dev devMarcos = new Dev();
	        devMarcos.setNome("Marcos");
	        devMarcos.inscreverBootcamp(bootcamp);
	        System.out.println("Conteúdos inscritos: " + devMarcos.getConteudosInscritos());
	        devMarcos.progredir();
	        System.out.println("-");
	        System.out.println("Conteúdos Concluídos: " + devMarcos.getConteudosConcluidos());
	        System.out.println("Conteúdos inscritos: " + devMarcos.getConteudosInscritos());
	        System.out.println("XP: " + devMarcos.calcularXp());


	        System.out.println("-----------------------------");

	        Dev devJoao = new Dev();
	        devJoao.setNome("João");
	        devJoao.inscreverBootcamp(bootcamp);
	        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
	        devJoao.progredir();
	        devJoao.progredir();
	        devJoao.progredir();
	        System.out.println("-");
	        System.out.println("Conteúdos Concluídos: " + devJoao.getConteudosConcluidos());
	        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
	        System.out.println("XP: " + devJoao.calcularXp());


	    }
	}


	    
	

       