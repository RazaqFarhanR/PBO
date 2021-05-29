package modul1lanjutan;
import java.util.Scanner;
public class Latihan04 {
    public static void main (String[] args) {
        Scanner masukan = new Scanner(System.in);
        int bil, hasil;
        System.out.print("Masukan suatu bilangan : ");
        bil = masukan.nextInt();
        hasil = faktorial(bil);
        System.out.println("Nilai faktorial "+ bil +" adalah "+ hasil);
    }
    private static int faktorial(int a){
        if (a==1)
            return 1;
        else
            return (a*faktorial(a-1));
        }
}
