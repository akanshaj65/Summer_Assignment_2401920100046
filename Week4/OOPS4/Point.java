public class Point {
    private int x,y;
     public Point(){
        x=0;
        y=0;
     }
     public Point(int x,int y){
        this.x=x;
        this.y=y;
     }
     public void setX(int x){
        this.x=x;
     }
     public void setY(int y){
        this.y=y;
     }
     public void setXY(int x,int y){
        this.x=x;
        this.y=y;
     }
     public void display(){
        System.out.println("Point:" + x + "," +y);
     }
     public static void main(String[] args) {
        Point p=new Point();
        Point p1=new Point(10,20);
        p1.display();
        p.setX(10);
        p.display();
        p.setXY(45,50 );
        p.display();

     }
}
