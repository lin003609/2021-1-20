public class text {
    public static void main(String[] args){
        student stu=new student("张三",12345);
        stu.setSno(1234567);
        stu.setId("zane");
        stu.setPass(2345);

        student stu1=new student("李四",3333);
        stu1.setSno(45678);
        stu1.setId("zane33");
        stu1.setPass(2345433);
        System.out.println(stu.getName());
        System.out.println(stu.getPhone());
        System.out.println(stu.getSno());
        System.out.println(stu.getId());
        System.out.println(stu.getPass());

        System.out.println("----------");
        System.out.println(stu1.getName());
        System.out.println(stu1.getPhone());
        System.out.println(stu1.getSno());
        System.out.println(stu1.getId());
        System.out.println(stu1.getPass());
    }
}
