/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

public class Persegi extends Segitiga {
    public void HitungLuas(){
        double luas;
        luas = this.sisib * this.sisic;
        System.out.println ("Panjang Sisi :" + this.sisic + " CM ");
        System.out.println ("Luas Persegi Aadalah :" +luas+ " CM ");
    }
    @Override
    public void HitungKeliling(){
        double keliling;
        keliling = this.sisic * 2;
        System.out.println ("Panjang Sisi :" + this.sisic + " CM ");
        System.out.println ("Luas Persegi Adalah :" +keliling+ " CM ");
        
    }
}
