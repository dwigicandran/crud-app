package com.bootcamp.crud.model;

import javax.persistence.*;

@Entity
@Table(name = "computer")
public class Computer {
//    id,nama,type,merk,harga;

    //buat tabel computer dengan variabel diatas, lalu buat reponya,
    //buat controllernya dan servicenya  agar bisa diakses di postman dengan method
    // create , read, update, delete

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nama;
    private String type;
    private String merk;
    private long harga;

    public Computer() {
    }

    public Computer(long id, String nama, String type, String merk, long harga) {
        this.id = id;
        this.nama = nama;
        this.type = type;
        this.merk = merk;
        this.harga = harga;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public long getHarga() {
        return harga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }
}
