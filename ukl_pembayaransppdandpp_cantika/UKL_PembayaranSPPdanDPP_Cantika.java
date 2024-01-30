
package ukl_pembayaransppdandpp_cantika;
import java.util.Scanner;

public class UKL_PembayaranSPPdanDPP_Cantika {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nama = {"", "Mira", "Nina", "Oemar", "Pena"};
        String[] jalur = {"", "SBMPTN", "SNMPTN", "Mandiri", "SBMPTN"};
        String[] alamat = {"", "Sawojajar", "Kedung kadang", "Ijen", "Dinoyo"};
        String[] kat = {"A", "B", "C"};
        int[] pen = {2000000, 10000000};
        
        System.out.println("================================================");
        System.out.println("             Pembayaran SPP dan DPP             ");
        System.out.println("================================================");
        System.out.print("Masukkan ID anda\t: ");
        int id = input.nextInt();
        if (id<1 || id>4) {
            System.out.println("SALAHHH");
            System.out.println("================================================");
        }
        else {
            System.out.print("Masukkan pendapatan orang tua anda: ");
            int gaji = input.nextInt();
            if (gaji < 0) {
                System.out.println("SALAHHH");
                System.out.println("================================================"); 
            }
            else {
                System.out.print("Masukkan jumlah bulan SPP yang akan dibayar: ");
                int spp = input.nextInt();
                int biaya = hitung(jalur[id], kat[id], spp, gaji);
                System.out.println("================================================");
                System.out.println("ID Mahasiswa: " + id);
                System.out.println("Nama Mahasiswa: " + nama[id]);
                System.out.println("Jalur masuk: " + jalur[id]);
                System.out.println("Alamat: " + alamat[id]);
                System.out.println("Kategori pendapatan: " + kategori(gaji));
                System.out.println("Jumlah biaya: " + biaya);
                System.out.println("================================================");
            }
        }
    }
    
    public static int hitung(String jalur, String kat, int spp, int gaji) {
        int DSP = 0;
        int SPP = 0;
        
        if (jalur.equals("SBMPTN")) {
            if (gaji >= 10000000) {
                DSP = 30000000;
                SPP = 2000000;
            } 
            else if (gaji >= 2000000) {
                DSP = 15000000;
                SPP = 1000000;
            } 
            else {
                DSP = 5000000;
                SPP = 500000;
            }
        } 
        else if (jalur.equals("SNMPTN")) {
            if (gaji >= 10000000) {
                DSP = 35000000;
                SPP = 2000000;
            }
            else if (gaji >= 2000000) {
                DSP = 17000000;
                SPP = 1000000;
            }
            else {
                DSP = 7000000;
                SPP = 500000;
            }
        } 
        else {
            if (gaji >= 10000000) {
                DSP = 50000000;
                SPP = 3000000;
            } 
            else if (gaji >= 2000000) {
                DSP = 25000000;
                SPP = 2000000;
            } 
            else {
                DSP = 10000000;
                SPP = 1000000;
            }
        }
        
        int biaya = (DSP + SPP * spp);
        return biaya;
    }
    
    public static String kategori(int gaji) {
        if (gaji >= 10000000) {
            return "C";
        } 
        else if (gaji >= 2000000) {
            return "B";
        } 
        else {
            return "A";
        }
    }
    }
    

