/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package User;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */

public class Main {
    static Client client = new Client();
    static Petugas petugas = new Petugas();
    static Scanner input = new Scanner(System.in);
    static String key;
    static Transaksi transaksi = new Transaksi();
    static JenisLaundry jenislaundry = new JenisLaundry();
    static boolean var = true;
    
    public static void main(String[] args){
        System.out.println("Apakah Anda Sudah Memiliki Akun?(Ya/Tidak)");
        String jawab = input.next();
        if(jawab.equalsIgnoreCase("Ya")){
            System.out.println("Masukkan ID Akun Anda ");
            int id = input.nextInt();
            System.out.println("Welcome "+client.getNama(id)+"!");
            System.out.println("ID Anda Adalah "+transaksi.getIDClient(id));
            menu(id);
        }
        else {
            System.out.println("Masukkan Nama Anda");
            String nama = input.next();
            client.setNama(nama);
            transaksi.setIDClient(transaksi.size());
            System.out.println("Masukkan Alamat Anda");
            String alamat = input.next();
            client.setAlamat(alamat);
            System.out.println("Masukkan Nomor Telepon");
            String telepon = input.next();
            client.setTelepon(telepon);
            System.out.println("Masukkan Saldo Yang Ingin Ditambahkan");
            int saldo = input.nextInt();
            client.addSaldo(saldo);
            System.out.println("Terimakasih Telah Mendaftar "+nama);
            int i = client.getId(nama);
            System.out.println("ID Anda Adalah "+transaksi.getIDClient(i));
            menu(i);
        }
    }
    
    public static void tampilLaundry(){
        int n = jenislaundry.size();
        for(int v=0;v<n;v++){
            System.out.println("[=========================]");
            System.out.println("        "+jenislaundry.getLaundry(v));
            System.out.println("Harga  = "+jenislaundry.getHarga(v));
            System.out.println("Durasi = "+jenislaundry.getDurasi(v)+" Jam");
            System.out.println("ID     = "+transaksi.getIDJenisLaundry(v));
        }
    }
    
    public static void menu(int id){
        while(var){
            System.out.println("");
            System.out.println("=== Laundry Pak Bayu  ===");
            System.out.println("1. List Jenis Laundry");
            System.out.println("2. List Petugas/Karyawan");
            System.out.println("3. List Client");
            System.out.println("4. Laundry");
            System.out.println("5. EXIT");
            System.out.println("==========================");
            System.out.print("Pilih Menu: ");
            int menu = input.nextInt();
		switch (menu) {
			case 1:
				tampilLaundry();
				System.out.println("Ketik Apapun Untuk Keluar");
				key = input.next();
				break;
			case 2:
				petugas.tampilPetugas();
				System.out.println("Ketik Apapun Untuk Keluar");
				key = input.next();
				break;
			case 3:
				client.tampilClient();
				System.out.println("Ketik Apapun Untuk Keluar");
				key = input.next();
				break;
			case 4:
				tampilLaundry();
				System.out.println("Masukkan Id Laundry");
				int laundry = input.nextInt();
				System.out.println("Masukkan Berapa Kg Laundry Anda");
				int banyak = input.nextInt();
				int harga = jenislaundry.getHarga(laundry-1)*banyak;
                                int total;
                                total = client.getSaldo(transaksi.getClient(id))-harga;
				if(client.getSaldo(id)>=harga){
					System.out.println("===========TOTAL===========");
					System.out.println("Jenis Laundry = "+jenislaundry.getLaundry(laundry));
                                        System.out.println("Berat Laundry = "+banyak+" kg");
					System.out.println("Total Harga   = "+harga);
					System.out.println("Durasi        = "+jenislaundry.getDurasi(laundry)+" Jam");
                                        client.setSaldo(id, client.getSaldo(id)-harga);
                                        System.out.println("Sisa Saldo    = "+total);
                                        System.out.println("");
					System.out.println("Terimakasih Silahkan Datang Kembali");
					System.out.println("Ketik Apapun Untuk Keluar");
					key = input.next();
				}
				else{
					System.out.println("Saldo Anda Tidak Cukup");
					System.out.println("Ketik Apapun Untuk Keluar");
					key = input.next();
				}		break;
			case 5:
                                System.out.println("=================");
				System.out.println("Sampai Jumpa Lagi");
				var = false;
				break;
			default:
				System.out.println("ERROR!");
				System.out.println("Ketik Apapun Untuk Kembali");
				key = input.next();
				break;
		}
        }
    }
}

