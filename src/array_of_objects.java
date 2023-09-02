import java.util.Scanner;

class Student{
    int roll_no;
    String name;
    Student(int roll,String name){
        this.roll_no=roll;
        this.name=name;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll NO: "+roll_no);
        System.out.println("=========================");
    }
}

public class array_of_objects {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//        Student[] arr=new Student[5];
//        arr[0]=new Student(10,"boobesh");
//        arr[1]=new Student(12,"test1");
//        arr[2]=new Student(14,"test2");
//        arr[3]=new Student(16,"test3");
//        arr[4]=new Student(18,"test4");
        System.out.print("Enter the total number of student :");
        int n= in.nextInt();
        Student[] arr=new Student[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the Student "+(i+1)+" Roll no :");  // input with for loop
            int tempnum= in.nextInt();
            System.out.print("Enter the Student "+(i+1)+" name :");
            String tempname=in.next();
            arr[i]=new Student(tempnum,tempname);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i].display();
        }
    }
}
