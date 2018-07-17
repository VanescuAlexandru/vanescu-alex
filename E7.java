package exCap1;


//Turn the Incrementable code fragments into a working program.

class StaticTest {
	static int i = 47;
}

class Incrementable {
static void increment() { StaticTest.i++; }
}

public class E7 {

	public static void main(String[] args) {
		//StaticTest a = new StaticTest();
		Incrementable.increment();
		System.out.println(StaticTest.i);

	}

}
