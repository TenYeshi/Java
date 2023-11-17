
public class in_ex {
    public static void main(String[] args) {
        child c1 = new child();
        c1.eat();
        c1.move();
    }
    
}

interface parent1{
    public void move();
}


interface parent2 extends  parent1{
    public void eat();
}

class child implements parent2{
    public void move(){System.out.println("food");}
    public void eat(){System.out.println("walk");}
}