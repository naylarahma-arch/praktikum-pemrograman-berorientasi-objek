/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum9;

/**
 *
 * @author acer
 */
public class NewMain {
// Kode utama untuk pengujian 
public class Main { 
    public static void main(String[] args) { 
        Abstrak_Kendaraan mobil = new Mobil(); 
        Abstrak_Kendaraan sepeda = new Sepeda();
        mobil.berjalan(); 
        mobil.info(); 
        
        sepeda.berjalan(); 
        sepeda.info(); 
} 
}

   
    
}
