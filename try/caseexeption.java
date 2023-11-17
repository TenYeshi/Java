class caseexeption {
    public static void main(String[] args) {
        /*
        int a=10,b=5,c=5;
        try{
            int x=a/(b-c);
            System.out.println("value of x = "+x);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        int y=a/(c+b);
        System.out.println("value of y = "+y);
        */

        int invalid=0,number,count=0;
        for(int i=0; i<args.length;i++)
        {
            try{ number = Integer.parseInt(args[i]);}
            catch(NumberFormatException e){
                invalid++;
                System.out.println("invalid number = "+ e);
                continue;
            }
            count++;
        }
        System.out.println("valid number = "+count);
        System.out.println("invalid number = "+invalid);
    }
}