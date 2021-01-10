public class student extends  user{
    private int sno;
    private String name;
    private  int phone;

    public student(String name, int phone) {
        this.name = name;
        this.phone = phone;
    }


    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {


        this.sno = sno;
    }

    public String  getName() {
        return name;
    }

    public void setName(String  name) {
        this.name = name;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }
}
