class Mahesh {
    int x;     //instance (object) member variable
    int y;     //instance (object) member variable
    void fun1()   //instance member function or method
    {
        System.out.println("fun1");
    }
    void fun2()   //instance member method   or not static method
    {
        System.out.println("fun2");
    }
}

/**
 * InnerMahesh
 */
class Object1 {
    public static void main(String[] args) {
        Mahesh m1=new Mahesh();
        Mahesh m2=new Mahesh();
        m1.x=5;
        m2.x=51;
        System.out.println(m1.x);
    }

    
}