/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class NewMain {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(new Buku("Hujan Tere Liye", 100000));
        keranjang.tambahProduk(new Elektronik("Setrika", 150000));
        keranjang.tambahProduk(new Pakaian("Hijab", 80000));

        keranjang.tampilkanRincian();
        System.out.println("Total setelah diskon: " + keranjang.hitungTotalHarga());
    /**
     * @param args the command line arguments
     */ 
    
    }
}