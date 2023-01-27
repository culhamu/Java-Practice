package com.mustafaculha.paket1;

import com.mustafaculha.paket2.AdayOgrenci;

public class Ogrenci implements AdayOgrenci {

    @Override
    public void dersCalis() {
        System.out.println("Ders çalışıyorum....");
    }
}
