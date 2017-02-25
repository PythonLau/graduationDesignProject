/**
 * Created by Administrator on 2017/2/24 0024.
 */
//This is a test
class Poppet{
    private int i;
    Poppet(int ii){
        i = ii;
    }
}
public class test {
    public final int i = 0;
    private final int j;
    private final Poppet p;
    public test(){
        j = 1;
        p = new Poppet(1);
    }
    public test(int x){
        j = x;
        p = new Poppet(x);
    }
    public static void main(String[] args){
        test a = new test();
        test b = new test(47);
        System.out.println(a.i);
        System.out.println(a.j);
        System.out.println(b.i);
        System.out.println(b.j);
    }
}
