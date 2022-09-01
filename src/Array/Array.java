package Array;

import Methods.Methods;

public class Array {
    public static void main(String[] args) {
        int[] phoneNumber = {123, 145, 167, 178, 210, 220, 239};
        String[] name = {"An", "Lan", "Mai", "Hoa", "Minh", "Hoàng", "Hương"};

        System.out.println("Contact");
        for(int i = 0; i < name.length; i++){
            System.out.println(name[i] + ": " + phoneNumber[6 - i]);
        }

        int max = Methods.findMax(phoneNumber);
        System.out.println("Max = " + max);

        Methods.hello();

//        int[] contactNumber = new int[100];
//        String[] contactName = new String[100];
//
//        for(int i = 0; i < contactNumber.length; i++){
//            System.out.println(contactName[i] + ": " + contactNumber[i]);
//        }
    }
}
