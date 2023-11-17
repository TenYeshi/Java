
class Student {
    String name; int roll;
    static int count=0;
    public Student(String n, int r){ name=n; roll=r; count++;}
    public void show(){
        System.out.println("Name :"+name);
        System.out.println("roll no :"+roll);
    }
}


class classroom {
    Student s[]=new Student[3];
    public classroom(){
       
    }
    

    

    public void showdetail(){
        for(int i=0; i<3;i++){s[i].show();}
    }
    
}

public class test {

    public static void main(String[] args) {
        
        classroom r1 =new classroom();
        r1.showdetail();
    }
    
}