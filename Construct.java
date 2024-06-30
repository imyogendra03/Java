class Demo{
    int x,y;
    Demo(int p,int q){
        x=p;
        y=q;
    }
    Demo(int f)
    {}
    Demo()
    {}}
public class Construct{
    public static void main(String []args)
    {
         new Demo(5,6);
         new Demo();
         new Demo(6);
    }
}
