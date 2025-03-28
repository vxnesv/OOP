public class Produto {
    private String nome;
    private double valor;
    private int qtdEstoque;
    private Fornecedor fornecedor;


    public Produto(String nome, double valor, int qtdEstoque, Fornecedor fornecedor) {
        this.nome = nome;
        this.valor = valor;
        this.qtdEstoque = qtdEstoque;
        this.fornecedor = fornecedor;


    }


    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

}
