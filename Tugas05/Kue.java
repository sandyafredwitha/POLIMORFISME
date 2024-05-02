package Tugas05;

public abstract class Kue {
    private String nama;
    private double harga;
    
    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public double getHarga() {
        return harga;
    }
        
    public abstract double hitungHarga();
        public String toString() {
            String result = String.format ("Nama Kue     : %s\n", nama);
            if(this instanceof KuePesanan){
                result += String.format("Jenis Kue    : Kue Pesanan\nHarga        : Rp%,.2f\nTotal Harga  : Rp%,.2f", harga, hitungHarga());
            }
            else{
                result += String.format("Jenis Kue    : Kue Jadi\nHarga        : Rp%,.2f\nTotal Harga  : Rp%,.2f", harga, hitungHarga());
            }
            return result;
        }
}
