package Get_Set;

public class Get_Set {
    public static void main(String[] args) {
        PrivateInfor Sang = new PrivateInfor();
        Sang.setName("Nguyễn Văn Sáng");
        Sang.setSchoolOrCompany("Đại học Công nghiệp Tp.HCM");
        Sang.setTell(123456);
        Sang.setEmail("nvs@gmail.com");
        Sang.setCity("Ho Chi Minh city");

        System.out.println("//////Contact//////");
        System.out.println("Tên: " + Sang.getName());
        System.out.println("Trường học/công ty: " + Sang.getSchoolOrCompany());
        System.out.println("Số điện thoại: " + Sang.getTell());
        System.out.println("Email: " + Sang.getEmail());
        System.out.println("Địa chỉ: " + Sang.getCity());
    }
}
