public class widening
{
    public static void main(String[] args)
    {
        int x = 7;
        long y = x;
        float z = y;
        System.out.println("before conversion, int value " +x);
        System.out.println("after conversion, long value " +y);
        System.out.println("after conversion, float value " +z);
    }
}