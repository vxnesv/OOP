import java.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;

public calss Controle{
    private Fornecedor[] forncedor = new Fornecedor[5];
    private Produto[] produto = new Produto[5];
    private int indexProduto = 0;
    private int indexFornecedor = 0;

    public void menu(){
        int opcao;
        int resposta;
        String m ="1. Cadastrar Produto\n";
                "2. Pesquisar produto por nome\n";
                "3. Pesquisar fornecedor por CNPJ\n";
                "4. Finalizar\n";

        while(true) {
            opcao = parseInt(showInputDialog(m));
            if(opcao == 4) {
                resposta = showConfirmDialog(null, "Finalizar?")
                if(resposta == YES_OPTION){
                    break;
                }

            }

            if(opcao < 1 || opcao > 4) {
                showMessageDialog(null, "Opção inválida");
            }



    }
}

