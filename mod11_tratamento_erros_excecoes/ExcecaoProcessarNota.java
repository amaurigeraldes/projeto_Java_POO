package mod11_tratamento_erros_excecoes;

public class ExcecaoProcessarNota extends Exception {
    

    public ExcecaoProcessarNota(String erro) {
        // super(erro);
        // Ou:
        super("Erro no arquivo TXT ao processar as Notas do Aluno!" + erro);
    }


}
