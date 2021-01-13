/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

public class Lingkaran extends Segitiga {
    @Override
    public void HitungLuas(){
        double luas;
        luas = 3.14 * jarijari * jarijari;
        System.out.println("Jari Jari Lingkaran :" + jarijari);
        System.out.println("Luas Lingkaran Adalah :" + luas);
    }
    
    @Override
    public void HitungKeliling(){
        double keliling;
        keliling = 2 * 3.14 * jarijari;
        System.out.println("Jari Jari Lingkaran :" + jarijari);
        System.out.println("Luas Lingkaran Adalah :" + keliling);
    }
    
}
