import java.util.HashMap;
import java.util.Map;

public class OneriMotoru {
    private final Map<String, OneriStratejisi> stratejiler = new HashMap<>();
    private final OneriStratejisi varsayilan = new VarsayilanStrateji();

    public OneriMotoru() {
        stratejiler.put("istanbul", new IstanbulStratejisi());
        stratejiler.put("samsun", new SamsunStratejisi());
        stratejiler.put("ankara", new AnkaraStratejisi());
    }

    public Oneri tavsiyeUret(Kullanici kullanici, double sicaklik) {
        OneriStratejisi strateji = stratejiler.getOrDefault(
                kullanici.getSehir().toLowerCase().trim(), varsayilan);

        Oneri oneri = strateji.uret(kullanici, sicaklik);

        String cinsiyet = kullanici.getCinsiyet().toLowerCase().trim();
        String etkinlik = oneri.getEtkinlik();

        if (cinsiyet.startsWith("erkek") && etkinlik.contains("Maçı")) {
            oneri.ozelMesajEkle("(Defansta açık verme kanka, sakatlanmadan oyna!)");
        } else if (cinsiyet.startsWith("kadın") && etkinlik.contains("Kahve")) {
            oneri.ozelMesajEkle("(Keyfiniz bol olsun hanımefendi.)");
        }

        return oneri;
    }
}
