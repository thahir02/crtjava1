//program using instance variables to read & display admissionno & name of student 
class Instance
{
    int admissionid;
    String name;
    void get(int x,String y)
    {
        admissionid=x;
        name=y;
    }
    void show()
    {
        System.out.println("admissionnumber="+admissionid+" name="+name);
    }
	public static void main(String[] args) {
	    Instance s1=new Instance();
	    Instance s2=new Instance();
	    s1.get(001,"mono");
	    s1.show();
	    // if value for vaiables a & are not get for s2
	    s2.show();//it shows a=0 b=null because values are not asinged
	    s2.get(002,"dono");
	    s2.show();
	}
}
