package exCap1;


//Write a program that demonstrates that, no matter how many objects
//you create of a particular class, there is only one instance of a particular static field in that
//class.
class Value{
	static int i = 10;
}

public class E8 {

	public static void main(String[] args) {
		
	Value st1 = new Value();
	Value st2 = new Value();
	Value st3 = new Value();
	Value st4 = new Value();
	
	System.out.format("%d %d %d %d ", st1.i,st2.i, st3.i, st4.i);
	System.out.format("%d %d %d %d ", Value.i,Value.i, Value.i, Value.i);

	}

}
