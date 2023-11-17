public class inter {
    public static void main(String[] args) {
        area a1=new rectangle();
        System.out.println(a1.compute(3.4f, 3.5f));

        a1=new circle();
        System.out.println(a1.compute(3, 3));
    }
}

interface area{
    final static float pi=3.14f;
    float compute(float x, float y);
}

class rectangle implements area{public float compute (float x,float y){return (x*y);}}
class circle implements area{public float compute (float x,float y){
    if(x==y) return pi*x*y;
    else return 0.0f;
}}
