public class inter {
    public static void main(String[] args) {
        parent1 p1=new parent1(){
            public void move(){
                System.out.println("hello");
            }
        };

        p1.move();
    }
}

interface parent1{
    public void move();
}

interface parent2{
    public void eat();
}




class child implements parent1 ,parent2{
    public void move(){System.out.println("food");}
    public void eat(){System.out.println("walk");}
}