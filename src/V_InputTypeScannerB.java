import java.io.IOException;
import java.util.Scanner;

public class V_InputTypeScannerB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nama : ");
        String name = input.nextLine();
        System.out.println("Masukkan umur : ");
        int age = input.nextInt();
        System.out.println("Masukkan tinggi badan : ");
        double height = input.nextDouble();
        System.out.println("Sudah menikah (true/false) : ");
        boolean married = input.nextBoolean();
        System.out.println("Nama : " + name);
        System.out.println("Umur : "+age);
        System.out.println("Tinggi Badan : "+height);
        System.out.println("Sudah Menikah : "+married);
    }
}
