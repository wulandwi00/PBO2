/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author niswa
 */
public class Mahasiswamain {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Mahasiswa x1;
    Mahasiswa x2;
        x1 = new Mahasiswa();
        x2 = new Mahasiswa();

        x1.setNilai("Rendi Putra Prasojo","laki-Laki","Hukum","Malang");  
        x2.setNilai("Wulan Dwi Jayanti","Perempuan","Rekayasa Perangkat Lunak","Pasuruan");  
        x1.cetak();
        x2.cetak();    
    }
    
}
