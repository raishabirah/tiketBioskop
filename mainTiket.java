/**
 * kelas penonton adalah kelas yang berfungsi untuk menyimpan variabel dan method tiket serta menjalankan program
 * @author laila asrin and raihan sabirah
 * @version 09/11/2022
 */
import java.util.Scanner;

public class mainTiket
{
    private static int jawaban;
    private static int bayar;
    private static int nomor;
    private static Scanner s = new Scanner(System.in);
    /**
     * method constructor dari kelas mainTiket
     */
    public mainTiket(){

    }
    /**
     * method yang digunakan untuk melakukan transaksi tiket
     */
    public static void bayarTiket(){
        System.out.println("\nMelakukan Pembayaran");
        System.out.print("Masukan uang tunai : ");
        jawaban = s.nextInt();
        if (jawaban >= bayar) {
            bayar = jawaban - bayar;
            System.out.println("Kembalian : Rp." + bayar);
            System.out.println("Transaksi tiket berhasil dilakukan");
        } else {
            System.out.println("Uang anda tidak cukup untuk pembelian tiket");
            System.out.println("Transaksi gagal dilakukan");
        }
    }

    /**
     * method yang digunakan untuk menjalankan program pemesanan tiket
     */
    public static void main(String[] args) {

        do {
            Fantasi f1 = new Fantasi();
            Komedi f2 = new Komedi();
            Horor f3 = new Horor();
            Penonton p = new Penonton();
            System.out.println("Selamat datang di bioskop 99");
            p.namaPenonton();
            System.out.println("\nJenis Film yang tersedia");
            System.out.println("1. Fantasy");
            System.out.println("2. Komedi");
            System.out.println("3. Horror");
            System.out.print("Silahkan pilih film yang anda inginkan : ");
            jawaban = s.nextInt();
            if (jawaban==1) {
                System.out.println("\nJudul film");
                System.out.println("1.Harry Potter");
                System.out.println("2.Rise Of Guardians");
                System.out.println("3.Coraline");
                System.out.print("Silahkan pilih judul film : ");
                nomor = s.nextInt();
                if(nomor == 1){
                    f1.setNama("Harry Potter");
                    f1.setHarga(150000);
                    bayar = f1.getHarga();
                }
                else if(nomor == 2){
                    f1.setNama("Rise Of Guardians");
                    f1.setHarga(160000);
                    bayar = f1.getHarga();
                }
                else if(nomor == 3){
                    f1.setNama("Coraline");
                    f1.setHarga(120000);
                    bayar = f1.getHarga();
                }
                else{
                    System.out.println("Kesalahan input");
                    break;
                }
            }else if( jawaban == 2){
                System.out.println("\nJudul film");
                System.out.println("1.Spongebob Squarepants");
                System.out.println("2.My Stupid Boss");
                System.out.println("3.Cek Toko Sebelah");
                System.out.print("Silahkan pilih judul film : ");
                nomor = s.nextInt();
                if(nomor == 1){
                    f2.setNama("Spongebob Squarepants");
                    f2.setHarga(100000);
                    bayar = f2.getHarga();
                }
                else if(nomor == 2){
                    f2.setNama("My Stupid Boss");
                    f2.setHarga(130000);
                    bayar = f2.getHarga();
                }
                else if(nomor== 3){
                    f2.setNama("Cek Toko Sebelah");
                    f2.setHarga(150000);
                    bayar = f2.getHarga();
                }
                else{
                    System.out.println("Kesalahan input");
                    break;
                }
            }else if(jawaban == 3){
                System.out.println("\nJudul film");
                System.out.println("1.Chainsaw Man");
                System.out.println("2.Pengabdi Setan");
                System.out.println("3.Ratu Ilmu Hitam");
                System.out.print("Silahkan pilih judul film : ");
                nomor = s.nextInt();
                if(nomor==1){
                    f3.setNama("Chainsaw Man");
                    f3.setHarga(170000);
                    bayar = f3.getHarga();
                }
                else if(nomor ==2){
                    f3.setNama("Pengabdi setan");
                    f3.setHarga(180000);
                    bayar = f3.getHarga();
                }
                else if(nomor == 3){
                    f3.setNama("Ratu Ilmu Hitam");
                    f3.setHarga(120000);
                    bayar = f3.getHarga();
                }
                else {
                    System.out.println("Kesalahan input");
                    break;
                }
            }
            if (jawaban == 1) {
                p.kursiPenonton();
                System.out.println("\n\t\tTIKET BIOSKOP");
                System.out.println("=============================================");
                System.out.println("Nama       : " + p.getNama());
                System.out.println("Kursi      : " + p.getKursi());
                System.out.println("Judul      : " + f1.getNama());
                System.out.println("Jam Tayang : " + f1.jadwal());
                System.out.println("Harga      : Rp." + f1.getHarga());
                System.out.println("=============================================");
            } else if(jawaban == 2) {
                p.kursiPenonton();
                System.out.println("\n\t\tTIKET BIOSKOP");
                System.out.println("=============================================");
                System.out.println("Nama       : " + p.getNama());
                System.out.println("Kursi      : " + p.getKursi());
                System.out.println("Judul      : " + f2.getNama());
                System.out.println("Jam Tayang : " + f2.jadwal());
                System.out.println("Harga      : Rp." + f2.getHarga());
                System.out.println("=============================================");
            } else if(jawaban == 3) {
                p.kursiPenonton();
                System.out.println("\n\t\tTIKET BIOSKOP");
                System.out.println("=============================================");
                System.out.println("Nama       : " + p.getNama());
                System.out.println("Kursi      : " + p.getKursi());
                System.out.println("Judul      : " + f3.getNama());
                System.out.println("Jam Tayang : " + f3.jadwal());
                System.out.println("Harga      : Rp." + f3.getHarga());
                System.out.println("=============================================");
            }
            else {
                System.out.println("\nFilm belum tersedia");
                break;
            }

            bayarTiket();

            System.out.println("\nApakah anda ingin memesan tiket lain?");
            System.out.println("Ya = 1 || Tidak = 0");
            jawaban = s.nextInt();
        } while (jawaban == 1);
        s.close();
    }
}
