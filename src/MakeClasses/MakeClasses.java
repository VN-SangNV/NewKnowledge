package MakeClasses;

public class MakeClasses {
    public static void main(String[] args) {
        Contact Sang = new Contact();
        Sang.name = "Nguyễn Văn Sáng";
        Sang.phoneNumber = 1236457;
        Sang.email = "nvs@gmail.com";
        Sang.schoolOrCompany = "IUH";

        System.out.println(Sang.name);
        Sang.call();

    }
}
