public class Fantasi extends Film
{
    public Fantasi(){

    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public void setHarga(int harga) {
        super.setHarga(harga);
    }

    @Override
    public int getHarga() {
        return super.getHarga();
    }

    @Override
    public String jadwal() {
        return "08.00 - 10.00";
    }
}

