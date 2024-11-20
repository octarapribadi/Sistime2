package com.time.sistime.model;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.time.sistime.MahasiswaAdapter;
import com.time.sistime.R;

public class MahasiswaHolder extends RecyclerView.ViewHolder {
    public TextView tvNim, tvNama;

    public MahasiswaHolder(View itemView) {
        super(itemView);
        tvNim = itemView.findViewById(R.id.tv_nim);
        tvNama = itemView.findViewById(R.id.tv_nama);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
