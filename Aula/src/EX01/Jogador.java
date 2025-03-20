package EX01;

import org.w3c.dom.ls.LSOutput;

import java.util.Locale;

public class Jogador {

    String name;
    int[] score = new int[3];


    public int scoreTotal() {
        int total = 0;
        for (int i = 0; i < score.length; i++) {
            total += score[i];

        }
        return total;
    }
}