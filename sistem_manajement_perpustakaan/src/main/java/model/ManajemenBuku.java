package com.mycompany.sistem_manajement_perpustakaan.model;

import java.util.ArrayList;

public class ManajemenBuku implements CRUDOperations<Buku> {
    private final ArrayList<Buku> daftarBuku = new ArrayList<>(); 

    @Override
    public void tambah(Buku buku) {
        daftarBuku.add(buku);
    }

    @Override
    public void hapus(Buku buku) {
        daftarBuku.remove(buku);
    }

    @Override
    public void update(Buku buku, Buku newBuku) {
        int index = daftarBuku.indexOf(buku);
        if (index != -1) {
            daftarBuku.set(index, newBuku);
        }
    }

    @Override
    public Buku cari(String judul) {
        for (Buku buku : daftarBuku) {
            if (buku.getJudul().equalsIgnoreCase(judul)) {
                return buku;
            }
        }
        return null;
    }

    public ArrayList<Buku> getDaftarBuku() {
        return daftarBuku;
    }
}
