package com.mycompany.sistem_manajement_perpustakaan.model;

public interface CRUDOperations<T> {
    void tambah(T obj);
    void hapus(T obj);
    void update(T obj, T newObj);
    T cari(String keyword);
}
