# Javaodev4

1)	Unit Test kodun her bileşenini beklenildiği gibi çalışıp çalışmadığını kontrol etmek amacıyla yapılan bir test sürecidir. Her bir kod parçasını izole eder ve üzerinde testler gerçekleştirir. Unit test, yazılımın yayınlamadan önce beklenildiği gibi çalıştığından emin olmamıza yardımcı olur.

  	Selenium
Selenium, tarayıcı otomasyonu için kullanılan açık kaynaklı bir yazılım test aracıdır. Web uygulamaları için otomasyon testleri yazmak için Java, Python vb. dillerde yazılmış test scriptleri oluşturur.

  	Junit
JUnit, Java Sanal Makinesi üzerinde çalışan açık kaynaklı bir test frameworkün temelini oluşturur. JUnit test frameworkün amacı, bir uygulama için verimli bir şekilde birim testler oluşturmak ve yürütmek üzerine yoğunlaşır.

Diğerleri: TestNG, SerenityBDD, Mockito, Katalon.
     
  Unit test frameworklerinde uyulması taktirde olumlu sonuçlar alınılabilecek bazı temel kurallar:

a) Okunaklı Basit Testler Yazılır
Basit test caseleri yazmak, sürdürmek ve anlamak daha kolaydır. Ayrıca basit testleri yeniden yapılandırmak daha kolaydır. Eğer test karmaşıksa ve bazı kodları yeniden yapılandırmanız gerekiyorsa testler bozulabilir.

b) Her test için bir senaryo test edilir
Manuel test genellikle çeşitli senaryoları test etmeyi içerir, örneğin, belirli bir hatanın çözüldüğünü doğrulamak ve tüm ilgili özelliklerin beklenildiği gibi çalıştığını kontrol etmek gibi. Birim testlerin her birinin tek bir senaryoyu kapsadığından her zaman emin olunulmalı, farklı test türlerini ve değişkenleri kontrol edebilirsiniz, ancak her bir birim testin tek bir senaryoyu kapsadığından emin olunmalıdır.



c) Birim testleri otomatikleştirmek önemlidir
Günlük veya saatlik olarak veya CI/CD (Continuous Integration/Continuous Delivery) süreci aracılığıyla birim testleri otomatik olarak yürütülmeli.

d) Testler arasındaki bağımlılıklardan kaçınılmalıdır
Birim testleri %100 test kapsamını gerektirmez. Gereken kod kapsamına ulaşmak için yapılandırılmış çok sayıda test yerine daha az, ancak yüksek kaliteli birim testleri kurulmalıdır. Birim testleri, bireysel kod birimlerini doğrulamayı amaçlar, bu nedenle testler arasındaki bağımlılıktan kaçınılmalıdır.


2) Tasarım kalıpları zaten tanımlanmış ve tekrar eden bir sorunu çözme konusunda endüstri standardı bir yaklaşım sunar, bu nedenle tasarım kalıplarını mantıklı bir şekilde kullanırsak zaman kazandırır. Tasarım kalıpları zaten tanımlı olduğundan, kodumuzu anlamak ve hata ayıklamak kolaylaşır. Bu, daha hızlı geliştirme ve yeni ekip üyelerinin kolayca anlamalarını sağlar. Java tabanlı projelerimizde kullanabileceğimiz birçok Java tasarım kalıbı bulunmaktadır. Bu tasarım kalıpları genel itibariyle 3 ana sınıfa ayrılabilir bunlar:

a)Creational                                b)Structural                                  c)Behavioural

a)Creational

Factory Pattern: Fabrika tasarım deseni, bir üst sınıfın birden fazla alt sınıfa sahip olduğu durumlarda ve girdiye bağlı olarak bu alt sınıflardan birini döndürmemiz gerektiğinde kullanılır.

Builder Pattern: Bu tasarım deseni, büyük bir sayıda opsiyonel parametre ve tutarsız durum sorununu çözer. Nesneyi adım adım oluşturmanın bir yolunu sağlar ve son nesneyi geri döndürecek bir yöntem sunar.



b)Structural

Adapter Pattern: Adaptör tasarım deseni, yapısal tasarım desenlerinden biridir ve iki ilişkisiz arabirimin(interface) birlikte çalışabilmesi için kullanılır. Bu iki ilişkisiz arayüzü bir araya getiren nesneye "adaptör" denir.

Proxy Pattern: Proxy deseni, başka bir nesneye erişimi kontrol etmek için bir yer tutucu sağlar. Bu desen, işlevselliğe kontrollü erişim sağlamak istediğimizde kullanılır.

c)Behavioral

Iterator Pattern: İteratör deseni, davranışsal desenlerden biridir ve bir nesne grubu üzerinden dolaşmak için standart bir yol sağlamak için kullanılır.

Interpreter Pattern: Tercüman deseni, bir dilin dilbilgisel temsilini tanımlamak ve bu dilbilgisini işlemek için bir tercüman sağlamak için kullanılır.






