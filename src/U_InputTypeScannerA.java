import java.io.IOException;
import java.util.Scanner;
public class U_InputTypeScannerA {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkaan nama : ");
        String name = input.nextLine();
        System.out.println("Masukkan umur : ");
        String age = input.nextLine();
        System.out.println("Masukkan tinggi badan : ");
        String height = input.nextLine();
        System.out.println("Sudah menikah (true/false) : ");
        String married = input.nextLine();
        System.out.println("Nama : " + name);
        System.out.println("Umur : " + Integer.parseInt(age));
        System.out.println("tinggi Badan : " +Double.parseDouble(height));
        System.out.println("Sudah Menikah : " +Boolean.parseBoolean(married));
    }

}
