package com.example.pedro.pokemory;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.pedro.pokemory.Adapter.RankAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RankingActivity extends AppCompatActivity {

    private ArrayList<RankItem> itens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        Database database = new Database();
        database.createDatabase();
        itens = database.returnData();

        List<RankItem> list = itens;
        ListView listRanking = findViewById(R.id.listViewRanking);
        RankAdapter adapter = new RankAdapter(list, this);
        listRanking.setAdapter(adapter);

    }

    private List<RankItem> getRanking(){
        return new ArrayList<>(Arrays.asList(
                new RankItem("Cappelli", "777"),
                new RankItem("Pedro", "500")));
    }
}
