package Tugas4Praktikum;

public class DemoBangunRuang {
    public static void main(String[] args) {
        Balok bangun1 = new Balok(5, 3, 2);
        Kubus bangun2 = new Kubus(4);

        System.out.println("Balok:");
        System.out.println("Volume: " + bangun1.hitungVolume());
        System.out.println("Luas Permukaan: " + bangun1.hitungLuasPermukaan());

        System.out.println("Kubus:");
        System.out.println("Volume: " + bangun2.hitungVolume());
        System.out.println("Luas Permukaan: " + bangun2.hitungLuasPermukaan());
    }
}