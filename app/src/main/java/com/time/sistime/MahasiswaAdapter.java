package com.time.sistime;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.time.sistime.model.Mahasiswa;
import com.time.sistime.model.MahasiswaHolder;

import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaHolder> {
    private List<Mahasiswa> mahasiswas;

    public MahasiswaAdapter(List<Mahasiswa> mahasiswas){
        this.mahasiswas = mahasiswas;
    }

    @Override
    public MahasiswaHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_mahasiswa,parent,false);
        return new MahasiswaHolder(view);
    }

    @Override
    public void onBindViewHolder(MahasiswaHolder holder, int position) {
        Mahasiswa mahasiswa = mahasiswas.get(position);
        holder.tvNim.setText(mahasiswa.getNim());
        holder.tvNama.setText(mahasiswa.getNama());
    }

    @Override
    public int getItemCount() {
        return mahasiswas.size();
    }
}
