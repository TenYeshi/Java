
class stud
{
    String name; int roll;
    public stud(String me, int R)
    {name = me ; roll=R;}
    void show(){System.out.println("name : " + name + " roll no : " +roll );}

    public static void main(String[] args) {
        stud s1=new stud("tenzin" , 12);
        s1.show();
        
    }
}