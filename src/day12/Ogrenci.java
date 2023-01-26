package day12;

public class Ogrenci {
    /*
    -AD SOYAD
	-KİMLİK NO
	-YAŞ
	-NUMARA
	-SINIF
     */
    private String AD;

    public Ogrenci() {
    }

    public void setSINIF(String SINIF) {
        this.SINIF = SINIF;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ÖĞRENCİ AD='" + AD + "\n" +
                ",ÖĞRENCİ SOYAD='" + SOYAD + "\n" +
                ", ÖĞRENCİ TcNO='" + TcNO + "\n" +
                ",ÖĞRENCİ YAS='" + YAS + "\n" +
                ",ÖĞRENCİ NUMARA='" + NUMARA + "\n" +
                ",ÖĞRENCİ SINIF='" + SINIF +"\n" +
                '}';
    }

    private String SOYAD;
    private String TcNO;
    private String YAS;
    private String NUMARA;

    public Ogrenci(String AD, String SOYAD, String tcNO, String YAS, int NUMARA, String SINIF) {
        this.AD = AD;
        this.SOYAD = SOYAD;
        TcNO = tcNO;
        this.YAS = YAS;
        this.NUMARA = String.valueOf(NUMARA);
        this.SINIF = SINIF;
    }

    public String getAD() {
        return AD;
    }

    public String getSOYAD() {
        return SOYAD;
    }

    public String getTcNO() {
        return TcNO;
    }

    public String getYAS() {
        return YAS;
    }

    public String getNUMARA() {
        return NUMARA;
    }

    public String getSINIF() {
        return SINIF;
    }

    private String SINIF;
}
