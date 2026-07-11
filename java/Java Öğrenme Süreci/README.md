# Etkinlik Öneri Sistemi (Öğrenme ve Gelişim Projesi)

Merhaba! Ben Musa. Atlas Üniversitesi'nde Bilgisayar Mühendisliği öğrencisiyim.

Bu proje, aslında 1. sınıfın ilk döneminde Java ile yeni tanıştığım zamanlarda; temel konuları teorikte bırakmayıp pratiğe dökmek ve algoritma mantığımı tamamen deneme-yanılma yoluyla geliştirmek için hazırladığım bir "Kişisel Etkinlik Asistanı"ydı.

İlk başlarda amacım sadece programın çökmeden çalışmasını sağlamaktı. Ancak zamanla nesne yönelimli düşünme vizyonum geliştikçe; ilk dönem yazdığım o karmakarışık yapıyı (Spaghetti Code) temizleyip, modern yazılım prensiplerine uygun, daha profesyonel bir mühendislik mimarisine taşıdım.

🎯 **Projenin Amacı ve Mantığı**

Uygulama temel olarak kullanıcıdan; bulunduğu şehir, yaş, cinsiyet, hava sıcaklığı ve kişi sayısı gibi bilgileri alıyor. Sonrasında bu verilere bakarak kişiye özel bir etkinlik veya mekan önerisinde bulunuyor.

1. sınıfın ilk dönemindeki orijinal versiyonda tüm karar mekanizmasını karmaşık `if-else` ve `switch-case` bloklarıyla kurmuştum. Bu güncel versiyonda ise algoritmik karmaşayı tamamen çözmek adına **Strategy Design Pattern (Strateji Tasarım Deseni)** kullandım. İstanbul, Samsun ve Ankara olarak kurguladığım bu sisteme, gelecekte ana kodu (OneriMotoru) hiç değiştirmeden yepyeni şehirler eklenebilmektedir.

🛠️ **Bu Süreçte Neleri Tecrübe Ettim?**

İlk dönemki deneme-yanılma sürecimden bugünkü refactor (kodu iyileştirme) aşamasına kadar şu mühendislik konseptlerini aktif olarak uyguladım:

*   **Object-Oriented Programming (OOP):** Sistemdeki kullanıcı verilerini (`Kullanici`), çıktıları (`Oneri`) ve iş mantığını (`OneriMotoru`) birbirinden ayırarak katmanlı bir yapı kurdum. Bütün kodu tek bir `main` metoduna sıkıştırma (God Class) hatasından kurtuldum.
*   **Strategy Pattern ve Interface Kullanımı:** Şehirlere özel algoritmaları `OneriStratejisi` arayüzü (interface) üzerinden farklı dosyalara (örn: `IstanbulStratejisi.java`) böldüm.
*   **Kapsülleme (Encapsulation) ve Immutability:** Veri modellerimdeki değişkenleri `private final` yaparak dışarıdan yetkisiz değiştirilmelerini engelledim ve veri güvenliğini sağladım.
*   **Güvenli Girdi Yönetimi (Exception Handling):** Kullanıcıdan veri alırken programın çökmesini engellemek için özelleştirilmiş `try-catch` blokları kullandım. İlk dönem çok sık yaşadığım "Scanner Bug" (satır atlama) ve Locale kaynaklı (virgül/nokta) sayı alma sorunlarını kalıcı olarak çözdüm.
