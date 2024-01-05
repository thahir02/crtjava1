//program using  Hierachicalinheritance a super class can have more than one sub class 
class Data
{
    int a,b;
    void get(int a,int b)
    {
      this.a=a;
      this.b=b;
    }
    void show()
    {
        System.out.println("a="+a+"\nb="+b);
    }
    
}
class Add extends Data
{
   
    void total()
    {
        System.out.println("addition="+(a+b));
    }
}
class Multi extends Data
{
    void produt()
    {
      System.out.println("mulitiplication="+(a*b));
    }
}
class Hierachicalinheritance
{
     public static void main (String[] args) 
    {
        Add s2=new Add();
        s2.get(1,10);
        s2.show();
        s2.total();
        Multi s3=new Multi();
        s3.get(2,3);
        s3.show();
        s3.produt();
    }
}