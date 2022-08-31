package String_Chuoi;

import java.util.Scanner;

public class String_Chuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str;

        System.out.println("Nhập chuỗi: ");
        str = scanner.nextLine();

        System.out.println("Chuỗi đã nhập là: " + str);
        System.out.println("Chiều dài của String là: " + str.length());
        System.out.println("Chuỗi viết hoa là: " + str.toUpperCase());
        System.out.println("Chuối viết thường là: " + str.toLowerCase());

        System.out.println(" ");

        for(int i = 0; i < str.length(); i++){
            System.out.println("Kí tự tại vị trí " + i + " là: " + str.charAt(i));
        }

        String chuoi2;
        System.out.println("Nhập chuỗi 2: ");
        chuoi2 = scanner.nextLine();

        String sum = str + chuoi2;
        System.out.println("Chuỗi sau khi cộng là: " + sum);

    }
}
