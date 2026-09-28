/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */

import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> daftarProduk = new ArrayList<>();

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
    }

    public double hitungTotalHarga() {
        double total = 0;
        for (Produk p : daftarProduk) {
            total += p.getHargaSetelahDiskon();
        }
        return total;
    }

    public void tampilkanRincian() {
        for (Produk p : daftarProduk) {
            System.out.println(p.getNama() + " | Harga: " + p.getHarga()
                    + " | Diskon: " + p.hitungDiskon()
                    + " | Setelah diskon: " + p.getHargaSetelahDiskon());
        }
    }
}
