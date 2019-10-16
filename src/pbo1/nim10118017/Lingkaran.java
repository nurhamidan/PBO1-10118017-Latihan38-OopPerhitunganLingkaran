package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class untuk menampilkan hasil perhitungan lingkaran.
 * 
 */
public class Lingkaran {
    public double diameter;
    public double jariJari;
    public double keliling;
    public double luas;
    
    public void hitungJariJari() {
        jariJari = diameter / 2;
    }
    
    public void hitungKeliling() {
        keliling = 2 * Math.PI * jariJari;
    }
    
    public void hitungLuas() {
        luas = Math.PI * (jariJari * jariJari);
    }
}
