package Tugas05;

public class MainProgram {
    public static void main(String[] args) {
     
        Kue[] kue = {
            new KuePesanan("Kue Nastar", 12000, 2),
            new KueJadi("Cromboloni", 25000, 5),
            new KuePesanan("Croissant", 10000, 3),
            new KueJadi("Kue Tar", 8000, 4),
            new KuePesanan("Kue Brownies", 15000, 1),
            new KueJadi("Donat", 7000, 6),
            new KuePesanan("Kue Matcha", 13000, 2),
            new KueJadi("Kue Pizza", 9000, 7),
            new KuePesanan("Bolu Pisang", 11000, 2),
            new KueJadi("Kue Sandwich", 8500, 5),
            new KuePesanan("Martabak", 9500, 4),
            new KueJadi("Burger", 8500, 3),
            new KuePesanan("Kue Pastel", 13000, 2),
            new KueJadi("Kue Bakpia", 10000, 4),
            new KuePesanan("Mochi", 14000, 1),
            new KueJadi("Kue Crepes", 7000, 8),
            new KuePesanan("Rainbow Cake", 16000, 2),
            new KueJadi("Pudding", 8500, 6),
            new KuePesanan("Kue Pie", 12000, 3),
            new KueJadi("Cupcake", 8000, 5)
        };
    
        System.out.println("=============LIST KUE=============");
        for (int i = 0; i < kue.length; i++) {
            System.out.println(kue[i] + "\n");
        }

        double totalHargaKuePesanan = 0;
        double totalHargaJadi = 0;
        double totalBeratPesanan = 0;
        double totalJumlahJadi = 0;


        for (int i = 0; i < kue.length; i++) {
            totalHargaKuePesanan += kue[i].hitungHarga();
            if(kue[i] instanceof KuePesanan) {
                totalHargaKuePesanan += kue[i].hitungHarga();
                totalBeratPesanan += ((KuePesanan)kue[i]).getBerat();
            } else if(kue[i] instanceof KueJadi) {
                totalHargaJadi += kue[i].hitungHarga();
                totalJumlahJadi += ((KueJadi)kue[i]).getJumlah();
            }
        }

        System.out.println("=============TOTAL HARGA=============");
        System.out.println("Total Harga Semua Kue\t: Rp " + (totalHargaKuePesanan + totalHargaJadi));
        System.out.println("\nTotal Harga Kue Pesanan\t: Rp " + totalHargaKuePesanan);
        System.out.println("Total Berat Kue Pesanan\t: " + totalBeratPesanan + " kg");
        System.out.println("\nTotal Harga Kue Jadi\t: Rp " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi\t: " + totalJumlahJadi + " buah");

        double hargaTertinggi = 0;
        String namaKueTertinggi = "";
        String jenisKueTertinggi = "";

        for (int i = 0; i < kue.length; i++) {
            if(kue[i].hitungHarga() > hargaTertinggi) {
                hargaTertinggi = kue[i].hitungHarga();
                namaKueTertinggi = kue[i].getNama();
                jenisKueTertinggi = (kue[i] instanceof KuePesanan) ? "Kue Pesanan" : "Kue Jadi";
            }
        }
        System.out.printf("Kue dengan Harga Tertinggi  : %s\nHarga Kue Tertinggi         : Rp%,.2f\n", namaKueTertinggi, hargaTertinggi);
        System.out.println("Jenis Kue                   : " + jenisKueTertinggi);
    }
}

