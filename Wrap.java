class Wrap {
    public static void main(String[] argv)
    {
        int x=Integer.parseInt("123");
        System.out.println(x);

        Integer i1=Integer.valueOf("10011",2);
        int z=i1.intValue();
        System.out.println(z);


        Double x1=Double.valueOf("56");
        double y=x1.doubleValue();
        System.out.println(y);
    }     
}
