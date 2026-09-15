/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Pekerja extends Manusia {
    private int gaji;
    
    //constructor
    public Pekerja(String nama, int usia, String pekerjaan, int gaji) {
        super(nama, usia, pekerjaan);
        this.gaji = gaji; 
    }
    
    
    //fungsi untuk menampilkan
    @Override
    public String toString() {
        return "Nama: " + getNama() + "\n" +
               "Usia: " + usia + "\n" +
               "Pekerjaan: " + pekerjaan + "\n" +
               "Gaji: " + gaji;
    }
}