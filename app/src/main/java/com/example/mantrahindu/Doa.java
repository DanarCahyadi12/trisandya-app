package com.example.mantrahindu;


import java.util.ArrayList;
import java.util.List;

class DoaModel{
     String title;
     String content;
     String mean;

     public DoaModel(String titleParam, String contentParam, String meanParam) {
         this.title = titleParam;
         this.content = contentParam;
         this.mean = meanParam;
     }
}

public class Doa {
    private List<DoaModel> doaList = new ArrayList<>();

    Doa() {
        doaList.add(new DoaModel("Doa Bangun Tidur Pagi Hari", "Om Jagrasca Prabhata Kalasca Ya Namah Swaha.", "Oh Hyang Widhi, Hamba Memujamu, Bahwa Hamba Telah Bangun Pagi Dalam Keadaan Selamat."));
        doaList.add(new DoaModel("Doa Ketika Mandi","Om Gangga Amrta Sarira Sudhamam Swaha.Om Sarira Parisudhamam Swaha.", "Ya Tuhan, Engkau Adalah Sumber Kehidupan Abadi Nan Suci, Semoga Badan Hamba Menjadi Bersih Dan Suci"));
        doaList.add(new DoaModel("Doa Sebelum dan Sesudah Makan", "Om Anugraha Amrtadi Sanjiwani Ya Namah Swaha.", "Oh Hyang Widhi, Semoga Makanan Ini Menjadi Amerta Yang Menghidupkan Hamba"));
        doaList.add(new DoaModel("Doa Bekerja", "Om Awighnam Astu Namo Sidham. Om Sidhirastu Tad Astu Swaha.", "Ya Tuhan, Semoga Atas Berkenanmu, Tiada Suatu Halangan Bagi Hamba Memulai Pekerjaan Ini Dan Semoga Berhasil Baik"));
        doaList.add(new DoaModel("Doa Diberi Kecerdasan", "Om Pawakanah Saraswati Wajebhir Wajiniwati Yajnam Wastu Dhiyawasuh.", "Ya Tuhan, Sebagai Manifestasi Dewi Saraswati, Yang Maha Suci, Anugerahilah Hamba Kecerdasan Dan Terimalah Persembahan Hamba Ini"));
        doaList.add(new DoaModel("Doa Mulai Belajar", "Om Purwe Jato Brahmano Brahmacari Dharmam Wasanas Tapasodatistat Tasmajjatam Brahmanam Brahma Iyestham Dewasca Sarwe Amrttna Sakama.", "Ya Tuhan, Muridmu Hadir Dihadapanmu, Oh Brahman Yang Berselimutkan Kesaktian Dan Berdiri Sebagai Pertama, Tuhan, Anugrahkanlah Pengetahuan Dan Pikiran Yang Terang. Brahman Yang Agung, Setiap Mahkluk Hanya Dapat Bersinar Berkat Cahayamu Yang Senantiasa Memancar"));
        doaList.add(new DoaModel("Doa Ketika Sakit","Om Trayam Bhakam Ya Jamahe Sughamdin Pusthi Wardhanam Uhrwaru Kham Iwa Bhandhanat .Mrityor Mukhsya Mamritat.", "Oh Sanghyang Widhi Wasa, Yang Maha Mulia. Kami Memujamu, Hindarkanlah Kami Dari Keraguan Ini. Bebaskanlah Kami Dari Belenggu Dosa, Bagaikan Mentimun Lepas Dari Tangkainya, Sehingga Kami Dapat Bersatu Denganmu"));
        doaList.add(new DoaModel("Doa Agar Keluarga Bahagia", "Om Wisowiso Wo Atithim Wajayantah Purupriyam Agnim Wo Duryam Wacah Stuse Susasya Manmabhih.","Ya Tuhan, Engkau Adalah Tamu Yang Datang Pada Setiap Rumah. Engkau Amat Mencintai Umatmu. Engkau Adalah Sahabat Yang Maha Pemurah. Perkenankanlah Hamba Memujamu Dengan Penuh Kekuatan, Dalam Ucapan Maupun Tenaga Dan Dalam Lagu Pujian"));
        doaList.add(new DoaModel("Doa Ulang Tahun","Om Dirgayurastu Tad Astu Astu Swaha.","Oh Sanghyang Widhi Wasa Semoga Bahagia Dan Panjang Umur Atas Karuniamu"));
        doaList.add(new DoaModel("Doa Sebelum Tidur", "Om Asato Ma Sat Gamaya, Tamaso Ma Jyotir Gamaya Mrityor Mamritan Gamaya.", "Oh Sanghyang Widhi Wasa, Tuntunlah Kami Dari Jalan Sesat Ke Jalan Yang Benar, Dari Jalan Gelap Ke Jalan Yang Terang Hindarkan Kami Dari Kematian Menuju Kehidupan Sejati"));
        doaList.add(new DoaModel("Doa Sebelum Berhubungan Suami Istri","Om Krung Kama Supurna Dewata Manggala Ya Namah Swaha.","Ya Tuhan, Dewa Asmara Yang Amat Suci Yang Terutama Kami Hormati."));
        doaList.add(new DoaModel("Doa Menolak Bahaya", "Om Om Asta Maha Bayaya. Om Sarwa Dewa, Sarwa Sanjata, Sarwa Warna Ya Namah, Om Atma Raksaya, Sarwa Satru, Winasaya Namah Swaha.", "Oh Sanghyang Widhi Wasa Penakluk Segala Macam Bahaya Dari Segala Penjuru, Hamba Memujamu Dalam Wujud Sinar Suci Dengan Beraneka Warna Dan Senjata Yang Ampuh. Oh Sanghyang Widhi Wasa Lindungilah Jiwa Kami. Semoga Semua Musuh Binasa"));
        doaList.add(new DoaModel(" Doa Menyambut Kelahiran Bayi","Om Brhatsumnah Prasawita. Om Brhatsumnah Prasawita Niwesano Jagatah Sthaturub Hayasya Yo Wasi Sano Dewah Sawita Sarma Yaccha Twasme Ksayaya Triwarutham Amhasah.", "Ya Tuhan Yang Maha Pengasih, Yang Memberi Kehidupan Pada Alam Dan Menegakkannya. Ia Mengatur Yang Bergerak Maupun Yang Tidak Bergerak Semoga Ia Memberi Rahmatnya Kepada Kami Untuk Ketentraman Hidup Dengan Kemampuan Untuk Menghindari Kekuatan Yang Jahat"));
    }

    public List<DoaModel> getAllDoa() {
        return doaList;
    }
}
