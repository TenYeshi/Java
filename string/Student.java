
public class Student
{
  string name,sex,color,haircolor;
  int age;

  public Student (string n, int a, string s, string c, string hc)
  {
    name=n;sex=s;color=c;haircolor=hc;age=a;
  }

  public Student(String string, int a, String string2, String string3, String string4) {
}

public void run(){System.out.println(name + " run faster ");}
  public void Sex(){System.out.println(name + " is " + sex + " and his age is " + age);}
  public void Color(){System.out.println(name + " is " + color + " skin color and hair color is " + haircolor);}

  public static void main(String[] args) {
    Student t1 = new Student ("tenzin",25,"male","brown","yellow");
    t1.run();
    t1.Sex();
    t1.Color();
  }
}