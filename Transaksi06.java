import java.util.Scanner;
public class Transaksi06 {

    double saldo, saldoAwal, saldoAkhir;
    String tanggalTransaksi, type;

    public Transaksi06(double saldo, double saldoAwal, double saldoAkhir, String tanggalTransaksi, String type) {
        this.saldo = saldo;
        this.saldoAwal = saldoAwal;
        this.saldoAkhir = saldoAkhir;
        this.tanggalTransaksi = tanggalTransaksi;
        this.type = type;
    }
    public double saldo() {
        return saldo;
    }
    public void saldo(double saldo) {
        this.saldo = saldo;
    }
    public double saldoAwal() {
        return saldoAwal;
    }
    public void saldoAwal(double saldoAwal) {
        this.saldoAwal = saldoAwal;
    }
    public double saldoAkhir() {
        return saldoAkhir;
    }
    public void saldoAkhir(double saldoAkhir) {
        this.saldoAkhir = saldoAkhir;
    }
    public String tanggalTransaksi() {
        return tanggalTransaksi;
    }
    public void tanggalTransaksi(String tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }
    public String type() {
        return type;
    }
    public void type(String type) {
        this.type = type;
    }

    public String toString() {
        return "Transaksi{" +
                "saldo='" + saldo + '\'' +
                ", saldoAwal='" + saldoAwal + '\'' +
                ", saldoAkhir='" + saldoAkhir + '\'' +
                ", tanggalTransaksi=" + tanggalTransaksi + '\'' +
                ", type=" + type + 
                '}';
    }    
}
    