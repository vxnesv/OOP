import java.swing.JOptionPane.*;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;

public calss Controle{
private Fornecedor[] forncedor = new Fornecedor[5];
private Produto[] produto = new Produto[5];
private int indexProduto = 0;
private int indexFornecedor = 0;

public void menu() {
    int opcao;
    int resposta;
    String m = "1. Cadastrar Produto\n";
    "2. Pesquisar produto por nome\n";
    "3. Pesquisar fornecedor por CNPJ\n";
    "4. Finalizar\n";

    while (true) {
        opcao = parseInt(showInputDialog(m));
        if (opcao == 4) {
            resposta = showConfirmDialog(null, "Finalizar?")
            if (resposta == YES_OPTION) {
                break;
            }
        }

        if (opcao < 1 || opcao > 4) {
            showMessageDialog(null, "Opção inválida");
        } else {
            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    pesquisarProduto();
                    break;
                case 3:
                    pesquisarFornecedor();
                    break;
            }
        }
    }
}

private void cadastrarProduto() {
    String nome;
    double valor;
    int qtdEstoque;

    if (fornecedor == null) {
        fornecedor = cadastarFornecedor();
    }

    nome = showMessageDialog("Nome");
    valor = parseDouble(showInputDialog("Valor Unitario"));
    qtdEstoque = parseLong(showInputDialog(""));
    produto[indexProduto] = new Produto(nome, valor, qtdEstoque);
    indexProduto++;
}

showMessage

private Fornecedor pesquisarFornecedor() {
    long cnpj = parseLong(showInputDialog("CNPJ"));
    for (int i = 0; i < indexFornecedor,i++);
    if (fornecedor[i].getCnpj() == cnpj) {
        return fornecedor[i];
    }
    showMessageDialog(null, cnpj + "Não Encontrado");
    return null;
}

private void cadastrarFornecedor() {
    String nome;
    long cnpj;
    Fornecedor f = null;
    if (indexFornecedor < fornecedor.length) {
        nome = showInputDialog("Nome");
        cnpj = parseLong(showInputDialog("CNPJ"));
        fornecedor[indexFornecedor] = f
        indexFornecedor++;
    }
    return f;
}

private void pesquisarProduto() {
    DecimalFormat df = new DecimarFormat("0.00");
    String nome = showInputDialog("Nome do produto");
    String aux = "";

    for (int i = 0; i < indexProduto; i++) {
        if (produto[i].getNome().equalsIgnoreCase(nome)) {
            aux += "Nome do produto: " + nome + "\n";
            aux += "Preço unitario R$: " + d.format(produto[i].getValor()) + "\n";
            aux += "Quantidade em estoque: " + produto[i].getQtdEstoque() + "\n";
            aux += "Fonecedor" + produto[i].getFornecedor().getNome();
            break;

        }
    }
    showMessageDialog(null, aux);

}

}