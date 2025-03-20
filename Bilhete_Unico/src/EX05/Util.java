import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;

public class Util {

    private Bilhete[] bilhete = new Bilhete[5];
    private int index = 0;

    public void menu() {
        String aux = "Escolha uma opção\n";
        aux += "1. Emitir bilhete\n";
        aux += "2. Carregar bilhete\n";
        aux += "3. Consultar saldo\n";
        aux += "4. Passar na catraca\n";
        aux += "5. Finalizar\n";
        int opcao;

        while(true) {
            opcao = parseInt(showInputDialog(aux));
            if(opcao == 5) {
                break;
            }
            if(opcao < 1 || opcao > 5) {
                showMessageDialog(null, "Opção inválida");
            }
            else {
                switch(opcao) {
                    case 1:
                        emitirBilhete();
                        break;

                    case 2:
                        carregarBilhete();
                        break;

                    case 3:
                        consultarSaldo();
                        break;

                    case 4:
                        passarNaCatraca();
                        break;

                }
            }
        }
    }

    public void emitirBilhete() {
        String nome = showInputDialog("Nome");
        String perfil = showInputDialog("Perfil --> comum ou estudante ou professor");
        long cpf = parseLong(showInputDialog("CPF"));
        Usuario usuario = new Usuario(nome, perfil, cpf);
        bilhete[index] = new Bilhete(usuario);
        index++;
    }

    public void consultarSaldo(){
        int posicao = pesquisar();
        if (posicao == -1){
            showMessageDialog(null, "CPF não encontrado");

        }
    }

    public void carregarBilhete(){
        int posicao = pesquisar();
        double valor;

        if(posicao != -1) {
            valor = parseDouble(showInputDialog("Valor a ser carregado"));
            showMessageDialog(null,[posicao].carregar(valor));


        }
    }

    public void passarNaCatraca(){
        int posicao = pesquisar();
        if (posicao != -1){
            showMessageDialog(null,[posicao].passarNaCatraca());
        }

    }

    public int pesquisar(){
        int posicao = -1;
        long cpf = parseLong(showInputDialog("CPF para pesquisa"));
        for(int i = 0; i < index; i++){
            if(bilhete[i].usuario.cpf == cpf){
                return i;
            }
        }
        return -1;
    }



}