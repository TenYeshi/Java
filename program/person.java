public class person {
    String name,haircolor;
    int age, size;
    person(String n,int a,int s,String hc){name=n;haircolor=hc;age=a;size=s;}
    void walk(){System.out.println(name + " walked "+ size+ " miles");}
    void eat(){System.out.println(name + " eat "+ haircolor+ "noodle");}
    void speak(){ System.out.println(name + " can speak  "+age+ " languages");}

    public static void main(String[] args) {
        person p1 = new person("tenzin", 6, 12,"red");
        p1.eat();
        p1.walk();
        p1.speak();
    }
}
