import java.util.Scanner;

public class Tugas28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah banyaknya nilai yang akan di input: ");
        int elemen = sc.nextInt();
        int[] arrayInt = new int[elemen];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen nilai ke-" + (i + 1) + " : ");
            arrayInt[i] = sc.nextInt();
        }
        int nilaiTertinggi = Integer.MIN_VALUE;
        int nilaiTerendah = Integer.MAX_VALUE;
        int jumlah = 0;
        int banyakElemen = arrayInt.length;

        for (int nilai : arrayInt) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
            jumlah += nilai;
        }
        double rataRata = (double) jumlah / banyakElemen;
        System.out.println("Nilai tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai terendah: " + nilaiTerendah);
        System.out.println("Rata-rata: " + rataRata);
    }
}