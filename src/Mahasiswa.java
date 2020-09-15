/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niswa
 */
public class Mahasiswa {
  String nama;
  String jeniskelamin;
  String jurusan;
  String alamat;
   
  void setNilai(String nama, String jeniskelamin , String jurusan){
   this.nama = nama;
   this.jeniskelamin= jeniskelamin;
   this.jurusan= jurusan;
  }
   
  void setNilai(String nama,String jeniskelamin, String jurusan ,String alamat){
   this.nama = nama;
   this.jeniskelamin = jeniskelamin; 
   this.jurusan = jurusan;
   this.alamat = alamat;
  }
   
  void cetak(){
   System.out.println("Nama : "+nama);
   System.out.println("Jenis kelamin : "+jeniskelamin);
   System.out.println("Jurusan : "+jurusan);
   System.out.println("Alamat : "+alamat + "\n");
  }

}
