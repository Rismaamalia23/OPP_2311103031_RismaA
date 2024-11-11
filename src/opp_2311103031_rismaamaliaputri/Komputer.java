/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package opp_2311103031_rismaamaliaputri;

/**
 *
 * @author Risma Amalia Putri
 * 2311103031
 * S1-SI-07-A
 */
public class Komputer {
   protected int jumlahKomputer;
   protected String namaWarnet;
   protected float hargaPerJam;

    public Komputer(int jumlahKomputer, String namaWarnet, float hargaPerJam) {
        this.jumlahKomputer = jumlahKomputer;
        this.namaWarnet = namaWarnet;
        this.hargaPerJam = hargaPerJam;
    }

    public void informasi() {
        System.out.println("INFORMASI KOMPUTER:");
        System.out.println("Jumlah Komputer : " + jumlahKomputer);
        System.out.println("Nama Warnet     : " + namaWarnet);
        System.out.println("Harga Per Jam   : Rp" + hargaPerJam);
    }
    
}
