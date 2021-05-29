package modul1lanjutan;
import java.util.Scanner;
public class Latihan03 {
    public static void main (String[] args) {
        Scanner masukan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Program Menjumlahkan 2 nilai");
        System.out.print("Masukan nilai a : ");
        a = masukan.nextInt();
        System.out.print("Masukan niali b : ");
        b = masukan.nextInt();
        System.out.print("Masukan nial  c : ");
        c = masukan.nextInt();
        System.out.println();
        System.out.println("Jumlah a + b : "+(jumlah(a,b)));
        System.out.println("Jumlah b + c : "+(jumlah(b,c)));
        System.out.println("jumlah a + c : "+(jumlah(a,c)));
    }
    //konstrukor
    private static int jumlah(int a, int b){
        int hasil = a + b;
        return hasil;
    }
}
