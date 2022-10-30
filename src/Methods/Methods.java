package Methods;

public class Methods {
    public static void main(String[] args) {
        int[] numbers = {123, 145, 167, 178, 210, 220, 239};
        int sum = sum(numbers);
        System.out.println("Sum = " + sum);

        float average = average(numbers);
        System.out.println("Average = " + average);

        int max = findMax(numbers);
        System.out.println("Max = " + max);

        addMulti(numbers);
        addMulti(12, 123, 234, 456);
    }

//    public static String contact(String[] name, int[] number){
//        String[] contact;
//        for(int j = 0; j < name.length; j++){
//            contact = name[j] + ": ";
//        }
//        return contact;
//    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for(int i: arr){
            max = Math.max(max, i);
        }
        return max;
    }
    public static int sum(int[] arr){
        int sum = 0;
        for(int i:arr){
            sum += i;
        }
        return sum;
    }
    public static float average(int[] arr){
        int sum = 0;
        int dem = 0;
        float average = 0f;

        for(int i: arr){
            sum += i;
            dem++;
        }
        average = (float)sum/dem;
        return average;
    }
    public static void hello(){
        System.out.println("Xin chào! Đây là phương thức từ class Methods!");
    }
    public static void addMulti(int...array){
        int sum = 0;
        for(int arr: array){
            sum += arr;
        }
        System.out.println("MultiSum = " + sum);
    }

    public static int sumInt(int...number){
        int sum = 0;
        for(int num: number){
            sum += num;
        }
        return sum;
    }
}
