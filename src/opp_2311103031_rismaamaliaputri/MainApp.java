/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package opp_2311103031_rismaamaliaputri;

/**
 *
 * @author Risma Amalia Putri
 * 2311103031
 * S1-SI-07-A
 */
public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek Komputer
        Komputer komputer = new Komputer(20, "Warnet Gaming X", 5000);
        komputer.informasi();
        System.out.println("\n===========================");

        // Membuat objek KomputerVIP dengan status VIP
        KomputerVIP komputerVIP = new KomputerVIP(15, "Warnet Gaming X", 7000, true);
        komputerVIP.informasi();
        komputerVIP.login("Risma");
        komputerVIP.bermain(2);
        komputerVIP.bermain(2, 3);
        System.out.println("\n===========================");

        // Membuat objek KomputerVIP dengan status Non VIP
        KomputerVIP komputerNonVIP = new KomputerVIP(15, "Warnet Gaming X", 7000, false);
        komputerNonVIP.informasi();
        komputerNonVIP.login("Risma");
        komputerNonVIP.bermain(2);
        komputerNonVIP.bermain(2, 3);
        System.out.println("\n===========================");

        // Membuat objek KomputerPremium dengan ruang privat
        KomputerPremium komputerPremium = new KomputerPremium(5, "Warnet Gaming X", 10000, true);
        komputerPremium.informasi();
        komputerPremium.pesan(5);
        komputerPremium.tambahLayanan("Ayam Panggang");
        komputerPremium.tambahLayanan("Ayam Panggang", "Es Lemon Tea");
        System.out.println("\n===========================");

        // Membuat objek KomputerPremium dengan ruang standar
        KomputerPremium komputerStandar = new KomputerPremium(5, "Warnet Gaming X", 10000, false);
        komputerStandar.informasi();
        komputerStandar.pesan(5);
        komputerStandar.tambahLayanan("Ayam Panggang");
        komputerStandar.tambahLayanan("Ayam Panggang", "Es Lemon Tea");
    
    }   
}
