package mod07_tipos_e_variaveis;
public class PrimeiraClasseJava {
	
	/* Variável Global é acessível a todos os Métodos e o seu valor é compartilhado */
	static int menorIdadeGlobal = 17;
	
	
	/* Main é um Método Auto Executável em Java */ 
	public static void main(String[] args) {
		
		/* Escreve texto no Console */
		System.out.println("Meu Primeiro Programa em JAVA do Curso Formação Java WEB!!!");
		System.out.println("===========================================================");
		System.out.println("Estou aprendendo Java POO. É bem legal!");
		System.out.println("===========================================================");
		System.out.println("Java é Programação Orientada a Objetos.");
		System.out.println("===========================================================");
		
		System.out.println("07.03 - Tipos primitivos de variáveis");
		/* O valor default de uma variável Int declarada sempre será zero */
		// int num1;
		int num2 = 0;
		System.out.println(num2);
		System.out.println("===========================================================");
		System.out.println("07.04 - Estrutura de declaração de variáveis");
		// boolean log1;
		// boolean log2;
		// int num3;
		// int num4;
		// short num5;
		// short num6;
		
		int maiorIdade = 18;
		System.out.println("A maior idade é aos " + maiorIdade + " anos.");
		// int idadeIdoso = 60;
		// int idadeJovem = 16;
		// int idadeCrianca = 7;
		
		String cpf = "145.785.789-54";
		System.out.println("O número do Cpf é " + cpf + ".");
		System.out.println("===========================================================");
		System.out.println("07.05 - Variável local e global");

		
		
		/* Variável Local pertence somente a este Método, dentro do main */
		int menorIdade = 16;
		System.out.println("O valor da Variável Local é " + menorIdade);
		
		/* Uma Variável Global poderá ser utilizada em qualquer local  */
		System.out.println("O valor da Variável Global Local é " + menorIdadeGlobal);
		
		/* Invocando o metodo2 de dentro do main */ 
		 metodo2();

		System.out.println("===========================================================");
		System.out.println("07.06 - Fazendo operações entre números inteiros");
		
		int n1 = 90, n2 = 70, n3 = 50, n4 = 88;
		System.out.println("A média das notas é " + (n1 + n2 + n3 + n4) / 4);
		float n5 = 90, n6 = 70, n7 = 50, n8 = 88;
		System.out.println("A média das notas é " + (n5 + n6 + n7 + n8) / 4);
		
		System.out.println("===========================================================");
		System.out.println("07.07 - O tipo double de dados");
		double x1 = 90, x2 = 70, x3 = 50, x4 = 88;
		double mediaFinal = (x1 + x2 + x3 + x4) / 4;
		System.out.println("A média das notas é " + mediaFinal);
			
		System.out.println("===========================================================");
		System.out.println("07.08 - O tipo CHAR de caracteres");
			
		/* CHAR representa uma letra ou caracter. Usar Aspas Simples na atribuição */
		char pessoaFisica = 'F';
		// char pessoaJuridica = 'J';
		
		/* Usar Aspas Simples na comparação */
		if(pessoaFisica == 'F') {
			System.out.println("Pessoa Física");
		} else {
			System.out.println("Pessoa Jurídica");
		}
		
		System.out.println("===========================================================");
		System.out.println("07.09 - O tipo String de caracteres");
		
		/* String em Java, será sempre um Texto de um tamanho qualquer */
		// String textoQualquer = "efwqfhnkjsadn kjls cl slljkljn455577889";
		// String nome, cpf_cli, telefone, endereco;
		
		System.out.println("===========================================================");
		System.out.println("07.10 - Concatenação de variáveis");
		
		/* Concatenação = unir ou juntar dados */
		String nomeCompleto = "Amaurí Geraldes";
		String numCpf = "027.456.288-01";
		String numTelefone = "+55 11 99643-2219";
		String endResid = "Rua Vere, 63";
		String bairro = "Vila Carioca";
		String cidade = "Guarulhos";
		String estado = "SP";
		String cep = "07083-040";
		
		String concatenando = nomeCompleto + " - " + numCpf + " - " + numTelefone +
				" - " + endResid + " - " + bairro + " - " + cidade + " - " +
				estado + " - " + cep;
		
		System.out.println("Meu nome é " + concatenando);
			
			
		 
		 
	}
	
	public static void metodo2() {
		int mediaAno = 50;
		System.out.println("O valor da Variável Local é " + mediaAno);
		System.out.println("O valor da Variável Global é " + menorIdadeGlobal);
	}
	
}

