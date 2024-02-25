/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas.kendaraan;

/**
 *
 * @author Sofwan Fadilah
 */
public class Spek {
    
     public static void main(String[] args) {
         //objek dari class spek
         kendaraan kendaraan=new kendaraan();
         
         //mengisi atribut class
         kendaraan.nama ="mobil";
         kendaraan.type ="sedan";
         kendaraan.tahun = 2000;
         
         //mengisi isi atribut
         System.out.println("nama =" + kendaraan.nama);
         System.out.println("type =" + kendaraan.type);
         System.out.println("tahun =" + kendaraan.tahun);
     }
}
