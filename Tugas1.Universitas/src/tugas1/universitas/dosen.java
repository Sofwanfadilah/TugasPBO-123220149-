/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1.universitas;

/**
 *
 * @author Sofwan Fadilah
 */
public class dosen {

   
    public static void main(String[] args) {
        //OBJEK DARI CLASS UNIVERSITAS
        mahasiswa mahasiswa=new mahasiswa();
        
        //mengisi atribut dari class
        mahasiswa.nama="sofwan fadilah";
        mahasiswa.matkul="Kalkulus";
        mahasiswa.tahun=2022;
        
        //mengisi isi atribut
        System.out.println("nama =" + mahasiswa.nama);
        System.out.println("matkul =" + mahasiswa.matkul);
        System.out.println("tahum =" + mahasiswa.tahun);
        
     
    }
    
}
