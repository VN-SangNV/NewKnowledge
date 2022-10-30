package ScreenScanner;

import java.util.Scanner;

public class ScreenScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name[] = new String[5];
        int number[] = new int[5];

        for(int i = 0; i < name.length; i++) {
            System.out.print("Nhập tên thứ " + (i + 1) + ": ");
            name[i] = scanner.nextLine();
        }
        for(int x = 0; x < number.length; x++){
            System.out.print("Nhập số thứ " + (x+1) + ": ");
            number[x] = scanner.nextInt();
        }
        System.out.println("//////Contact//////");
        int j = 0;
        do{
            System.out.println(name[j] + ": " + number[j]);
            j++;
        } while (j < name.length);
    }
}
