/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;

import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class Petugas implements User {
    
    private ArrayList<String> namaPetugas = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<String> jabatan = new ArrayList<String>();

    public Petugas() {
        this.namaPetugas.add("Sakimin");
        this.alamat.add("Bantur");
        this.telepon.add("089192149523");
        this.jabatan.add("Satpam");
        
        this.namaPetugas.add("Adiyono Kartomihardjo");
        this.alamat.add("Klaten");
        this.telepon.add("089737284294");
        this.jabatan.add("Karyawan");
    }

    public void setJabatan(String jabatan) {
        this.jabatan.add(jabatan);
    }

    public String getJabatan(int id) {
        return this.jabatan.get(id);
    }

    public int getJmlKaryawan() {
        return this.namaPetugas.size();
    }


  @Override
    public void setNama(String nama) {
        this.namaPetugas.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getNama(int id) {
        return this.namaPetugas.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }
    
    public void tampilPetugas(){
        int n = this.namaPetugas.size();
        for(int i=0;i<n;i++){
            System.out.println("------------------------");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
            System.out.println("Jabatan = "+getJabatan(i));
        }
    }
}