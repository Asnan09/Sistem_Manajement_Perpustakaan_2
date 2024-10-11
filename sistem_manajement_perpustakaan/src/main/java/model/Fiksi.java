package com.mycompany.sistem_manajement_perpustakaan.model;

public class Fiksi extends Buku {
    private String genre;

    public Fiksi(String judul, String penulis, int tahunTerbit, String genre) {
        super(judul, penulis, tahunTerbit);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
