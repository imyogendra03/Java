class Nokia
{
    private int mic;
    private int cam;
    void setValue()     //instance member function          method:- Block of code=function
    {
        mic=2;         //instance member variable
        cam=40;
    }
    void display()      //instance member function or non static member function
    {
        System.out.println(mic);
        System.out.println(cam);
    }
}
class ClassesAndObjects 
{
        public static void main(String []args)        //static member variable
    {
        Nokia n1=new Nokia();
        n1.setValue();
        n1.display();
        n1.display();
    }
    
}
