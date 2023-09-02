    class Rectangle{
    int length,width;
    void getDetails(int x,int y){
        length=x;
        width=y;
    }

     int area(){
        int a=length*width;
        return a;
     }
    }
public class classandobj {
    public static void main(String[] args) {
        Rectangle obj1=new Rectangle();
        obj1.length=10;
        obj1.width=20;
        System.out.println(obj1.area());
        Rectangle obj2=new Rectangle();
        obj2.getDetails(20,40);
        System.out.println(obj2.area());
    }
}
