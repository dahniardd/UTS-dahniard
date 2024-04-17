import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main06 {
    private static Transaksi06[] Transactions;

    /**
     * @param args
     */
    public static void main (String[]args) {
        List<rekening06> rekenings = new ArrayList<>();
        rekenings.add(new rekening06("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263", "ligula. Nullam@tacitisociosqu.edu"));
        rekenings.add(new rekening06("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org"));
        rekenings.add(new rekening06("16240401 2243", "Fuller", "Finn Dunlap", "571-7062", "convallis@Vestibulumanteipsum.org"));
        rekenings.add(new rekening06("16270525 0112", "Malcolm", "Keane Floyd", "623-0234", "porttitor.tellus.non@Curabitur.ca"));
        rekenings.add(new rekening06("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323", "ut.pellentesque@luctusutpellentesque.com"));
        rekenings.add(new rekening06("16100727 8862", "Rudyard", "Charles Morales", "650-5379", "Proin.eget@velitegestaslacinia.ca"));
        rekenings.add(new rekening06("16460329 4259", "Troy", "Damon Guerra", "897-7608", "pede.Suspendisse.dui@a.ca"));
        rekenings.add(new rekening06("16320421 3437", "Alec", "Cooper Lee", "792-4447", "non@mus.com"));
        rekenings.add(new rekening06("16180729 7229", "Walter", "Seth Drake", "863-8209", "Pellentesque.ut.ipsum@neque.ca"));
        rekenings.add(new rekening06("16950313 6823", "Simon", "Burton Gates", "592-6919", "tellus.justo.sit@commodoauctor.net"));
        
        Scanner scanner = new Scanner(System.in);
        int pilih;
        do {
            System.out.println(".:UTS:.");
            System.out.println("1. Tampil data rekening");
            System.out.println("2. Tampil data transaksi");
            System.out.println("3. Mencari saldo > 500000");
            System.out.println("4. Sorting by name");
            System.out.println("5. Keluar");
            System.out.print("Pilih(1-5): ");
            pilih = scanner.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("No Rekening\nNama\nNama Ibu\nPhone\nEmail");
                    for (rekening06 rekening : rekenings) {
                        System.out.println(rekening);
                    }
                    break;
                case 2:
                    // Tambahkan kode untuk tampil data transaksi di sini
                    List<Transaksi06> transactions = new ArrayList<>();
                    transactions.add(new Transaksi06(898214,494048,3587,"2021-03-09", "07:54:42"));
                    break;
                case 3:
                    // Tambahkan kode untuk mencari saldo > 500000 di sini
                    System.out.println("Transaksi dengan saldo lebih dari Rp 500,000:");
                    for (Transaksi06 transaction : Transactions) {
                    if (transaction.saldo() > 500000) {
                        System.out.println(Transactions);
                    }
                        }
                    break;
                case 4:
                    // Tambahkan kode untuk sorting by name di sini
                    Collections.sort(rekenings,  new NameComparator());
                    System.out.println("Data rekening telah diurutkan berdasarkan nama: ");
                    for (rekening06 rekening : rekenings) {
                        System.out.println(rekening);
                    }
                    break;
                case 5:
                    System.out.println("Terima kasih, Anda telah melakukan Transaksi!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilih != 5);
        scanner.close();
    }
}
    class NameComparator implements Comparator<rekening06> {
    public int compare(rekening06 r1, rekening06 r2) {
        return r1.nama.compareTo(r2.nama);
    }
}

    
   