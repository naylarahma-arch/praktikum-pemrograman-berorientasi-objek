/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas9;

abstract class Hewan {
    abstract void bersuara();
    // Metode dengan implementasi
        void info() {
        System.out.println("hewan ini bersuara.");
    }
}
    
class Kucing extends Hewan {
    @Override
    void bersuara(){
        System.out.println("hewan ini bersuara meong");
    }
}

class Anjing extends Hewan {
    @Override
    void bersuara(){
        System.out.println("Hewan ini bersuara guk guk");
    }
}