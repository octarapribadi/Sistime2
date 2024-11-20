package com.time.sistime.model;

public class Mahasiswa {
    Integer id;
    String nama;
    String kelas;
    String nim;

    public Mahasiswa(Integer id, String nim, String nama, String kelas){
        this.id = id;
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
}
