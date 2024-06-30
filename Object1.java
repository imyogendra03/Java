class Mahesh 
{
    int x;       // instance (object) member variable
    int y;       // instance(object) member variable
    void fun1()         //instance(Object) member function
    {
        System.out.println("fun1");
    }
    void fun2()         //instance(Object) member function
    {
        System.out.println("fun2");
    }
}

class Object1 {
    public static void main(String[] args) 
    {
        Mahesh m1=new Mahesh();
        m1.x=5;
        m1.y=4;
       // int z=m1.x+m1.y;
        System.out.println(m1.x);
        System.out.println(m1.y);
        //System.out.println("Sum of x & y is :",z);      //some wrong
     }
    
}
