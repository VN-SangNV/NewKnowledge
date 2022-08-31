package Array2D;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Khởi tạo mảng
        int[][] number = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for(int i = 0; i < number.length; i++){
            for(int j = 0; j < number[0].length; j++){
                System.out.print(number[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println("----------------");
//Cấp phát cho mảng
        String[][] nameList = new String[3][3];
        for(int a = 0; a < nameList.length; a++){
            for(int b = 0; b < nameList[0].length; b++){
                System.out.println("Nhập nameList[" + (a+1) + "][" + (b+1) + "]: ");
                nameList[a][b] = scanner.nextLine();
            }
        }
        for(int c = 0; c < nameList.length; c++){
            for(int d = 0; d < nameList[0].length; d++){
                System.out.print(nameList[c][d] + " ");
            }
            System.out.println(" ");
        }

    }
}
