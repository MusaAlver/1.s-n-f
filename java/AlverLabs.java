import java.util.Scanner;
import java.util.InputMismatchException;

public class AlverLabs {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.println("--- 🤖 Alver Labs (Güvenli Sürüm) ---");
        while (true) {
            try {
                System.out.println("\n--------------------------------");
                System.out.print("Lütfen Bulunduğunuz Şehiri giriniz (Çıkmak için Q yazın): ");
                String sehir = girdi.nextLine();
                if (sehir.equalsIgnoreCase("q")) {
                    System.out.println("Sistem kapatılıyor. Görüşmek üzere kanka!");
                    break;
                }
                if (sehir.matches(".*\\d.*")) {
                    System.out.println("⚠️ HATA: Şehir isminde sayı olamaz kanka, baştan alıyoruz!");
                    continue;
                }
                System.out.print("Cinsiyetiz Nedir (Erkek/Kadın): ");
                String cinsiyet = girdi.nextLine();
                if (cinsiyet.matches(".*\\d.*")) {
                    System.out.println("⚠️ HATA: Cinsiyet kısmına sayı giremezsin!");
                    continue;
                }
                System.out.print("Yaşınız Nedir: ");
                int yas = girdi.nextInt();
                System.out.print("Hava Sıcaklığı Kaç derece: ");
                double sicaklik = girdi.nextDouble();
                System.out.print("Kaç kişisiniz?: ");
                int kisiSayisi = girdi.nextInt();
                girdi.nextLine();
                String etkinlik = "";
                String planB = "";
                String OzelMesaj = "";

                switch (sehir.toLowerCase()) {
                    case "istanbul":
                        if (sicaklik < 15) {
                            OzelMesaj = "Hava " + sicaklik + " derece, buz gibi! Sıkı giyin kanka.";
                            if (kisiSayisi >= 5) {
                                etkinlik = "Kapalı alanda Lazer Tag veya Kaçış Odası kapışması";
                                planB = "Sıcak bir kafede kalabalık grupla Tabu / Kutu oyunları.";
                            } else {
                                etkinlik = "Karaköy'de sıcak bir kahve ve kitap keyfi.";
                                planB = "Kapalı müze turu (Yerebatan Sarnıcı harika olur).";
                            }
                        }
                        else {
                            OzelMesaj = "Hava mis gibi tam " + sicaklik + " derece, tadını çıkar!";
                            if (kisiSayisi >= 10) {
                                etkinlik = "O zaman kesinlikle açık havada Halı Saha Maçı yapmalısınız!";
                                planB = "Hazır kalabalıksınız, ormanda dev bir Paintball savaşı veya dev mangal etkinliği efsane olur.";
                            } else {
                                etkinlik = "Caddebostan sahilinde çimlerde oturup sohbet.";
                                planB = "Kadıköy Moda'da dondurma eşliğinde nostaljik tramvay turu.";
                            }
                        }
                        break;

                    case "samsun":
                        if (sicaklik < 15) {
                            OzelMesaj = "Karadeniz Yağmuru çok fenadır, kapalı mekanlara geçelim.";
                            if (kisiSayisi >= 4) {
                                etkinlik = "Piazza veya Yeşilyurt AVM'de Bowling turnuvası.";
                                planB = "Kapalı bir mekanda bilardo maçı.";
                            } else {
                                etkinlik = "Piazza AVM'de Sinemaya gitmeye ne dersin?";
                                planB = "Çiftlik Caddesi'nde kapalı bir mekanda tatlı keyfi.";
                            }
                        }
                        else {
                            OzelMesaj = "Samsun'da böyle güzel hava her zaman bulunmaz!";
                            if (kisiSayisi >= 5) {
                                etkinlik = "Atakum sahilinde devasa bir mangal yapmalısınız.";
                                planB = "Batıpark tarafında grupça Go-Kart kapışması.";
                            } else {
                                etkinlik = "Amazon Köyü tarafında bisiklet kiralayıp sahil turu atabilirsiniz.";
                                planB = "Teleferikle Amisos Tepesi'ne çıkıp manzaraya karşı çay.";
                            }
                        }
                        break;

                    default:
                        if (sicaklik < 15) {
                            etkinlik = "Şehrin en ünlü kapalı müzesini ziyaret edebilirsiniz.";
                            planB = "Güzel ve sıcak bir restoranda yöresel yemekleri denemek.";
                            OzelMesaj = "Hava biraz serin, kendini sıcak tut!";
                        } else {
                            etkinlik = "Merkezdeki en büyük parkta yürüyüş yapmalısınız.";
                            planB = "Şehrin tarihi sokaklarında açık hava fotoğraf turu.";
                            OzelMesaj = "Hava çok güzel, dışarının tadını çıkar!";
                        }
                        break;
                }

                if (cinsiyet.equalsIgnoreCase("erkek") && etkinlik.contains("Maçı")) {
                    OzelMesaj += " (Defansta açık verme kanka, sakatlanmadan oyna!)";
                } else if (cinsiyet.equalsIgnoreCase("kadın") && etkinlik.contains("Kahve")) {
                    OzelMesaj += " (Keyfiniz bol olsun hanımefendi.)";
                }

                System.out.println("\n===============================");
                System.out.println("🎯 ALVER ÖNERİ RAPORU");
                System.out.println("===============================");
                System.out.println("📌 Önerilen Aktivite: " + etkinlik);
                System.out.println("💬 Asistan Notu: " + OzelMesaj);
                System.out.println("-------------------------------");
                System.out.print("Bu öneriyi beğenmedin mi? Farklı bir seçenek göreyim mi? (Evet/Hayır): ");
                String alternatifCevap = girdi.nextLine();

                if (alternatifCevap.equalsIgnoreCase("evet")) {
                    System.out.println("\n🔄 --- B PLANI DEVREDE ---");
                    System.out.println("📌 Alternatif Aktivite: " + planB);
                    System.out.println("💬 Asistan Notu: Bazen değişiklik iyidir, iyi eğlenceler!");
                } else {
                    System.out.println("\n✅ Harika! O zaman ilk plana sadık kalıyoruz. İyi eğlenceler!");
                }

            }
            catch (InputMismatchException e) {
                System.out.println("\n🚨 KRİTİK HATA: Yaş, sıcaklık veya kişi sayısına HARF girdin!");
                System.out.println("🚨 Bu normalde programı çökertirdi ama Alver Labs koruması devrede.");
                System.out.println("🚨 Lütfen o kısımlara sadece SAYI gir. Sistemi baştan başlatıyorum...\n");
                girdi.nextLine();
            }
        }
        girdi.close();
    }
}
