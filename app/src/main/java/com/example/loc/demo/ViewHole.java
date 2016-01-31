package com.example.loc.demo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by loc on 31/01/2016.
 */
public class ViewHole extends RecyclerView.ViewHolder {
    TextView textView;

    public ViewHole(ViewGroup parent, int viewType) {
        super(LayoutInflater.from(parent.getContext()).inflate(
                viewType == 0 ? R.layout.adapter_item : R.layout.adapter_item_odd, parent, false));
        if (viewType == 0) {
            textView = (TextView) itemView.findViewById(R.id.textview);
        } else {
            textView = (TextView) itemView.findViewById(R.id.textview_odd);
        }
    }
    public void bind(item item) {
        textView.setText(String.valueOf(item.getPosition()));
    }
    public ViewHole(View itemView) {
        super(itemView);
    }
}
