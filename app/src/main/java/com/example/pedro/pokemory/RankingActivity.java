package com.example.pedro.pokemory;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.pedro.pokemory.Adapter.RankAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RankingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ranking);

        SQLiteDatabase bancoDados = openOrCreateDatabase("pokemory", MODE_PRIVATE, null);
        Database database = new Database();
        database.createDatabase(bancoDados);

        List<RankItem> itens = database.returnData(bancoDados);

        List<RankItem> list = getRanking();
        ListView listRanking = findViewById(R.id.listViewRanking);
        RankAdapter adapter = new RankAdapter(itens, this);
        listRanking.setAdapter(adapter);

    }

    private List<RankItem> getRanking(){
        return new ArrayList<>(Arrays.asList(
                new RankItem("Cappelli", "777"),
                new RankItem("Pedro", "500")));

    }
}
