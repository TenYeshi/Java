public class ab {
    public static void main(String[] args){
       bird b1 = new bird();
       System.out.println(b1.eat());
       dog d1 =new dog();
       System.out.println(d1.eat());
       
       animal bird = new animal(){public String eat(){return "grains";}};
       System.out.println(bird.eat());

       animal dog = new animal(){public String eat(){return "meat and bread";}};
       System.out.println(dog.eat());

       animal ani = new bird();
       System.out.println(ani.eat());

       ani = new dog();
       System.out.println(ani.eat());

    }
}

abstract class animal{
    abstract public String eat();
}

class bird extends animal{
    public String eat(){
        return "Insect";
    }
}

class dog extends animal{
    public String eat(){
        return "cat";
    }
}
