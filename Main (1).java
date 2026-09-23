/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) { 
        Mobil mobil = new Mobil(); 
        mobil.nama = "Mazda"; 
        mobil.kecepatan = 180; 
        mobil.jumlahPintu = 4; 
        mobil.tampilkanInfo(); 
 
        SepedaMotor motor = new SepedaMotor(); 
        motor.nama = "Yamaha"; 
        motor.kecepatan = 120; 
        motor.jenisMesin = "2-tak"; 
        motor.tampilkanInfo(); 
    } 
} 

