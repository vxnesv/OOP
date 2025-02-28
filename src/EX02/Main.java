package EX02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000");
        Scanner sc = new Scanner(System.in);
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto();

        //entrada de dados
        System.out.println("Informe as coordenadas do ponto 1:");
        p1.x = sc.nextInt();
        p1.y = sc.nextInt();

        System.out.println("Informe as coordenadas do ponto 2:");
        p2.x = sc.nextInt();
        p2.y = sc.nextInt();

        //impressao da distancia entre os dois pontos

        System.out.println("distancia do p1 para o p2: " + df.format(p1.calcularDistancia(p2)));
        System.out.println("distancia do p2 para o p1: " + df.format(p2.calcularDistancia(p1)));

        //impressao da distancia de cada ponto  ate a origem
        System.out.println();
        System.out.println("distancia do p1 até a origem: " + df.format(p1.calcularOrigem()));
        System.out.println("distancia do p1 até a origem: " + df.format(p2.calcularOrigem()));


        //impressao do ponto mais proximo da origem
        System.out.println();
        Ponto aux = p1.maisProximo(p1, p2);
        System.out.println("ponto mais proximo: " + aux.formatarPonto());



    }




}
