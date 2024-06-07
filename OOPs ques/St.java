

public class St {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Harpreet";
        s.roll_no = 13;
        System.out.println("Name : " + s.name+ " "+ "Roll no: "+ s.roll_no);
    }
}


class Student{
    String name;
    int roll_no;


}