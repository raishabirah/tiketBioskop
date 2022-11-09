/**
 * kelas penonton adalah kelas yang berfungsi untuk menyimpan variabel dan method dari penonton
 * @author laila asrin and raihan sabirah
 * @version 09/11/2022
 */
import java.util.Scanner;

public class Penonton
{
    private String nama;
    private String kursi;

    public Penonton(){

    }
    /**
     * method yang digunakan untuk mengubah nama penonton
     * @param nama 
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
    /**
     * method yang digunakan untuk mengembalikan nama penonton
     * @return nama penonton
     */
    public String getNama() {
        return nama;
    }
    /**
     * method yang digunakan untuk mengisi nama penonton
     */
    public void namaPenonton() {
        Scanner s = new Scanner(System.in);

        System.out.print("Silahkan masukan nama anda : ");
        nama = s.next();
        setNama(nama);
    }
    /**
     * method untuk mengganti kursi penonton
     * @param kursi
     */
    public void setKursi(String kursi) {
        this.kursi = kursi;
    }
    /**
     * method untuk mengembalikan kursi penonton
     * @return kursi penonton
     */
    public String getKursi() {
        return kursi;
    }
    /**
     * method untuk memilih kursi
     */
    public void kursiPenonton() {
        Scanner s = new Scanner(System.in);

        System.out.println("\nPosisi tempat duduk dalam bioskop");
        System.out.println("\tA1\t\tA2\t\tA3\t\tA4\t\tA5\n\tB1\t\tB2\t\tB3\t\tB4\t\tB5\n\tC1\t\tC2\t\tC3\t\tC4\t\tC5");
        System.out.println("\tD1\t\tD2\t\tD3\t\tD4\t\tD5\n\tE1\t\tE2\t\tE3\t\tE4\t\tE5");
        System.out.print("Silahkan pilih kursi yang tersedia : ");
        kursi = s.next().toUpperCase();
        setKursi(kursi);
    }
}
