import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso cursoJava = new Curso("curso java", "descrição curso java", 8);

		Curso cursoJs = new Curso("curso js", "descrição curso js", 4);

		System.out.println(cursoJava);
		System.out.println(cursoJs);

		Mentoria mentoriaJava = new Mentoria("mentoria java", "descrição mentoria java", LocalDate.now());

		System.out.println(mentoriaJava);
	}
}