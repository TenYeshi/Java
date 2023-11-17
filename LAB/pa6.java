public class pa6 {
    public static void main(String[] args) {
        student s1=new student("tenzin", 533);
        student s2=new student('d',0,58);
        student s3=new student("tenzin", 533,16);
    }
}

class student{
    student(String n,int id,int r ){System.out.println("ID : "+id+"\t Name : "+n+"\troom : "+r);}
    student(String n,int id){System.out.println("ID :"+id+"\tname :"+n);}
    student(char n,int id,int r ){System.out.println("ID :"+id+"\tname :"+n+"\troom :r");}
}