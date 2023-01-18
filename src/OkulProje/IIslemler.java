package OkulProje;

public interface IIslemler {
    /*
       ============= İŞLEMLER =============
       1-EKLEME
       2-ARAMA
       3-LİSTELEME
       4-SİLME
       Q-ÇIKIŞ
   SEÇİMİNİZ:
     */
    void ekleme() throws InterruptedException;
    void arama() throws InterruptedException;
    void listeleme() throws InterruptedException;
    void silme() throws InterruptedException;

}
