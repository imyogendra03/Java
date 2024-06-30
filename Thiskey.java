/**
 * Example
 */
class Example {
    private int x,y;
    void f1(int x,int y){
        this.x=x;    //this is refer to current object
        this.y=y;
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
};
class Thiskey {
  public static void main(String []args)
  {
    Example e1=new Example();
    e1.f1(3,4);
    e1.display();
  }    
}
