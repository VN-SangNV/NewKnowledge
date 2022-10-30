package PhuongThucKhoiTao;

public class Student {
    private int id;
    private String name;
    private int tell;
    private String email;
    private String address;

    public Student(String name, String email){
        this.name  = name;
        this.email = email;
    }
    public Student(int id, String name, int tell, String email, String address){
        this(name, email);
        this.id = id;
        this.tell = tell;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTell() {
        return tell;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }
}
