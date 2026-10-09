/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Main {
    public static void main(String[] args) {
        Produk produk1 = new Elektronik("Laptop", 9500000, 1);
        Produk produk2 = new Makanan("Sosis", 10000, "14-10-2026");
        
        Pegawai pegawai1 = new PegawaiTetap("Nayla", 8000000, 5000000);
        Pegawai pegawai2 = new PegawaiKontrak("Dimas", 5000000, 10);
        
        System.out.println("=====Daftar Produk=====");
        produk1.tampilkanInfo();
        System.out.println("-----------------------");
        produk2.tampilkanInfo();
        
        System.out.println("=====Daftar Pegawai=====");
        pegawai1.tampilkanInfo();
        System.out.println("------------------------");
        pegawai2.tampilkanInfo();
       
    }
        
       
    }
    

