class Box {
    int len;
    int br;
    Box(int len, int br) {
        this.len = len;
        this.br = br;
    }
    int area() {
        return len * br;
    }
}
class Box3D extends Box {
    int ht;
    Box3D(int len, int br, int ht) {
        super(len, br);
        this.ht = ht;
    }
    int volume() {
        return len*br*ht;
    }
}
public class BoxArea {
    public static void main(String[] args) {
        Box b = new Box(5, 4);
        System.out.println("Area" + b.area());
        Box3D b3 = new Box3D(5, 4, 3);
        System.out.println("Volume" + b3.volume());
    }
}
