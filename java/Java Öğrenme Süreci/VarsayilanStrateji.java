public class VarsayilanStrateji implements OneriStratejisi {
    @Override
    public Oneri uret(Kullanici kullanici, double sicaklik) {
        String etkinlik, planB, mesaj;

        if (sicaklik < 15) {
            etkinlik = "Şehrin en ünlü kapalı müzesini ziyaret edebilirsiniz.";
            planB = "Güzel ve sıcak bir restoranda yöresel yemekleri denemek.";
            mesaj = "Hava biraz serin, kendini sıcak tut!";
        } else {
            etkinlik = "Merkezdeki en büyük parkta yürüyüş yapmalısınız.";
            planB = "Şehrin tarihi sokaklarında açık hava fotoğraf turu.";
            mesaj = "Hava çok güzel, dışarının tadını çıkar!";
        }
        return new Oneri(etkinlik, planB, mesaj);
    }
}
