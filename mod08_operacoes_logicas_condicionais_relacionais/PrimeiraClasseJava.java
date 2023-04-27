package mod08_operacoes_logicas_condicionais_relacionais;

import javax.swing.JOptionPane;

public class PrimeiraClasseJava {
    /* Main é um Método Auto Executável em Java */
    public static void main(String[] args) {

        System.out.println("08.01 - Operações Lógicas com IF e ELSE");

        System.out.println("========================================");
        System.out.println("CONDIÇÕES LÓGICAS COM IF, ELSE IF e ELSE;");
        System.out.println("Exemplo 01:");

        int mediaAluno = 70;
        String nome = "J";

        if (mediaAluno >= 70 && nome.equals("Amaurí")) {
            System.out.println("Você está Aprovado!");
        } else if (mediaAluno < 70) {
            System.out.println("Você está Reprovado!");
        } else {
            System.out.println("Aluno não encontrado!");
        }
        
        System.out.println("========================================");
        System.out.println("Exemplo 02:");

        double n1 = 7;
        double n2 = 7;
        double n3 = 7;
        double n4 = 7;
        double media = 0;

        media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7) {
            System.out.println("O Aluno foi Aprovado com a Média " + media);
        } else if (media >= 4 && media < 7) {
            System.out.println("O Aluno está em Recuperação com a Média " + media);
        } else {
            System.out.println("O Aluno foi Reprovado com a Média " + media);
        }

        System.out.println("========================================");
        System.out.println("08.02 - Operador Ternário Simples");
        System.out.println("SÃO UTILIZADOS EM MICRO VALIDAÇÕES EM UMA ÚNICA LINHA;");
        System.out.println("Exemplo:");
        
        String saidaResultado = media >= 7 ? "Aluno Aprovado" : (media >= 4 && media < 7) ? "Aluno em Recuperação" : "Aluno Reprovado";
        System.out.println(saidaResultado);

        System.out.println("========================================");
        System.out.println("08.03 - Operações Lógicas Aninhadas");
        System.out.println("SÃO CONDIÇÕES DENTRO DE CONDIÇÕES;");

        System.out.println("Exemplo:");

        double nota1 = 8.5;
        double nota2 = 9.5;
        double nota3 = 10.0;
        double nota4 = 10.0;
        double media_Aluno = 0;

        media_Aluno = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media_Aluno >= 5) {
            if (media_Aluno >= 7) {
                if (media_Aluno >= 9.5) {
                    System.out.println("O aluno foi Aprovado com Louvor, com Média " + media_Aluno);    
                } else {
                    System.out.println("O aluno foi Aprovado diretamente, com Média " + media_Aluno);
                }
            } else {
                System.out.println("O aluno está em Recuperação, com Média " + media_Aluno);
            }
        } else {
            System.out.println("O aluno foi Reprovado diretamente, com Média " + media_Aluno);
        }

        System.out.println("========================================");
        System.out.println("08.04 - O comando Switch e Case");
        System.out.println("É UTLIZADO PARA CONDIÇÕES CUJOS RESULTADOS SEJAM EXATOS;");

        System.out.println("Exemplo:");

        int dia = 5;
        switch (dia) {
            case 1:
            System.out.println("Você digitou o valor " + dia + " que é equivalente ao Domingo");
            break;
            case 2:
            System.out.println("Você digitou o valor " + dia + " que é equivalente a Segunda-feira");
            break;
            case 3:
            System.out.println("Você digitou o valor " + dia + " que é equivalente a Terça-feira");
            break;
            case 4:
            System.out.println("Você digitou o valor " + dia + " que é equivalente a Quarta-feira");
            break;
            case 5:
            System.out.println("Você digitou o valor " + dia + " que é equivalente a Quinta-feira");
            break;
            case 6:
            System.out.println("Você digitou o valor " + dia + " que é equivalente a Sexta-feira");
            break;
            case 7:
            System.out.println("Você digitou o valor " + dia + " que é equivalente ao Sábado");
            break;
            default:
            System.out.println("Você digitou o valor " + dia + " que não é referente a um dia da semana válido!");
            break;
        }

        System.out.println("========================================");
        System.out.println("08.05 - Operadores Relacionais");
        System.out.println("==, !=, <, >, <= e >=");

        System.out.println("Exemplos:");

        double nota01 = 9;
        double nota02 = 9;
        double nota03 = 10;

        if (nota01 == nota02) {
            System.out.println("As notas são iguais " + nota01 + " e " + nota02);
        } else {
            System.out.println("As notas são diferentes " + nota01 + " e " + nota02);
        }

        if (nota02 != nota03) {
            System.out.println("As notas são diferentes " + nota02 + " e " + nota03);
        } else {
            System.out.println("As notas são iguais " + nota02 + " e " + nota03);
        }

        if (nota02 < nota03) {
            System.out.println("A nota " + nota02 + " é menor do que a nota " + nota03);
        } else {
            System.out.println("A nota " + nota02 + " é maior do que a nota " + nota03);
        }

        if (nota03 > nota02) {
            System.out.println("A nota " + nota03 + " é maior do que a nota " + nota02);
        } else {
            System.out.println("A nota " + nota03 + " é menor do que a nota " + nota02);
        }

        if (nota02 <= nota03) {
            System.out.println("A nota " + nota02 + " é menor ou igual a nota " + nota03);
        } else {
            System.out.println("A nota " + nota02 + " é maior ou igual a nota " + nota03);
        }

        if (nota03 >= nota02) {
            System.out.println("A nota " + nota03 + " é maior ou igual a nota " + nota02);
        } else {
            System.out.println("A nota " + nota03 + " é menor ou igual a nota " + nota02);
        }

        System.out.println("========================================");
        System.out.println("08.06 - Estrutura de Repetição WHILE e DO WHILE");
        System.out.println("While: Verifica a condição e depois Executa");
        System.out.println("Do While: Executa e depois Verifica a condição");
        System.out.println("Executa uma Repetição enquanto uma determinada condição for verdadeira");

        System.out.println("Exemplos:");

        int cont01 = 0;
        while (cont01 <= 10) {
            System.out.println("O número atual é " + cont01);
            cont01 ++;
        }

        System.out.println("_____________________________________");
        int cont02 = 0;
        do {
            System.out.println("O número atual é " + cont02);
            cont02 ++;
        } while (cont02 <= 5);
            

        System.out.println("========================================");
        System.out.println("08.07 - Estrutura de Repetição FOR");
        System.out.println("Percorrer uma Quantidade de Vezes um Número ou uma Lista de Dados");

        System.out.println("Exemplos:");
        
        System.out.println("Usando o Incremento:");
        for (int n = 0; n <= 10; n += 2) {
            System.out.println("O valor atual é " + n);
        }
        System.out.println("Usando o Decremento:");
        for (int n = 10; n >= 0; n -= 2) {
            System.out.println("O valor atual é " + n);
        }

        System.out.println("========================================");
        System.out.println("08.08 - Estrutura de Repetição FOR e Parada com Break");
        System.out.println("Percorrer uma Quantidade de Vezes um Número ou uma Lista de Dados até encontrar um determinado Valor e parar o Looping");

        System.out.println("Exemplo:");

        for (int n = 0; n <= 10; n++) {
            if (n == 3) {
                System.out.println("Ebbaaa, encontrei o número " + n);
                System.out.println("Parada a execução...");
                break;
            }
        }


        System.out.println("========================================");
        System.out.println("08.09 - Estrutura de Repetição FOR e o Continue");
        System.out.println("Percorrer uma Quantidade de Vezes um Número ou uma Lista de Dados até encontrar um determinado Valor, printar e continuar o Looping");

        System.out.println("Exemplo:");

        for (int n = 0; n <= 10; n++) {
            if (n == 3 || n == 6 || n == 9) {
                System.out.println("Ebbaaa, encontrei o número " + n);
                continue;
            }
            System.out.println("Processando o Laço de Repetição FOR... " + n);
        }


        System.out.println("========================================");
        System.out.println("08.10 - Divisões e Resto com MOD do Java");
        System.out.println("%: Módulo ou Resto da Divisão");

        System.out.println("Exemplos:");

        double x = 13;
        double y = 5;
        double resto = x % y;

        System.out.println("O resto da divisão entre " + x + " e " + y + " é igual a " + resto);


        System.out.println("========================================");
        System.out.println("08.11 - Criando nossa Entrada de Dados");

        // Opção de Entrada de Dados - Criando as Caixas de Input:
        String carros = JOptionPane.showInputDialog("Informar a quantidade de carros?");
        String pessoas = JOptionPane.showInputDialog("Informar a quantidade de pessoas?");

        // Convertendo String em Double:
        double carrosNum = Double.parseDouble(carros);
        double pessoasNum = Double.parseDouble(pessoas);

        // Calculando a Qtde de Carros e os Carros que sobraram:
        int divisao = (int)(carrosNum / pessoasNum);
        int restoDiv = (int)(carrosNum % pessoasNum);

        // Mostrando a Mensagem no Terminal:
        System.out.println("A divisão para pessoas deu " + divisao + " carros e sobraram " + restoDiv + " carros.");

        // Opção de Saída de Dados - Mostrando a Mensagem em uma Caixa de Texto:
        JOptionPane.showMessageDialog(null, "A divisão para pessoas deu " + divisao + " carros e sobraram " + restoDiv + " carros.");

        
        System.out.println("========================================");
        System.out.println("08.12 - Criando uma Opção de Confirmação");

        // Criando a Caixa de Confirmação, onde: Sim = 0, Não = 1 e Cancelar = 3
        int confirmar = JOptionPane.showConfirmDialog(null, "Deseja visualizar o Resultado da Divisão?");

        if (confirmar == 0) {
            JOptionPane.showMessageDialog(null, "A quantidade de carros para as pessoas é igual a " + divisao + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Não quis ver o Resultado da Divisão.");
        }

        // Criando a Caixa de Confirmação, onde: Sim = 0, Não = 1 e Cancelar = 3
        confirmar = JOptionPane.showConfirmDialog(null, "Deseja visualizar o Resto da Divisão?");

        if (confirmar == 0) {
            JOptionPane.showMessageDialog(null, "A sobra de carros é igual a " + restoDiv + ".");
        } else {
            JOptionPane.showMessageDialog(null, "Não quis ver o Resto da Divisão.");
        }

        System.out.println("========================================");
        System.out.println("08.13 - Criando um Programa para Entrada de Notas e Cálculo da Média dos Alunos");

        // Entrada das Notas do Aluno:
        String notaBim1 = JOptionPane.showInputDialog("Informar a Nota do 1º Bimestre:");
        String notaBim2 = JOptionPane.showInputDialog("Informar a Nota do 2º Bimestre:");
        String notaBim3 = JOptionPane.showInputDialog("Informar a Nota do 3º Bimestre:");
        String notaBim4 = JOptionPane.showInputDialog("Informar a Nota do 4º Bimestre:");

        // Convertendo as Notas de String para Double:
        double bim1 = Double.parseDouble(notaBim1);
        double bim2 = Double.parseDouble(notaBim2);
        double bim3 = Double.parseDouble(notaBim3);
        double bim4 = Double.parseDouble(notaBim4);
        
        // Calculando a Média do Aluno:
        double calcMedia = (bim1 + bim2 + bim3 + bim4) / 4;

        if (calcMedia >= 7) {
            JOptionPane.showMessageDialog(null, "O Aluno está Aprovado com a Média " + calcMedia);
            System.out.println("O Aluno está em Aprovado com a Média " + calcMedia);
        } else if (calcMedia >= 5 && calcMedia < 7) {
            JOptionPane.showMessageDialog(null, "O Aluno está em Recuperação com a Média " + calcMedia);
            System.out.println("O Aluno está em Recuperação com a Média " + calcMedia);
        } else {
            JOptionPane.showMessageDialog(null, "O Aluno está Reprovado com a Média " + calcMedia);
            System.out.println("O Aluno está em Reprovado com a Média " + calcMedia);
        }


    }
}
