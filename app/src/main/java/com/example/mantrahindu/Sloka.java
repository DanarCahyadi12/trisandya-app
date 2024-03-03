package com.example.mantrahindu;


import java.util.ArrayList;
import java.util.List;

class SlokaModel {
    String scripture;
    String content;
    String mean;

    SlokaModel(String scripture, String content, String mean) {
        this.scripture = scripture;
        this.content = content;
        this.mean = mean;
    }

}

public class Sloka {
    private List<SlokaModel> slokaData = new ArrayList<>();
    Sloka() {
        slokaData.add(new SlokaModel("Bhagawadgita II.23", "nainaṃ chindanti śastrāṇic nainaṃ dahati pāvakaḥ, na cainaṃ kledayantyāpo na śoṣayati mārutaḥ", "Senjata tidak dapat melukai Jiwa, api tidak bisa membakarnya, angin tidak dapat mengeringkannya, dan air tdk bisa membasahinya,"));
        slokaData.add(new SlokaModel( "Bhagawadgita II.56.", "Duhkhesv anudvigna-manah Sukhesu vigata-sprhah Vita-raga bhaya krodhah Sthita-dhir munir ucyate", "Orang yg tdk sedih dikala duka, Tdk melonjak kegirangan dikala bhagia,\n" +
                    "Bebas dr nafsu, takut dan amarah, Ia dsbt suci teguh iman"));
        slokaData.add(new SlokaModel("Bhagawadgita III.8", "Nityam kuru karma twam  karma jyayo hi akarmanah Sarira ya traoi ca na prasidayed akarmanah", "lakukanlah kewajibanmu karena hal itu lebih baik drpada tdk bekerja, karena seseorang tdk akan dapat memelihara badan jasmani tanpa bekerja"));
        slokaData.add(new SlokaModel("Bhagawadgita III.13", "yajna sistasinah santo Mucyante sarva kilbisaih Mucyante sarva kilbisaih Bhunjate te tv agham papa  Ye pacanty atma-karanat", "Ia yang memakan sisa yadnya akan terlepas dari dosa,\n" +
                "Ia yang memasak makan bagi dirinya sendiri sesungguhnya makan dosa\n"));
        slokaData.add(new SlokaModel( "Bhagawadgita IV.7","Yada yada hi dharmasya  glanir bhavati bharata abhyutthanam adharmasya tadatmanam srjamy aham", "kapanpundn dimanapun Manakala kebenaran merosot dan kejahatan merajalela,\n" +
                "pada saat itulah Aku akan turun menjelma ke dunia,\n" +
                "\n" +
                "wahai keturunan Bharata (yang dimaksud adalah Arjuna)"));
        slokaData.add(new SlokaModel( "Bhagawadgita IV.11", "ye yatha mam prapadyante tama tathaiva bhajamy aham mama vartmanuvartanta manusyah partha sarvasah", "Sejauh mana semua orang menyerahkan diri kepada-Ku Aku menganugerahi mereka sesuai dengan penyerahan dirinya itu. Semua orang menempuh jalan-Ku dalam segala hai,wahai putera Prtha."));
        slokaData.add(new SlokaModel( "Bhagawadgita IV.19", "yasya sarve samārambhah kāma-sankalpa-varjitāh  jnānagni-dagdha-karmānam tam āhuh panditam budhāh", "Ia yang bekerja dalam semua kerjanya tidak terikat oleh motif atau karma, yang karmanya terbakar oleh apinya pengetahuan, sesungguhnya orang bijaksana menamakannya Pendeta"));
        slokaData.add(new SlokaModel("Bhagawadgita IV.33", "Sreyan dravyamayad yajnaj Sreyan dravyamayad yajnaj Sarvam karma, khilam partha Jnane parisamapya", "Wahai penakluk musuh, korban suci yang dilakukan dengan pengetahuan lebih baik daripada hanya mengorbankan harta benda material. Wahai putera prtha, bagaimanapun, maka segala korban suci yang terdiri dari pekerjaan memuncak dalam pengetahuan rohani."));
        slokaData.add(new SlokaModel( "Bhagawadgita IV.33", "api ced asi pāpebhyaḥ sarvebhyaḥ pāpa-kṛt-tamaḥ sarvaṁ jñāna-plavenaiva  vṛjinaṁ santariṣyasi", "diantara seluruh jenis yadnya, yadnya pengetahuanlah yg paling utama, karena yadnya pengetahuan bisa menyelamatkan diri dr lautan kelahiran kematian."));
        slokaData.add(new SlokaModel("Bhagawadgita IV.36", "Api ced asi papebhyah, sarwabheyah papa krt,tamah,  sarwa jnana peavenaiva vriijinam santarisyasi.", "walau engkau paling berdosa di antara yang memiliki dosa, dengan ilmu pengetahuan, lautan dosa akan dapat engkau seberang"));
    }

    public List<SlokaModel> getAllSloka() {
        return slokaData;
    }

    public SlokaModel getDetailSloka(int index) {
        return slokaData.get(index);
    }


}
