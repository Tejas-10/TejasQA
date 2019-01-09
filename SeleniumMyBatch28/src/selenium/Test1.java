package selenium;
public class Test1 {

	public static void main(String[] args) 	{
		Test1 t1 = new Test1();
		Test2 t2 = new Test2();
		Test3 t3 = new Test3();
		System.out.println("hello");
		printMe();
		System.out.println("After printMe");
		t1.scanMe();
		System.out.println(t1.sum());
		int b = t1.sum();
		System.out.println(b);
		int p = t1.sum(6, 7);
		System.out.println(p);
		int q = t1.sum(8, 9);
		System.out.println(q);
		t2.testing2();
		Test2.testing1();
		Test3.testing3();
		t3.testing4();
	}
public static void printMe(){
	System.out.println("I am in printMe method");
}

public void scanMe(){
	System.out.println("I am in scanMe");
}
public int sum(){
	int a = 4+5;
	return a;
}
public int sum(int x, int y){
	int z = x+y;
	return z;
}
}
