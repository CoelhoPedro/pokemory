package com.example.pedro.pokemory.model;

/**
 * Created by user on 19/07/2018.
 */

public class RankItem {

    private String name;
    private String score;

    public RankItem(String name, String score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public String getScore() {
        return score;
    }
}
