

## Thread Nedir

   Aynı process ortamında birden fazla iş yürütme imkanı sağlar. Bir process’in çalışmaya başlaması ile birlikte bir thread (main thread) oluşturulur 
   ve process içerisinde birden fazla (multi-thread) oluşturulabilir. Yaratılan threadler aynı network de  ve farklı network de işlem yapabilirler. 
   Threadler genel olarak yazılım testleri yapılırken simülasyon olarak kullanılabilir ancak bilişim sistemlerinde cpu üzerinden işlem yapan thread 
   fiziki olarak işlem yaptığı için yazılım test senaryosundaki thread gruplardan farklı davranış gösterebilir. Threadler kullanıldığı alanlara göre
   farklılık gösterebilir. Kısaca Thread (iş parçacığı) kullanımı, birden fazla işlemin tek bir akışı paylaşarak neredeyse eşzamanlı bir şekilde
   gerçekleşmesini sağlar.
   
## MultiThread Nedir
   
   Bilgisayar mimarisinde, MultiThreading (çok iş parçacıklı), bir merkezi işlem biriminin (CPU)(veya çok çekirdekli bir işlemcideki tek bir çekirdeğin)
   aynı anda işletim sistemi tarafından desteklenen birden çok yürütme iş parçacığı sağlama yeteneğidir. Bu yaklaşım, çoklu işlemden farklıdır. 
   MultiThreading (çok iş parçacıklı) bir uygulamada, iş parçacıkları, hesaplama birimlerini, CPU önbelleklerini ve çeviri ön tampon tamponunu (TLB) 
   içeren tek veya çok çekirdeğin kaynaklarını paylaşır. Çok işlemcili sistemler, bir veya daha fazla çekirdekte birden çok tam işlem birimi içerdiğinde, 
   çok iş parçacıklı, iş parçacığı düzeyinde paralellik ve aynı zamanda talimat düzeyinde paralellik kullanarak tek bir çekirdeğin kullanımını artırmayı 
   amaçlar. Bu iki teknik birbirini tamamlayıcı nitelikte olduğundan, bazen çoklu çok iş parçacıklı CPU'lara ve birden fazla çok iş parçacıklı çekirdeğe 
   sahip CPU'lara sahip sistemlerde birleştirilirler.
   
## Thread Safety Nedir

   İş parçacığı güvenliği, çok iş parçacıklı koda uygulanabilen bir bilgisayar programlama konseptidir. İş parçacığı için güvenli kod, paylaşılan veri 
   yapılarını yalnızca tüm iş parçacıklarının düzgün davranmasını ve tasarım özelliklerini istenmeyen etkileşim olmadan yerine getirmesini sağlayacak 
   şekilde işler.
   
## Referanslar

 https://en.wikipedia.org/wiki/Thread_safety

 https://mertmekatronik.com/thread-ve-multithread-nedir
