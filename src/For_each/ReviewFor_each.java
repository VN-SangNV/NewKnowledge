package For_each;

import Array.Array;

public class ReviewFor_each {
    public static void main(String[] args) {
        int number[] = {152, 345, 587, 951, 154, 159};
        String name[] = {"Sáng", "Nam", "Quốc", "Sơn", "Hà"};
        for(int index: number){
            System.out.println(index);
        }
        System.out.println("//////For - each/////");

        for(String ten: name){
            System.out.println(ten);
        }
    }
}
