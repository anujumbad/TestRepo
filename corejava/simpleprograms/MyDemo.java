package corejava.simpleprograms;

public class MyDemo {
    public void addition()
    {
        int a=5;
        int b=4;
        int d=2;
        int c;
        c=a*b*d;
        System.out.println("Multiplication  is "+c);
    }

    public static void main(String[] args)
    {
        MyDemo mydemo=new MyDemo();
        mydemo.addition();
    }
}
