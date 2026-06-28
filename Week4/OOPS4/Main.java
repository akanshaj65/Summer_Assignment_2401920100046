class Outer{
    void display(){
        System.out.println("In outer class");
    }
    class Inner{
         void display(){
            System.out.println("In inner class");
        }
    }
}
public class Main {
    public static void main(String[] args) {
    Outer obj = new Outer();
    obj.display();

    Outer.Inner obj2 = obj.new Inner();
    obj2.display();
    }
}
