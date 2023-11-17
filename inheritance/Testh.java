public class Testh {
    public static void main(String[] args) {
        BB b1 =new BB();
        b1.show();
    }
}
class AA {
    void show(){System.out.println("this is class AA and parant class");}
}
class BB extends AA{
    
    void show(){System.out.println("this is class BB and sub class");super.show();}
}