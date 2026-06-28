interface Test{
    int square(int n);
}
class Arithmetic implements Test{
    @Override
    public int square(int n){
        return n*n;
    }
}
public class ToTestInt{
    public static void main(String[] args) {
        Arithmetic ob=new Arithmetic();
        int n=6;
        System.out.println(ob.square(n));
    }
}
