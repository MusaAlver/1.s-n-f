public class AnkaraStratejisi implements OneriStratejisi {
    @Override
    public Oneri uret(Kullanici kullanici, double sicaklik) {
        String etkinlik, planB, mesaj;

        if (sicaklik < 15) {
            mesaj = "Ankara'nın soğuğu iliklere işler, önlemini al!";
            if (kullanici.getKisiSayisi() >= 5) {
                etkinlik = "AnkaMall veya Armada'da kapalı alanda Bowling.";
                planB = "Kızılay'da bir kafede kalabalık masa kurup sohbet.";
            } else {
                etkinlik = "Anıtkabir müzesini gezip tarihe yolculuk yapabilirsiniz.";
                planB = "Kapalı bir kütüphane veya kitapçıda vakit geçirmek.";
            }
        } else {
            mesaj = "Ankara'da güneşli hava fırsatını kaçırma!";
            if (kullanici.getKisiSayisi() >= 8) {
                etkinlik = "Gençlik Parkı'nda büyük bir grup pikniği yapmalısınız.";
                planB = "Eymir Gölü kenarında mangal ve doğa yürüyüşü.";
            } else {
                etkinlik = "Seğmenler Parkı'nda yürüyüş ve manzara keyfi.";
                planB = "Hamamönü'nde tarihi sokaklarda fotoğraf turu.";
            }
        }
        return new Oneri(etkinlik, planB, mesaj);
    }
}
