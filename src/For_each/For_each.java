package For_each;

public class For_each {
    public static void main(String[] args) {
//Mảng 1 chiều
        int[] numbers = {123, 456, 789, 245, 468};
        for(int number: numbers){
            System.out.println(number);
            number++;
        }
        System.out.println("------");

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println("------");

        int sum = 0;
        for(int number2: numbers){
            sum += number2;
        }
        System.out.println(sum);
        System.out.println("-------------");

        int[][] number3 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for(int num[]: number3){
            for(int num2: num){
                System.out.print(num2+1 + " ");
            }
            System.out.println(" ");
        }
    }
}
