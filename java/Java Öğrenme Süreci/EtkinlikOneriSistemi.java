import java.util.InputMismatchException;
import java.util.Scanner;

public class EtkinlikOneriSistemi {

    private static int sayiOku(Scanner girdi, String etiket) {
        while (true) {
            System.out.print(etiket);
            String satir = girdi.nextLine().trim();
            try {
                return Integer.parseInt(satir);
            } catch (NumberFormatException e) {
                System.out.println("HATA: Lütfen geçerli bir tam sayı girin.");
            }
        }
    }

    private static double ondalikOku(Scanner girdi, String etiket) {
        while (true) {
            System.out.print(etiket);
            String satir = girdi.nextLine().trim();
            try {
                return Double.parseDouble(satir.replace(",", "."));
            } catch (NumberFormatException e) {
                System.out.println("HATA: Lütfen geçerli bir sayı girin.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        OneriMotoru motor = new OneriMotoru();

        System.out.println("--- Gelişmiş Etkinlik Öneri Sistemi ---");

        while (true) {
            try {
                System.out.println("\n--------------------------------");
                System.out.print("Lütfen Bulunduğunuz Şehiri giriniz (Çıkmak için Q yazın): ");
                String sehir = girdi.nextLine().trim();

                if (sehir.equalsIgnoreCase("q")) {
                    System.out.println("Sistem kapatılıyor. Görüşmek üzere!");
                    break;
                }
                if (sehir.isEmpty() || sehir.matches(".*\\d.*")) {
                    System.out.println("HATA: Şehir isminde sayı olamaz veya boş bırakılamaz, baştan alıyoruz!");
                    continue;
                }

                System.out.print("Cinsiyetiniz Nedir (Erkek/Kadın): ");
                String cinsiyet = girdi.nextLine().trim();
                if (cinsiyet.isEmpty() || cinsiyet.matches(".*\\d.*")) {
                    System.out.println("HATA: Cinsiyet kısmına sayı giremezsin veya boş bırakamazsın!");
                    continue;
                }

                int yas = sayiOku(girdi, "Yaşınız Nedir: ");
                if (yas <= 0 || yas > 120) {
                    System.out.println("HATA: Geçerli bir yaş girin.");
                    continue;
                }

                double sicaklik = ondalikOku(girdi, "Hava Sıcaklığı Kaç derece: ");

                int kisiSayisi = sayiOku(girdi, "Kaç kişisiniz?: ");
                if (kisiSayisi <= 0) {
                    System.out.println("HATA: Kişi sayısı en az 1 olmalı.");
                    continue;
                }

                Kullanici aktifKullanici = new Kullanici(sehir, cinsiyet, yas, kisiSayisi);
                Oneri uretilenOneri = motor.tavsiyeUret(aktifKullanici, sicaklik);

                uretilenOneri.raporuYazdir();

                System.out.print("Bu öneriyi beğenmedin mi? Farklı bir seçenek göreyim mi? (Evet/Hayır): ");
                String alternatifCevap = girdi.nextLine().trim();

                if (alternatifCevap.equalsIgnoreCase("evet")) {
                    uretilenOneri.bPlaniniYazdir();
                } else {
                    System.out.println("\n Harika! O zaman ilk plana sadık kalıyoruz. İyi eğlenceler!");
                }

            } catch (InputMismatchException e) {
                System.out.println("\n KRİTİK HATA: Geçersiz girdi tespit edildi.");
                girdi.nextLine();
            }
        }
        girdi.close();
    }
}
