package com.example.pedro.pokemory.Adapter;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.pedro.pokemory.R;
import com.example.pedro.pokemory.model.RankItem;

import java.util.List;

/**
 * Created by user on 19/07/2018.
 */

public class RankAdapter extends BaseAdapter {

    private final List<RankItem> items;
    private final Activity activity;

    public RankAdapter(List<RankItem> items, Activity activity) {
        this.items = items;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        final View view = activity.getLayoutInflater().inflate(R.layout.rank_list, parent, false);
        RankItem itemInfo = items.get(position);

        final String itemName = itemInfo.getName();
        final String score = itemInfo.getScore();
        final int itemPosition = position+1;
        TextView textViewRankPosition = view.findViewById(R.id.textViewRankPosition);
        TextView textViewRankName = view.findViewById(R.id.textViewRankName);
        TextView textViewRankScore = view.findViewById(R.id.textViewRankScore);

        textViewRankName.setText(itemName);
        textViewRankScore.setText(score);
        textViewRankPosition.setText("#" + itemPosition);

        return view;
    }
}
