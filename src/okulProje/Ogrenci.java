package okulProje;

public class Ogrenci extends Kisi{
    //Ad-Soyad,  kimlik No, yaş,numara,sınıf
    private int numara;
    private int sinif;



    public int getNumara() {
        return numara;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public Ogrenci(String ad, String soyad, String tcNo, String yas, int numara, int sinif) {
        super(ad, soyad, tcNo, Integer.parseInt(yas));
        this.numara = numara;
        this.sinif = sinif;
    }

    public Ogrenci() {
    }

    @Override
    public String toString() {
        return super.toString() +" "+
                "numara=" + numara +
                ", sinif=" + sinif;
    }
}
