/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4asis;

/**
 *
 * @author AFIFAH NADHIRAH
 */
class bangundatar {
    protected String jenis;
    public bangundatar(){
        jenis = null;
    }
    public bangundatar(String jeniss){
        jenis = jeniss;
    }
    
    public void view(){
        System.out.println("Nama bangun datar adalah " +jenis);
    }
}

class segitiga extends bangundatar{
    protected double alas;
    protected double tinggi;
    
    public segitiga(){
        alas = 0;
        tinggi = 0;
    }
    public segitiga(double a, double t){
        alas = a;
        tinggi = t;
    }
    public double luas(double a, double t){
        return (0.5*a*t);
    }
    public void view(){
        super.view();
        System.out.println("Luas segitiga adalah "+luas(alas,tinggi));
    }}

class jenissegitiga extends segitiga{
    public double sisimiring(double alas, double tinggi){
        return Math.sqrt(Math.pow(alas,2)+Math.pow(tinggi,2));
    }
    public double keliling(double alas){
        return (3*alas);
    }
    public double keliling(double alas, double tinggi){
        return (alas+tinggi+sisimiring(alas, tinggi));
    }
    public void view(double alas){
        super.view();
        System.out.println("Jenis Segitiga adalah Segitiga Siku-siku \nKeliling Segitiga adalah "+(3*alas));
    }
    public void view(double alas, double tinggi){
        super.view();
        System.out.println("Jenis Segitiga adalah Segitiga Sama sisi \nKeliling Segitiga adalah "+(alas+tinggi+sisimiring(alas, tinggi)));
    }}

class persegi extends bangundatar{
    protected double sisi;
    public persegi(){
        sisi = 0; 
    }
    public persegi (double s){
        sisi = s;
    }
    public double luas(double s){
        return (sisi*sisi);
    }
    public void view(){
        super.view();
        System.out.println("Luasnya adalah "+luas(sisi)+"cm^2 \nKeliling adalah "+(4*sisi));
    }
}
class lingkaran extends bangundatar{
    protected double jari;
    public lingkaran(){
        jari = 0;
    }
    public lingkaran (double jarii){
        jari = jarii;
    }
    public double luas(double jari){
        return (jari*jari*Math.PI);
    }
    public void view(){
        super.view();
        System.out.printf("Luas Lingkaran adalah "+luas(jari)+"\nkeliling lingkaran adalah "+"%.2f",(jari*2*Math.PI));
        System.out.println();
    }
}
    
