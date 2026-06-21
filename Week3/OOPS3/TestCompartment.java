import java.util.*;
abstract class Compartment{
    public abstract String notice();
}
class FirstClass extends Compartment{
    @Override
    public String notice(){
        return "First Class - Expensive";
    }
}
class Ladies extends Compartment{
    @Override
    public String notice(){
        return "Reserved for ladies";
    }
}
class General extends Compartment{
    @Override
    public String notice(){
        return "Anyone can Travel";
    }
}
class Luggage extends Compartment{
    @Override
    public String notice(){
        return "Luggages are stored here";
    }
}
public class TestCompartment{
    public static void main(String[] args) {
        Compartment arr[]=new Compartment[10];
        Random r=new Random();
        for(int i = 0; i < 10; i++) {
           int n=r.nextInt(4);
           if(n==0){
            arr[i]=new FirstClass();
           } 
           else if(n==1){
            arr[i]=new Ladies();
           }
           else if(n==2){
            arr[i]=new General();
           }
           else{
            arr[i]=new Luggage();
           }
        }
        for (int i = 0; i < 10; i++) {
           System.out.println(arr[i].notice());
        }

    }
}




