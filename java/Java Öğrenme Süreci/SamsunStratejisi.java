public class SamsunStratejisi implements OneriStratejisi {
    @Override
    public Oneri uret(Kullanici kullanici, double sicaklik) {
        String etkinlik, planB, mesaj;

        if (sicaklik < 15) {
            mesaj = "Karadeniz soğuğu fenadır, kapalı mekanlara geçelim.";
            if (kullanici.getKisiSayisi() >= 4) {
                etkinlik = "Piazza veya Yeşilyurt AVM'de Bowling turnuvası.";
                planB = "Kapalı bir mekanda bilardo maçı.";
            } else {
                etkinlik = "Piazza AVM'de Sinemaya gitmeye ne dersin?";
                planB = "Çiftlik Caddesi'nde kapalı bir mekanda tatlı keyfi.";
            }
        } else {
            mesaj = "Samsun'da böyle güzel hava her zaman bulunmaz!";
            if (kullanici.getKisiSayisi() >= 5) {
                etkinlik = "Atakum sahilinde devasa bir mangal yapmalısınız.";
                planB = "Batıpark tarafında grupça Go-Kart kapışması.";
            } else {
                etkinlik = "Amazon Köyü tarafında bisiklet kiralayıp sahil turu atabilirsiniz.";
                planB = "Teleferikle Amisos Tepesi'ne çıkıp manzaraya karşı çay.";
            }
        }
        return new Oneri(etkinlik, planB, mesaj);
    }
}
