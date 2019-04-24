package com.example.gandatadyosurya.aplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<String> kota, kota1;

    public DataAdapter(ArrayList<String> kota,ArrayList<String> kota1 ){
        this.kota = kota;
        this.kota1 = kota1;
    }


    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_row, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder viewHolder, int i) {

        viewHolder.txtkota.setText(kota.get(i));
        viewHolder.txtkota1.setText(kota1.get(i));
    }

    @Override
    public int getItemCount() {
        return kota.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView txtkota, txtkota1;
        public ViewHolder(View view) {
            super(view);

            txtkota = (TextView)view.findViewById(R.id.nama_kota);
            txtkota1 = (TextView)view.findViewById(R.id.nama_kota1);
        }
    }
}