package model;

public class Kontak {
    private int id;
    private String nama;
    private String nomorTelepon;
    private String kategori;

    public Kontak(int id, String nama, String nomorTelpon, String kategori) {
        this.id = id;
        this.nama = nama;
        this.nomorTelepon = nomorTelpon;
        this.kategori = kategori;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
}