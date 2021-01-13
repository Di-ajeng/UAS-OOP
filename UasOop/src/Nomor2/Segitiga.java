/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nomor2;

public class Segitiga extends BangunDatar {
    private double sisia=4;
    protected double sisib=2;
    protected double sisic=4;
    protected double jarijari=24;
    
    @Override
    public void HitungLuas(){
        double luas;
        luas=this.sisib * this.sisic/2;
        System.out.println("Alas : " +this.sisib + " CM ");
        System.out.println("Tinggi : " +this.sisic + " CM ");
        System.out.println("Luas Segitiga Adalah : " +luas+ " CM ");
    }
    
    public void HitungKeliling(){
        double keliling;
        keliling=this.sisia+this.sisib+this.sisic;
        System.out.println("SISI A : " + this.sisib + " CM ");
        System.out.println("SISI B : " + this.sisic + " CM ");
        System.out.println("SISI C : " + this.sisia + " CM ");
        System.out.println("Keliling Segitiga Adalah : " +keliling+ " CM ");
    }
}
