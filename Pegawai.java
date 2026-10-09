/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author LENOVO
 */
public class Pegawai {
    private String namaPegawai;
    private double gaji;
    
    public Pegawai(String namaPegawai,double gaji){
        this.namaPegawai = namaPegawai;
        this.gaji = gaji;                
    }
public String getnamaPegawai(){
    return namaPegawai;
 }           
public void setnamaPegawai(){
    this.namaPegawai = namaPegawai;
}
public double getgaji(){
    return gaji;
}
public void setgaji(){
    this.gaji = gaji;
}
public void tampilkanInfo(){
    System.out.println("Nama Pegawai : " + namaPegawai);
    System.out.println("Gaji         : " + gaji);
}
}

