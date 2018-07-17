package exCap1;

//Write a program that demonstrates that autoboxing works for all the
//primitive types and their wrappers.

public class E9 {

	public static void main(String[] args) {
		int i = 10;
		Integer I;
		I = i;
		System.out.println(I);

		boolean b = true;
		Boolean B;
		B = b;
		System.out.println(B);

		char ch = 'D';
		Character Ch;
		Ch = ch;
		System.out.println(Ch);

		byte by = 2;
		Byte By;
		By = by;
		System.out.println(By);

		short sh = 2;
		Short Sh;
		Sh = sh;
		System.out.println(Sh);

		long l = 12;
		Long L;
		L = l;
		System.out.println(L);

		float f = (float) 0.8;
		Float F;
		F = f;
		System.out.println(F);

		double d = 0.45;
		Double D;
		D = d;
		System.out.println(D);

	}

}
