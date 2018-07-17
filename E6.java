package exCap1;

//Write a program that includes and calls the storage( ) method defined
//as a code fragment in this chapter.

public class E6 {
	
	int storage(String s) {
		return s.length() * 2;
		}

	public static void main(String[] args) {
		String s = "dsadsa";
		E6 storage = new E6();
		System.out.println(storage.storage(s));
		
	}

}
