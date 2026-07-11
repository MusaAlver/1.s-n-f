public class IstanbulStratejisi implements OneriStratejisi {
    @Override
    public Oneri uret(Kullanici kullanici, double sicaklik) {
        String etkinlik, planB, mesaj;

        if (sicaklik < 15) {
            mesaj = "Hava " + sicaklik + " derece, buz gibi! Sıkı giyin.";
            if (kullanici.getKisiSayisi() >= 5) {
                etkinlik = "Kapalı alanda Lazer Tag veya Kaçış Odası kapışması";
                planB = "Sıcak bir kafede kalabalık grupla Tabu / Kutu oyunları.";
            } else {
                etkinlik = "Karaköy'de sıcak bir kahve ve kitap keyfi.";
                planB = "Kapalı müze turu (Yerebatan Sarnıcı harika olur).";
            }
        } else {
            mesaj = "Hava mis gibi tam " + sicaklik + " derece, tadını çıkar!";
            if (kullanici.getKisiSayisi() >= 10) {
                etkinlik = "O zaman kesinlikle açık havada Halı Saha Maçı yapmalısınız!";
                planB = "Ormanda dev bir Paintball savaşı veya dev mangal etkinliği efsane olur.";
            } else {
                etkinlik = "Caddebostan sahilinde çimlerde oturup sohbet.";
                planB = "Kadıköy Moda'da dondurma eşliğinde nostaljik tramvay turu.";
            }
        }
        return new Oneri(etkinlik, planB, mesaj);
    }
}
