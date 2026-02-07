import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso cursoJava = new Curso("curso java", "descrição curso java", 8);

		Curso cursoJs = new Curso("curso js", "descrição curso js", 4);

		Mentoria mentoriaJava = new Mentoria("mentoria java", "descrição mentoria java", LocalDate.now());

		Bootcamp bootcampJava = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
		bootcampJava.addConteudos(cursoJava, mentoriaJava);

		Bootcamp bootcampJs = new Bootcamp("Bootcamp Js Developer", "Descrição Bootcamp Js Developer");
		bootcampJs.addConteudos(cursoJs);

		System.out.println(bootcampJava.getConteudos());

		Dev devCamila = new Dev("Camila");
		bootcampJava.inscreverDevs(devCamila);

		Dev devJoao = new Dev("João");
		bootcampJs.inscreverDevs(devJoao);

		System.out.println("A Dev Camila está inscrita nos seguintes conteúdos: " + devCamila.getConteudosInscritos());
		System.out.println("XP Camila: " + devCamila.calcularTotalXp());
		System.out.println();
		System.out.println("O Dev João está inscrito nos seguintes conteúdos: " + devJoao.getConteudosInscritos());
		System.out.println("XP João: " + devJoao.calcularTotalXp());

		System.out.println("\n---------------------------------------------\n");

		devCamila.progredir();
		devJoao.progredir();
		System.out.println();

		System.out.println("A Dev Camila concluiu os seguintes conteúdos: " + devCamila.getConteudosConcluidos());
		System.out.println("XP Camila: " + devCamila.calcularTotalXp());
		System.out.println();
		System.out.println("O Dev João concluiu os seguintes conteúdos: " + devJoao.getConteudosConcluidos());
		System.out.println("XP João: " + devJoao.calcularTotalXp());

		System.out.println("\n---------------------------------------------\n");

		System.out.println("A Dev Camila está inscrita nos seguintes conteúdos: " + devCamila.getConteudosInscritos());
		System.out.println("XP Camila: " + devCamila.calcularTotalXp());
		System.out.println();
		System.out.println("O Dev João está inscrito nos seguintes conteúdos: " + devJoao.getConteudosInscritos());
		System.out.println("XP João: " + devJoao.calcularTotalXp());

		System.out.println("\n---------------------------------------------\n");

		devCamila.progredir();
		System.out.println();

		System.out.println("A Dev Camila concluiu os seguintes conteúdos: " + devCamila.getConteudosConcluidos());
		System.out.println("XP Camila: " + devCamila.calcularTotalXp());
		System.out.println();
		System.out.println("O Dev João concluiu os seguintes conteúdos: " + devJoao.getConteudosConcluidos());
		System.out.println("XP João: " + devJoao.calcularTotalXp());
	}
}