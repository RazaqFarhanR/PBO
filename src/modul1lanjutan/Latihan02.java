package modul1lanjutan;
import java.util.Scanner;
public class Latihan02 {
    public static void main (String[] args) {
    Scanner masukan = new Scanner(System.in);
    int pilihan=9;
    do { 
        System.out.println("\nMENU LUAS BANGUN\n");
        System.out.println("1. Menghitung Luas Persegi ");
        System.out.println("2. Menghitung Luas Persegi Panjang ");
        System.out.println("3. Keluar");
        System.out.print("Masukan Pilihan Anda : ");
        pilihan = masukan.nextInt();
    switch(pilihan){
        case 1 : luasPersegi();break;
        case 2 : luasPersegiPanjang();break;
    }
    }while(pilihan !=3);
    }
    private static void luasPersegi(){
        Scanner masukan = new Scanner(System.in);
        float sisi,luas;
        System.out.print("Masukan nilai sisi : ");
        sisi = masukan.nextFloat();
        luas = sisi * sisi;
        System.out.println("Luas Persegi adalah: "+luas);
    }
    private static void luasPersegiPanjang(){
        Scanner masukan = new Scanner(System.in);
        float panjang, lebar, luas;
        System.out.print("Masukan nilai Panjang : ");
        panjang = masukan.nextFloat();
        System.out.print("Masukan nilai lebar : ");
        lebar = masukan.nextInt();
        luas = panjang * lebar;
        System.out.println("Luas Persegi panjnagn adalah: "+luas);
    }
}
