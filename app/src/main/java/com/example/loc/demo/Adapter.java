package com.example.loc.demo;

import android.view.ViewGroup;

import com.example.loc.library.AGVRecyclerViewAdapter;
import com.example.loc.library.AsymmetricItem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by loc on 31/01/2016.
 */
public class Adapter extends AGVRecyclerViewAdapter<ViewHole> {
    List<item> list;

    public Adapter(List<item> list) {
        this.list = list;
    }

    @Override
    public AsymmetricItem getItem(int position) {
        return list.get(position);
    }
    // kiểu view
    @Override
    public ViewHole onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHole(parent, viewType);
    }
    @Override
    public void onBindViewHolder(ViewHole holder, int position) {
        holder.bind(list.get(position));
    }
    @Override
    public int getItemViewType(int position) {
        return position % 2 == 0 ? 1 : 0;
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
}
