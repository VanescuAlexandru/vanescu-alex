package exCap1;

//Turn the DataOnly code fragments into a program that compiles and
//runs.
//Modify the previous exercise so that the values of the data in DataOnly
//are assigned to and printed in main( ).

public class DataOnly {
	int i=5;
	double d = 2.3;
	boolean b = true;


	public static void main(String[] args) {
		DataOnly data = new DataOnly();
			System.out.println(data.i);
			System.out.println(data.d);
			System.out.println(data.b);
	}

}
