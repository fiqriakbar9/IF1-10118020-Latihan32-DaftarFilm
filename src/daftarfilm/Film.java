/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarfilm;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan daftar film
 * yang sudah di inputkan terlebih dahulu dan berbasis objek oriented
 */
public class Film {
    
    public String Name;
    public String Genre;
    public Double Rating;
    public int Duration;
    
    public void nowPlaying(String parName, String parGenre, Double parRating, int parDuration){
        System.out.println("Judul Film : "+parName);
        System.out.println("Genre Film : "+parGenre);
        System.out.println("Rating Film : "+parRating);
        System.out.println("Duration Film : "+parDuration+" Menit");
        System.out.println("\nDevelop by : Fiqri Akbar Pratama");
        
    }
}
