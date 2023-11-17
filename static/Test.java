


public class Test{
    public static void main(String[] args) {
        Student s1=new Student(111, "karan");
        Student s2= new Student(222, "aryan");
        s1.dis();
        Student.college="DILHE";
        s2.dis();
        s1.dis();
        System.out.println(Student.couter);
        
    }
}
class Student {

    int roll;
    String name;
    static String college = "IITS";
    static int couter =0;
    Student(int r, String n){ roll = r; name = n; couter++; }

    void dis(){System.out.println(roll+" "+name+ " "+college);}
}
