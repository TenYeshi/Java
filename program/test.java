public class test 
{
    public static void main(String[] args)
     {
        int a= 34,b=23,big;

        if(a>b) big=a;
        else big =b ; 
        System.out.println(big); 


        int c=3,d=24,e=12,bigs;
        if(c>d)
            if(c>e) bigs = c;
            else bigs =e;
        else if (d>e) bigs=d;
        else bigs = e; 
        System.out.println(bigs);

        int j= 12;
        if (j%2==0) System.out.println(j + " is even ");
        else System.out.println(j + " is odd ");
    }
}


