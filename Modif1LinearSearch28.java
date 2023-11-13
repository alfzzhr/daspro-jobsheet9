import java.util.Scanner;

public class Modif1LinearSearch28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int elemen = sc.nextInt();
        int[] arrayInt = new int[elemen];
        int hasil = -1;

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("Masukkan elemen array ke-" + (i + 1) + " : ");
            arrayInt[i] = sc.nextInt();
        }
        System.out.print("Masukan key yang ingin dicar: ");
        int key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                break;
            }
        }
            if (hasil != -1) {
                System.out.println("Key ada di posisi indeks ke-" + hasil);
            }
    }
}