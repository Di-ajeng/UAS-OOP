/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

public class Main {
    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar();
        bd.HitungLuas();
        bd.HitungKeliling();
        
        System.out.println("NIM SAYA 201969040001");
        System.out.println("=========================");
        System.out.println("===> LUAS DAN KELILING SEGITIGA <===");
        
        Segitiga st = new Segitiga();
        st.HitungLuas();
        System.out.println("==========");
        st.HitungKeliling();
        
        System.out.println("==========");
        System.out.println("==========");
        System.out.println("==========");
        
        System.out.println("LUAS DAN KELILING PERSEGI");
        Persegi kotak = new Persegi();
        kotak.HitungLuas();
        System.out.println("==========");
        kotak.HitungKeliling();
        
        System.out.println("==========");
        System.out.println("==========");
        System.out.println("==========");
        
        System.out.println("LUAS DAN KELILING LINGKARAN");
        Lingkaran bulat = new Lingkaran();
        bulat.HitungLuas();
        System.out.println("==========");
        bulat.HitungKeliling();
    }
    
}
