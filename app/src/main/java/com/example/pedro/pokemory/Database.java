package com.example.pedro.pokemory;

import android.database.Cursor;
import android.database.sqlite.*;
import java.util.ArrayList;
import java.util.List;

public class Database {

    private ArrayList<Integer> ids;
    private ArrayList<String> names;
    private ArrayList<Integer> scores;
    private List<RankItem> itens;

    public Database() {

    }

    public void createDatabase (SQLiteDatabase bancoDados) {

        try {

            bancoDados.execSQL("CREATE TABLE IF NOT EXISTS ranking(id INTEGER PRIMARY KEY AUTOINCREMENT, name VARCHAR, score INTEGER)");

        } catch(Exception e){
            e.printStackTrace();
        }

    }

    public void saveToDatabase (SQLiteDatabase bancoDados, String name, int score) {

        try {

            if(!name.equals("")) {

                bancoDados.execSQL("INSERT INTO ranking (name) VALUES('" + name + "') ");
                bancoDados.execSQL("INSERT INTO ranking (score) VALUES('" + score + "') ");

            }


        } catch(Exception e){
            e.printStackTrace();
        }

    }

    public List<RankItem> returnData(SQLiteDatabase bancoDados) {

        try {

            Cursor cursor = bancoDados.rawQuery("SELECT name, score FROM ranking ORDER BY score DESC", null);

            int indiceColunaId = cursor.getColumnIndex("id");
            int indiceColunaName = cursor.getColumnIndex("name");
            int indiceColunaScore = cursor.getColumnIndex("score");

            ids = new ArrayList<Integer>();
            names = new ArrayList<String>();
            scores = new ArrayList<Integer>();

            cursor.moveToFirst();
            while(cursor != null) {

                ids.add(Integer.parseInt(cursor.getString(indiceColunaId)));
                names.add(cursor.getString(indiceColunaName));
                scores.add(Integer.parseInt(cursor.getString(indiceColunaScore)));
                RankItem rankItem = new RankItem(cursor.getString(indiceColunaName), cursor.getString(indiceColunaScore));
                itens.add(rankItem);

                cursor.moveToNext();

            }

        } catch(Exception e){
            e.printStackTrace();
        }

        return itens;

    }

}
