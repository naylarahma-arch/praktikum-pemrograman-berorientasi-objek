/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Responsi;

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        // Polimorfisme: referensi induk (Produk) memegang objek turunan
        Produk produk1 = new Elektronik("Laptop HP", 8500000, 2);
        Produk produk2 = new Makanan("Roti Coklat", 15000, "30-12-2026");

        // Polimorfisme: referensi induk (Pegawai) memegang objek turunan
        Pegawai pegawai1 = new PegawaiTetap("Meila Dewin Khayarsya", 9000000, 1500000);
        Pegawai pegawai2 = new PegawaiKontrak("Jude Bellingham", 5000000, 12);

        System.out.println("========== DAFTAR PRODUK ==========");
        produk1.tampilkanInfo(); // memanggil versi Elektronik
        System.out.println("-----------------------------------");
        produk2.tampilkanInfo(); // memanggil versi Makanan

        System.out.println("\n========== DAFTAR PEGAWAI =========");
        pegawai1.tampilkanInfo(); // memanggil versi PegawaiTetap
        System.out.println("-----------------------------------");
        pegawai2.tampilkanInfo(); // memanggil versi PegawaiKontrak
    }
}