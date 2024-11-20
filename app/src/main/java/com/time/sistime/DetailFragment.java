package com.time.sistime;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.time.sistime.model.Mahasiswa;

public class DetailFragment extends Fragment {
    Mahasiswa mahasiswa;
    TextView tvNim, tvNama, tvKelas;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = this.getArguments();
        mahasiswa = (Mahasiswa)bundle.getSerializable("mahasiswa");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_detail, container, false);
        tvNim = v.findViewById(R.id.tv_detail_nim);
        tvNama = v.findViewById(R.id.tv_detail_nama);
        tvKelas = v.findViewById(R.id.tv_detail_kelas);
        try {
            tvNim.setText(mahasiswa.getNim());
            tvNama.setText(mahasiswa.getNama());
            tvKelas.setText(mahasiswa.getKelas());
        }
        catch(Exception ex){
            Log.e("myerror",ex.getMessage());
        }
        return v;
    }
}