class callofconstructor{
    int length,width;

    public  callofconstructor(){   //def constructor
        length=2;
        width=3;
    }
    public  callofconstructor(int x,int y){    //parameterized constructor
        length=x;
        width=y;
    }

    public callofconstructor(int x){           //constructor overloading
        length=width=x;
    }
    int add(){
        return length*width;
    }

}

public class constructor {
    public static void main(String[] args) {
    callofconstructor obj1=new callofconstructor();
        System.out.println(obj1.add());

        callofconstructor obj2=new callofconstructor(10,30);   ///parameterized constructor
        System.out.println(obj2.add());

        callofconstructor obj3=new callofconstructor(3);          ///constructor overloading
        System.out.println(obj1.add());

    }
}
