class complex{
    int real,img;
    complex(){
        this.real=3;
        this.img=5;
    }
    complex(int x,int y){
        this.real=x;
        this.img=y;
    }
    complex(complex x){        //copy of the obj
        this.real=x.real;
        this.img=x.img;
    }
    public  String toString(){
        return "("+real+"+"+img+"i)";        //we to print the output like this (5+6i) so we toString()
    }


}
public class copy_constructor {
    public static void main(String[] args){

        complex o=new complex();
        System.out.println(o);

        complex o1=new complex(5,8);
        System.out.println(o1);

        complex o2=new complex(o1);
        System.out.println(o2);
    }
}
