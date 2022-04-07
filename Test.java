class Test1{
		static int max=10;
		int min=5;
}
public class Test{
	private static int max;

	public static void main(String args[]) {
		Test1 obj=new Test1();
		System.out.println("min+1="+(obj.min+1));
		System.out.println("max+1="+(Test1.max+1));
	}
}
