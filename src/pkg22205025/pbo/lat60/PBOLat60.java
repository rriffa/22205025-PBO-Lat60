/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205025.pbo.lat60;

/**
 *
* @author Lenovo
 * Nama :Ma'rifatu Khirzah
 * Nim :22205025
 * Prodi :Teknik Informatika
 * Deskripsi : Membuat program Akatsuki
 */
class Akatsuki {

    protected String pakaian;
    protected String tugas;

    public Akatsuki(String pakaian, String tugas) {
        this.pakaian = pakaian;
        this.tugas = tugas;
    }

    public String getPakaian() {
        return pakaian;
    }

    public String getTugas() {
        return tugas;
    }

}

class Anggota extends Akatsuki {

    private String nama;
    private String asal;
    private String posisiCincin;
    private String ciriKhas;

    public Anggota(String nama, String asal, String posisiCincin, String ciriKhas, String pakaian, String tugas) {
        super(pakaian, tugas);
        this.nama = nama;
        this.asal = asal;
        this.posisiCincin = posisiCincin;
        this.ciriKhas = ciriKhas;
    }

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    public String getPosisiCincin() {
        return posisiCincin;
    }

    public String getCiriKhas() {
        return ciriKhas;
    }

    public void displayAnggota() {
        System.out.println("Nama \t\t: " + nama);
        System.out.println("Asal \t\t: " + asal);
        System.out.println("Posisi Cincin\t: " + posisiCincin);
        System.out.println("Ciri Khas\t: " + ciriKhas);
        System.out.println("Penampilan\t: " + pakaian);
        System.out.println("Tugas \t\t: " + tugas + "\n");
    }

}

public class PBOLat60 {

    public static void main(String[] args) {
        Anggota pain = new Anggota("Pain/Nagato", "Amegakure", "Jempol Kanan",
                "Rambut lancip, memiliki seperti tindikan di hidung, rambut berwarna jingga",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Menangkap naruto dan membawanya ke sarang akatsuki");
        pain.displayAnggota();

        Anggota konan = new Anggota("Konan", "Amegakure", "Jari tengah, Tangan kanan",
                "Memiliki aksesoris origami bunga di kepala, berambut biru",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Menangkap naruto dan membawanya ke sarang akatsuki");
        konan.displayAnggota();

        Anggota zetsu = new Anggota("Zetsu", "Tidak ada", "Kelingking kanan",
                "Berwajah hitam dan putih, mempunyai dua kepribadian, kanibal, "
                + "memiliki kerudung kepala seperti tumbuhan venus",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Menjadi pengintai selama ritual penyegelan Bijuu");
        zetsu.displayAnggota();

        Anggota kisame = new Anggota("Kisame Hoshigaki", "Kirigakure", "Jari manis kiri",
                "Memiliki kulit seperti ikan hiu, bergigi seperti ikan hiu",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Menangkap Jinchuuriki siluman berekor empat");
        kisame.displayAnggota();

        Anggota tobi = new Anggota("Tobi/Obito Uchiha", "Kohonagakure", "Jempol kiri",
                "Topeng jingga dengan satu lubang mata dengan pola pusaran yang"
                + " terpusat pada mata kanan",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Menangkap Jinchuuriki siluman berekor empat");
        tobi.displayAnggota();

        Anggota deidara = new Anggota("Deidara", "Iwagakure", "Telunjuk Kanan",
                "Rambut pirang dan dikuncir, spesialis ledakan menggunakan tanah liat dengan"
                + " mulut di telapak tangan dan dada",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Menangkap naruto dan membawanya ke sarang akatsuki");
        deidara.displayAnggota();

        Anggota hidan = new Anggota("Hidan", "Yugakure", "Telunjuk Kir",
                "Tidak bisa mati,membawa sabit besar bermata tiga, rambut cepak"
                + " berwarna pucat",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Menangkap naruto dan membawanya ke sarang akatsuki");
        hidan.displayAnggota();

        Anggota kakuzu = new Anggota("Kakuzu", "Takigakure", "Jari tengah kiri",
                "Memakai penutup wajah, dapat memperpanjang hidupnya dengan cara "
                + "mengambil jantung manusia, dapat memiliki lima jantung "
                + "manusia secara bersamaan.",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Menangkap naruto dan membawanya ke sarang akatsuki");
        kakuzu.displayAnggota();

        Anggota orochimaru = new Anggota("Orochimaru", "Konohagakure/Otogakure", "Telunjuk Kelingking kiri",
                "Berambut panjang berwarna hitam, berkulit pucat",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Menangkap naruto dan membawanya ke sarang akatsuki");
        orochimaru.displayAnggota();

        Anggota sasori = new Anggota("Sasori", "Sunagakure", "Jempol kiri",
                "Berambut pendek berwarna merah. Bertubuh boneka sehingga tidak bisa"
                + " menua dan juga ahli racun",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Menangkap naruto dan membawanya ke sarang akatsuki");
        sasori.displayAnggota();

        Anggota itachi = new Anggota("Itachi Uchiha", "Konohagakure", "Jari manis kanan",
                "Berambut belah tengah, ahli dalam Genjutsu, memakai sharingan dan"
                + " mangekyo sharingan",
                "Mengenakan jubah hitam panjang dengan motif awan merah",
                "Menangkap naruto dan membawanya ke sarang akatsuki");
        itachi.displayAnggota();

    }

}
