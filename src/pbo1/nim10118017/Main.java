package pbo1.nim10118017;

import java.util.Scanner;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Ini adalah class main adalah class yang pertama dijalankan.
 * 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        //Proses validasi inputan.
        boolean valid = false;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Masukkan nilai diameter lingkaran : ");
            if (scanner.hasNextDouble()) {
                valid = true;
                lingkaran.diameter = scanner.nextDouble();
            } else {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
            }
        } while (!valid);
        
        lingkaran.hitungJariJari();
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        
        //Menampilkan hasil.
        System.out.println("\n======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran = %.2f cm%n", lingkaran.jariJari);
        System.out.printf("Luas Lingkaran = %.2f cm%n", lingkaran.luas);
        System.out.printf("Keliling Lingkaran = %,.2f cm%n", lingkaran.keliling);
        System.out.println("\nDeveloped by : Agung Nurhamidan");
    }
    
}
