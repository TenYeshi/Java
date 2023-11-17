class A{
    int a =10;
    String an="class A";
    A(){System.out.println("From  Class A constructor ");}
    void show(){System.out.println("from show method : " +a);}
    public String  toString(){
        return "a= "+a+"   class  "+an;
    }

}

/* multi level from A to B and B to C */
class B extends A {
    int t=11;
    B(){}
    void de(){System.out.println("de of class b "+a);}
}

class C extends B{
    C(){System.out.println("class C is multi level ");}
}
/*hierarchical from D and E to A */
class D extends A {
    int e=10;
    D(){System.out.println("class D's constructer ");}
    void dt(){System.out.println("value of class D : "+e);}
}

class E extends A{
    int aa=13;
    E(){System.out.println("class E's constructer ");}
    void dt(){System.out.println("value of class E : "+aa);}
}



public class her {
    public static void main(String[] args) {
        C c1 =new C();
        System.out.println(c1);
    }
}
