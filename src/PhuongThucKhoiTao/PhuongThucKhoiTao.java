package PhuongThucKhoiTao;

public class PhuongThucKhoiTao {
    public static void main(String[] args) {
        Student Sang = new Student(21029961, "Nguyễn Văn Sáng", 456789675, "nvs@gmail.com", "Ho Chi Minh city");

        System.out.println("ID: " + Sang.getId());
        System.out.println("Name: " + Sang.getName());
        System.out.println("Phone number: " + Sang.getTell());
        System.out.println("Emai: " + Sang.getEmail());
        System.out.println("Address: " + Sang.getAddress());
    }
}
