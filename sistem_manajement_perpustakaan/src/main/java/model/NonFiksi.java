package com.mycompany.sistem_manajement_perpustakaan.model;

public class NonFiksi extends Buku {
    private String kategori;

    public NonFiksi(String judul, String penulis, int tahunTerbit, String kategori) {
        super(judul, penulis, tahunTerbit);
        this.kategori = kategori;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}
