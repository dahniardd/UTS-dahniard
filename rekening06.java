import java.util.Scanner;
public class rekening06 {

    String noRekening;
    String nama;
    String namaIbu;
    String Phone;
    String Email;

    public rekening06(String noRekening, String nama, String namaIbu, String Phone, String Email) {
        this.noRekening = noRekening;
        this.nama = nama;
        this.namaIbu = namaIbu;
        this.Phone = Phone;
        this.Email = Email;
    }
    public String NoRekening() {
        return noRekening;
    }
    public void NoRekening(String noRekening) {
        this.noRekening = noRekening;
    }
    public String Nama() {
        return nama;
    }
    public void Nama(String nama) {
        this.nama = nama;
    }
    public String NamaIbu() {
        return namaIbu;
    }
    public void NamaIbu(String namaIbbu) {
        this.namaIbu = namaIbu;
    }
    public String Phone() {
        return Phone;
    }
    public void Phone(String Phone) {
        this.Phone = Phone;
    }
    public String Email() {
        return Email;
    }
    public void Email(String Email) {
        this.Email = Email;
    }

    public String toString() {
        return "Rekening{" +
                "noRekening='" + noRekening + '\'' +
                ", nama='" + nama + '\'' +
                ", namaIbu='" + namaIbu + '\'' +
                ", Phone=" + Phone + '\'' +
                ", Email=" + Email + 
                '}';
    }
}
    

