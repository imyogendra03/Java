class Nokia1{
    int x,y;
    Nokia1(){
        System.out.println("Parent's constructor executed.");
    }
    void f1()
    {
    System.out.println("Parent function 1 Executed.");
    }
    void f2()
    {
        System.out.println("Parent function 2 Executed.");
    }
}
class Nokia2 extends Nokia1{
    int z;
    void f3(){
        System.out.println("Child function 1 executed.");
    }
    Nokia2()
    {
        super();
        System.out.println("Child's constructor executed.");
    }
}
public class Inherit {
    public static void main(String []args){
        new Nokia2();
        new Nokia1();
    }
}
