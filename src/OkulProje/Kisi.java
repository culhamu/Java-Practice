package OkulProje;

public class Kisi {
    /*
    Ad-Soyad,  kimlik No, yaş
     */
    private String ad;
    private String soyad;
    private String tcNo;
    private String yas;

    @Override
    public String toString() {
        return "Kisi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", yas='" + yas + '\'' +
                '}';
    }

    public Kisi(String ad, String soyad, String tcNo, String yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.tcNo = tcNo;
        this.yas = yas;
    }

    public Kisi() {
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }
}
