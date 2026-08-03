public class Main
{
	public static void main(String[] args) {
		int x=001,y=010,z=100;
		System.out.println(x+" "+y+" "+z);
		int res = --x + y++ - z-- - --z + ++y - --x + y-- - --x;
		System.out.printf(res+" "+x+" "+y+" "+z);
	}
}
