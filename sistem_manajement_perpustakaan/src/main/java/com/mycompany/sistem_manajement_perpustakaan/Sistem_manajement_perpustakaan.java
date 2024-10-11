package com.mycompany.sistem_manajement_perpustakaan;

import com.mycompany.sistem_manajement_perpustakaan.model.Anggota;
import com.mycompany.sistem_manajement_perpustakaan.model.Buku;
import com.mycompany.sistem_manajement_perpustakaan.model.Fiksi;
import com.mycompany.sistem_manajement_perpustakaan.model.NonFiksi;
import com.mycompany.sistem_manajement_perpustakaan.model.ManajemenBuku;

import java.util.ArrayList;

public final class Sistem_manajement_perpustakaan { 
    static ArrayList<Buku> daftarBuku = new ArrayList<>();
    static ArrayList<Anggota> daftarAnggota = new ArrayList<>();

    public static void main(String[] args) {
        ManajemenBuku manajemenBuku = new ManajemenBuku();

        // Menambahkan buku fiksi dan non-fiksi
        Buku buku1 = new Fiksi("Bahasa Inggris", "Wawan", 2020, "Edukasi");
        Buku buku2 = new NonFiksi("Bahasa Indonesi", "Faris", 2018, "Sejarah");
        Buku buku3 = new Fiksi("IPA", "NUNO", 2021, "Sains");
        Buku buku4 = new NonFiksi("IPS", "Jakiatsal", 2019, "Sosiologi");
        Buku buku5 = new Fiksi("Penjeskes", "Arsy", 2022, "Olahraga");

        manajemenBuku.tambah(buku1);
        manajemenBuku.tambah(buku2);
        manajemenBuku.tambah(buku3);
        manajemenBuku.tambah(buku4);
        manajemenBuku.tambah(buku5);

        Anggota anggota1 = new Anggota("Asnan", "0906");
        Anggota anggota2 = new Anggota("LI", "0609");
        Anggota anggota3 = new Anggota("Jepri", "2112");
        Anggota anggota4 = new Anggota("Mark", "6489");
        Anggota anggota5 = new Anggota("Jupiter", "7112");

        daftarAnggota.add(anggota1);
        daftarAnggota.add(anggota2);
        daftarAnggota.add(anggota3);
        daftarAnggota.add(anggota4);
        daftarAnggota.add(anggota5);

        anggota1.pinjamBuku(buku1);
        anggota2.pinjamBuku(buku5);
        anggota5.pinjamBuku(buku3);

        System.out.println("----------------------------------------------------");
        System.out.println("No  | Judul Buku        | Penulis     | Tahun Terbit");
        System.out.println("----------------------------------------------------");
        for (int i = 0; i < daftarBuku.size(); i++) {
            Buku buku = daftarBuku.get(i);
            System.out.printf("%-3d | %-17s | %-11s | %-12d%n", i + 1, buku.getJudul(), buku.getPenulis(), buku.getTahunTerbit());
        }

        System.out.println("\n==================== Proses Peminjaman Buku ============================");
        System.out.println("No Anggota | Nama Peminjam | Judul Buku       | Penulis     | Tahun Terbit");
        System.out.println("--------------------------------------------------------------------------");

        for (Anggota anggota : daftarAnggota) {
            ArrayList<Buku> bukuDipinjam = anggota.getBukuDipinjam();
            if (!bukuDipinjam.isEmpty()) {
                for (Buku buku : bukuDipinjam) {
                    System.out.printf("%-11s | %-13s | %-16s | %-11s | %-12d%n",
                            anggota.getNomorAnggota(), anggota.getNama(), buku.getJudul(), buku.getPenulis(), buku.getTahunTerbit());
                }
            }
        }
    }
}
