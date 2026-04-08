# Alver Labs - Java Öğrenme Süreci Projesi 1

Merhaba! Ben Musa. Bilgisayar Mühendisliği 1. sınıf öğrencisiyim. 

Bu proje, okuldaki Java derslerinde gördüğüm temel konuları teorikte bırakmayıp pratiğe dökmek ve kendi algoritma mantığımı geliştirmek için hazırladığım küçük bir "Kişisel Etkinlik Asistanı" uygulamasıdır. 

Amacım devasa bir uygulama yazmaktan ziyade; karar yapılarını, döngüleri ve hata ayıklama süreçlerini gerçek bir senaryo üzerinde test etmekti.

### 🎯 Projenin Amacı ve Mantığı
Uygulama temel olarak kullanıcıdan; bulunduğu şehir, yaş, cinsiyet, hava sıcaklığı ve kişi sayısı gibi bilgileri alıyor. Sonrasında bu verilere bakarak kişiye özel bir etkinlik veya mekan önerisinde bulunuyor. 

Algoritma karmaşasını kontrol altında tutmak ve `switch-case` mantığını tam oturtabilmek adına projeyi şimdilik sadece **2 pilot şehir (İstanbul ve Samsun)** üzerinden kurguladım. İlerleyen zamanlarda öğrendikçe yeni şehirler ve özellikler eklemeyi planlıyorum.

### 🛠️ Bu Projede Neleri Pekiştirdim?
Kodları yazarken derslerde gördüğümüz şu temel Java araçlarını aktif olarak kullandım:

* **`Scanner` Sınıfı:** Kullanıcıdan klavye üzerinden farklı tipte veriler (`String`, `int`, `double`) almak için kullandım. Hatta veri alırken oluşan "Scanner Bug" (satır atlama) sorununu çözmeyi tecrübe ettim.
* **`switch-case` ve `if-else` Yapıları:** Hangi şehrin seçildiğini `switch` ile ana dallara ayırıp, her şehrin kendi içinde sıcaklık ve kişi sayısına göre karar vermesini `if-else` bloklarıyla sağladım. (İç içe karar yapıları).
* **`while(true)` Döngüsü:** Programın kullanıcı "Çıkış" diyene kadar kapanmaması ve sürekli baştan başlaması için sonsuz döngü mantığını kurdum.
* **`try-catch` (Hata Yakalama):** En çok uğraştığım ve keyif aldığım kısımlardan biri oldu. Kullanıcı yaş veya sıcaklık kısmına sayı yerine harf girdiğinde programın çökmesini (`InputMismatchException`) engelleyip sistemi başa saran bir güvenlik duvarı ekledim.
* **String Metotları:** `equalsIgnoreCase` ve basit Regex (`.*\\d.*`) komutlarıyla metin girişlerinin kurallara uygun olup olmadığını kontrol ettim.

Okulda öğrendiklerimin üzerine koyarak ilerlemeye ve "Alver Labs" çatısı altında kendi vizyonumu kodlara dökmeye devam edeceğim. İncelediğiniz için teşekkürler!
