package EX01;

import java.util.Scanner;

public class Main {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);
        Jogador jogador = new Jogador();

        //entrada de dados
        System.out.println("Nome:");
        jogador.nome = sc.nextLine();
        for(int i = 0; i < jogador.score.length; i++){
            System.out.print("Score" + (i+1) + ": ");
            jogador.score[i] = sc.nextInt();
        }
        //saida de dados
        System.out.println();
        System.out.prinln("Nome: " + jogador.nome);
        System.out.prinln("Score total: " + jogador.scoreTotal());

    }

}
