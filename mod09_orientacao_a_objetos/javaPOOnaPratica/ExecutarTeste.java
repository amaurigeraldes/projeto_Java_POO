package mod09_orientacao_a_objetos.javaPOOnaPratica;

import java.math.BigDecimal;

public class ExecutarTeste {
    public static void main(String[] args) {

        // Instanciando os Produtos:
        Produto produto1 = new Produto();
        produto1.setId(1L);
        produto1.setNome("Módulo Orientação a Objeto");
        produto1.setValor(BigDecimal.valueOf(100.00));

        Produto produto2 = new Produto();
        produto2.setNome("Módulo de String Boot API REST");
        produto2.setId(2L);
        produto2.setValor(BigDecimal.valueOf(300.00));

        Produto produto3 = new Produto();
        produto3.setNome("Módulo Angular 8");
        produto3.setId(3L);
        produto3.setValor(BigDecimal.valueOf(150.00));

        Produto produto4 = new Produto();
        produto4.setNome("Módulo de Hibernate");
        produto4.setId(4L);
        produto4.setValor(BigDecimal.valueOf(250.00));

        // Instanciando a Venda:
        Venda venda = new Venda();
        venda.setDescricaoVenda("Venda Curso Formação Java");
        venda.setEnderecoEntrega("Entrega por e-mail");
        venda.setId(10L);
        venda.setNomeCliente("Amaurí Geraldes");
        // venda.setValorTotal(BigDecimal.valueOf(197.00));

        // Criando os Produtos:
        // Não permite fazer validações
        venda.getListaProdutos().add(produto1);
        venda.getListaProdutos().add(produto2);

        // Permite fazer validações antes de adicionar na Lista
        venda.addProduto(produto3);
        venda.addProduto(produto4);

        System.out.println("Descrição da Venda: "+venda.getDescricaoVenda()+". Total R$" + venda.getValorTotal());
        

    }
}
