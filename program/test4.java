public class test4 {
    public static void main(String[] args) {
        int base = 2, power =4,re=1;
        System.out.println("base "+2 +" power " + power + " is "+Math.pow(base, power));
        
        for(int i = 0; i < power; i++)
        {
            re *= base; 
        }
        System.out.println("base "+2 +" power " + power + " is " +re);
    }
}
