package OkulProje;

public class Ogretmen extends Kisi{
    //Ad-Soyad,  kimlik No, yaş,bölüm,sicilno
    private String bolum;
    private int sicilNo;

    public Ogretmen() {
    }

    public Ogretmen(String ad, String soyad, String tcNo, String yas, String bolum, int sicilNo) {
        super(ad, soyad, tcNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen(String ad, String soyad, String tcNo, int yas, String bolum, int sicilNo) {
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(int sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return
               super.toString()+" "+ "bolum='" + bolum + '\'' +
                ", sicilNo=" + sicilNo ;
    }
}
