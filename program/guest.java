public class guest{
    String name,address;
    int id,phone,room;
    guest(String n, int i, int p, String a, int r ){name=n;address=a;id=i;phone=p;room=r;}

    void check_in()
    {
        System.out.println("name : " + name);
        System.out.println("room no : " +room);
        System.out.println("phone no : " + phone);
    }
    void check_out()
    {
        System.out.println("name : " + name);
        System.out.println("room no : " +room);
        System.out.println("phone no : " + phone);
        System.out.println("address : " + address);
    }
    void bill(){ System.out.println(name + " paid the bill ");}
    void order(){System.out.println(name + " order ramen noodle");}
    void feedback(){System.out.println(name +"'s feedback : very good and ramen cooked well");}

    public static void main(String[] args) {
        guest g1=new guest("tenzin", 12, 556, "bangaluru", 102);
        g1.check_in();
        g1.check_out();
        g1.bill();
        g1.order();
        g1.feedback();
        
    }
}