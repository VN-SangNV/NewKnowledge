package While;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soTuNhien, soTuNhien2;
        int demSo = 1;

        System.out.println("Nhập số tự nhiên n: ");
        soTuNhien = scanner.nextInt();
        soTuNhien2 = soTuNhien;

        while (soTuNhien >= 10){
            demSo ++;
            soTuNhien /= 10;
        }

        System.out.println(soTuNhien2 + " có " + demSo + " chữ số!");
    }
}
