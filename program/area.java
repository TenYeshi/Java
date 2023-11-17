import java.util.Scanner;

public class area
{
    int a,b;
    void dimset(int c, int d){a=c;b=d;}
    int getarea(){return a*b;}

    public static void main(String[] args) {
        try (Scanner a = new Scanner(System.in)) {
            int x= a.nextInt();
            int y= a.nextInt();
            area t1=new area();
            t1.dimset(x, y);
            System.out.println("the area is : "+ t1.getarea());
        }

        
    }
}