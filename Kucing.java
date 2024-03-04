public class Kucing {
    public String nama = "asep";
    public String umur = "20th";
    public int tinggi = 120;
    public String sound = "meow";

    public void displayNama() {
        System.out.println("Nama kucing = " + nama);
    }

    public void displayUmur() {
        System.out.println("Umur kucing = " + umur);
    }

    public void displayTinggi() {
        System.out.println("Tinggi kucing = " + tinggi);
    }

    public void displaySound() {
        System.out.println("Suara kucing = " + sound);
    }

    public static void main(String[] args) {
        Kucing kucingpemangil = new Kucing();
        kucingpemangil.displayNama();
        kucingpemangil.displayUmur();
        kucingpemangil.displayTinggi();
        kucingpemangil.displaySound();
    }
}
