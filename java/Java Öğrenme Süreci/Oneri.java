public class Oneri {
    private final String etkinlik;
    private final String planB;
    private String ozelMesaj;

    public Oneri(String etkinlik, String planB, String ozelMesaj) {
        this.etkinlik = etkinlik;
        this.planB = planB;
        this.ozelMesaj = ozelMesaj;
    }

    public String getEtkinlik() { return etkinlik; }

    public void ozelMesajEkle(String ekMesaj) {
        this.ozelMesaj += " " + ekMesaj;
    }

    public void raporuYazdir() {
        System.out.println("\n===============================");
        System.out.println("ETKİNLİK ÖNERİ RAPORU");
        System.out.println("===============================");
        System.out.println("Önerilen Aktivite: " + etkinlik);
        System.out.println("Sistem Notu: " + ozelMesaj);
        System.out.println("-------------------------------");
    }

    public void bPlaniniYazdir() {
        System.out.println("\n --- B PLANI DEVREDE ---");
        System.out.println("Alternatif Aktivite: " + planB);
        System.out.println("Sistem Notu: Bazen değişiklik iyidir, iyi eğlenceler!");
    }
}
