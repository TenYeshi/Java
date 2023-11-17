
public class If {
    public static void main(String[] args) {

        int a = 4;
        if(a==4)
        {
            a++;
            System.out.println("a = "+a);
        }


        int i = 20;
         if (i<15) System.out.println("i is smaller than 15 ");
         else System.out.println("i is greater than 15 ");
         System.out.println("outside if else block ");

         int day=5;
         String daystring;

         switch (day)
         {
            case 1: daystring = " monday "; break;
            case 2: daystring = " tuesday "; break;
            case 3: daystring = " wednesday"; break;
            case 4: daystring = " thursday "; break;
            case 5: daystring = " friday "; break;
            case 6: daystring = " satday "; break;
            case 7: daystring = " sunday "; break;
            default : daystring =  " invaild";
         }

         System.out.println("today is "  +daystring);
    }
    
}