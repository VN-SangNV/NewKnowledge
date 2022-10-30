package Get_Set;

public class PrivateInfor {
    private String name;
    private String schoolOrCompany;
    private int tell;
    private String email;
    private String city;

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSchoolOrCompany(String schoolOrCompany) {
        this.schoolOrCompany = schoolOrCompany;
    }

    public String getSchoolOrCompany() {
        return schoolOrCompany;
    }
    public void setTell(int tell){
        this.tell = tell;
    }
    public int getTell(){
        return tell;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getCity(){
        return city;
    }
}
