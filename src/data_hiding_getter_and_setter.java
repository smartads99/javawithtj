
class Rectangle2{
     private int length,width;
    //getter method for length
    int getLength(){
        return length;
    }

    //setter method for length
    void setLength(int x){
        if(0<x){      //also use to check the val
         length=x;
        }
    }
    //getter for width
    int getWidth(){
        return width;
    }
    void setWidth(int x){
        if(0<x){
            width=x;
        }
    }

    int add(){
        return length*width;
    }


}


public class data_hiding_getter_and_setter {
    public static void main(String[] args) {
     Rectangle2 obj=new Rectangle2();
     obj.setLength(20);
     obj.setWidth(30);                               //setter method
        System.out.println(obj.add());
        System.out.println(obj.getLength());
        System.out.println(obj.getWidth());          //getter method
    }
}
