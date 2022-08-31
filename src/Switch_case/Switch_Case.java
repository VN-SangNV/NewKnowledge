package Switch_case;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        int luaChon, tong, hieu, tich, thuong, x, y;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu\n1. Tính tổng 2 số nguyên\n2. Tính hiệu 2 số nguyên");
        System.out.println("3. Tính tích 2 số nguyên\n4. Chia nguyên 2 số nguyên\nNhập lựa chọn: ");

        luaChon = scanner.nextInt();

        switch (luaChon){
            case 1: {
                System.out.println("Nhập  x, y: ");
                x = scanner.nextInt();
                y = scanner.nextInt();
                System.out.println(x + " + " + y + " = " + (x+y));
                break;
            }
            case 2: {
                System.out.println("Nhập  x, y: ");
                x = scanner.nextInt();
                y = scanner.nextInt();
                System.out.println(x + " - " + y + " = " + (x-y));
                break;
            }
            case 3: {
                System.out.println("Nhập  x, y: ");
                x = scanner.nextInt();
                y = scanner.nextInt();
                System.out.println(x + " * " + y + " = " + x*y);
                break;
            }
            case 4: {
                System.out.println("Nhập  x, y: ");
                x = scanner.nextInt();
                y = scanner.nextInt();
                System.out.println(x + " / " + y + " = " + x/y);
                break;
            }
            default: {
                System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
}
