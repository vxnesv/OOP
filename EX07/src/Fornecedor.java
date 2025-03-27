public class Fornecedor {
    private String nome;
    private long cnpj;
    private List<produto> produtos;

    public Fornecedor(String nome, long cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.produtos = new ArrayList <Produto>();
    }



}

    public void armazena(Produto produto){
        if (produto != null)
            produtos.add(produto);
    }

    public List<produto> getProdutos() {
        return produtos;
    }