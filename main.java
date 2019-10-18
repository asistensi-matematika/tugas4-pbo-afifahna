/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4asis;
import java.util.Scanner;
/**
 *
 * @author AFIFAH NADHIRAH
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pilih bangun datar yg diinginkan " + "\n1.Persegi" + "\n2.Lingkaran" + "\n3.Segitiga");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan pilihan anda : ");
        int nomor;
         nomor = input.nextInt();
        
        switch (nomor) {
            case 1:
                System.out.println("Masukkan panjang sisi : ");
                persegi p = new persegi();
                p.jenis = "Persegi";
                p.sisi = input.nextDouble();
                p.view();
                break;
            case 2:
                System.out.println("Masukan panjang jari-jari : ");
                lingkaran l = new lingkaran();
                l.jenis = "Lingkaran";
                l.jari = input.nextDouble();
                l.view();
                break;
            case 3:
                System.out.println("Pilih Segitiga yg diinginkan \n1.Segitiga siku-siku \n2.Segitiga sama sisi");
                System.out.println("Masukkan pilihan anda : ");
                int jenissegitiga = input.nextInt();
                jenissegitiga j = new jenissegitiga();
                System.out.println("Masukkan alas  : ");
                j.alas = input.nextDouble();
                System.out.println("Masukkan tinggi : ");
                j.tinggi = input.nextDouble();
                j.jenis = "segitiga";
        switch (jenissegitiga) {
            case 1:
                j.view(j.alas);
                break;
            case 2:
                j.view(j.alas,j.tinggi);
                break;
            default:
                System.out.println("Tidak ada output");
                break;
        }
                break;
            default:
                System.out.println("Tidak ada output");
                break;
        }
    }   
}
