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
public class Client implements User{
   private ArrayList<String> namaClient = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    
    public int size(){
        return this.namaClient.size();
    }
    public Client(){
        this.namaClient.add("Katiman");//Array namaClient = ["Katiman","Suhar","Adit","Dwi"];
        this.alamat.add("Lampung");//Array alamat = ["Lampung","Jombang","Madura","Jakarta"];
        this.telepon.add("081234567890");//Array telepon = ["081234567890","081122334455","08956784321","089567767676"];
        this.saldo.add(1500000);//Array saldo = ["1500000","1100000","2500000","500000"];
        
        this.namaClient.add("Suhar");
        this.alamat.add("Jombang");
        this.telepon.add("081122334455");
        this.saldo.add(1100000);
        
        this.namaClient.add("Adit");
        this.alamat.add("Madura");
        this.telepon.add("08956784321");
        this.saldo.add(2500000);
        
        this.namaClient.add("Dwi");
        this.alamat.add("Jakarta");
        this.telepon.add("089567767676");
        this.saldo.add(500000);
    }

    public int getId(String nama){
        return this.namaClient.indexOf(nama);
    }
    
   @Override
    public void setnomer(){
        System.out.println("123");
    }
       public int getnomer(){
           return 123;
    }
    @Override
    public void setNama(String nama) {
        this.namaClient.add(nama);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }
    
    public void addSaldo(int saldo){
        this.saldo.add(saldo);
    }
    
    public void setSaldo(int id,int saldo){
        this.saldo.set(id,saldo);
    }

    @Override
    public String getNama(int id) {
        return this.namaClient.get(id);
    }

    @Override
    public String getAlamat(int id) {
        return this.alamat.get(id);
    }

    @Override
    public String getTelepon(int id) {
        return this.telepon.get(id);
    }

    public int getSaldo(int id){
        return this.saldo.get(id);
    }
    
    public void tampilClient(){
        int n = this.namaClient.size();
        for(int i=0;i<n;i++){
            System.out.println("<------------------------>");
            System.out.println("Nama    = "+getNama(i));
            System.out.println("Alamat  = "+getAlamat(i));
            System.out.println("Telepon = "+getTelepon(i));
            System.out.println("Saldo   = "+getSaldo(i));
        }
    }
}