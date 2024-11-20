package com.time.sistime;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.time.sistime.model.Mahasiswa;

import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {
    RecyclerView rcView;
    MahasiswaAdapter mahasiswaAdapter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_list, container, false);
        rcView = v.findViewById(R.id.rc_mahasiswa);
        rcView.setLayoutManager(new LinearLayoutManager(getActivity()));
        List<Mahasiswa> mahasiswas = generateMahasiswas();
        mahasiswaAdapter = new MahasiswaAdapter(mahasiswas);
        rcView.setAdapter(mahasiswaAdapter);

        return v;
    }

    List<Mahasiswa> generateMahasiswas(){
        List<Mahasiswa> mahasiswas = new ArrayList<>();
        Mahasiswa mahasiswa;
        mahasiswa = new Mahasiswa(1,"112233","andi", "tia22");
        mahasiswas.add(mahasiswa);
        mahasiswa = new Mahasiswa(2,"223344","budi", "tia22");
        mahasiswas.add(mahasiswa);
        mahasiswa = new Mahasiswa(3,"334455","citra", "tia22");
        mahasiswas.add(mahasiswa);
        return mahasiswas;
    }
}