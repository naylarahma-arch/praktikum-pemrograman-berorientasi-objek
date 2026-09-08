/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum_3;

/**
 *
 * @author LENOVO
 */
public class MainMobil {
    public static void main (String[] args) {
        Mobil car1 = new Mobil("Lexus IS", "300h Luxury", 2026, "White");
        Mobil car2 = new Mobil("Porsche macan", "GTS", 2026, "Blue");
        Mobil car3 = new Mobil("Jaguar XE", "P250 R-Dynamic", 2025, "Green");

        car1.displayInfo(1);
        car2.displayInfo(2);
        car3.displayInfo(3);

        car2.gantiWarna("Red", 1);
        car2.displayInfo(1);
    }
}
    

