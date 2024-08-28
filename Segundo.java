public class Segundo {
	public static void main(String[] args) {
		double LivroJava8;
		double LivroTDD;
		LivroJava8 = 59.90;
		LivroTDD = 59.90;
		double soma = LivroJava8 + LivroTDD;
		System.out.print("A soma é: "+soma);
		Livro livro = new Livro ();
		livro.nome = "Java 8 prático";
		livro.descricao = "Novos recursos da linguagem";
		livro.valor = 59.90;
		livro.isbn = "978-85-66250-46-6";
	}
}