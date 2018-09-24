/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117086.latihan6.kambingstatic;

/**
 *
 * @author Lenovo
 *  Nama     : RD Muhammad Djulfikar BU
 *  NIM      : 10117086
 *  Kelas    : IF3
 *  Minggu 23 september 2018
 */
public class PBO310117086Latihan6KambingStatic {
    //nama kambing sebagai konstanta
    public static final String NAMA_KAMBING = "MADUN";
    
    

   
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "memiliki sebanyak " +
                Mamalia.jumlahKambing);
        
      
        
    }
    
}
