public class Kullanici {
    private final String sehir;
    private final String cinsiyet;
    private final int yas;
    private final int kisiSayisi;

    public Kullanici(String sehir, String cinsiyet, int yas, int kisiSayisi) {
        this.sehir = sehir;
        this.cinsiyet = cinsiyet;
        this.yas = yas;
        this.kisiSayisi = kisiSayisi;
    }

    public String getSehir() { return sehir; }
    public String getCinsiyet() { return cinsiyet; }
    public int getYas() { return yas; }
    public int getKisiSayisi() { return kisiSayisi; }
}
