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
public class JenisLaundry {

    private ArrayList<String> jenisLaundry = new ArrayList<String>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    private ArrayList<Integer> durasiJam = new ArrayList<Integer>();
    
    public int size(){
        return this.jenisLaundry.size();
    }
    
    public JenisLaundry(){
        this.jenisLaundry.add("Cuci Kering/Kg");
        this.harga.add(5000);
        this.durasiJam.add(48);
        
        this.jenisLaundry.add("Cuci Express/Kg");
        this.harga.add(8500);
        this.durasiJam.add(12);
        
        this.jenisLaundry.add("Setrika Saja/Kg");
        this.harga.add(10000);
        this.durasiJam.add(10);
        
        this.jenisLaundry.add("Cuci Sprei/Kg");
        this.harga.add(10000);
        this.durasiJam.add(72);
    }
    
    public void setLaundry(String jenis){
        this.jenisLaundry.add(jenis);
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public void setDurasi(int durasi){
        this.durasiJam.add(durasi);
    }
    public String getLaundry(int id){
        return this.jenisLaundry.get(id);
    }
    public int getHarga(int id){
        return this.harga.get(id);
    }
    public int getDurasi(int id){
        return this.durasiJam.get(id);
    }
    
}


