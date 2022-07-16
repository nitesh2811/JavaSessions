package JavaBasics;
/**
 * 
 * @author Nitesh Agrawal
 *
 */

public class DataTypes {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Data types:
		// strict type:
		// 1.Primitive data types:
		// Boolean
		// Numeric type:
		// Character type:char
		// Integeral Value:
		// a: Integer:byte,short,int,long
		// b: Floating-point:float,double
		// 2.Non primitive data types:String, Arrays, Class, Interface

		// 1.byte:
		// range:-128 to 127
		// size:1 byte=8 bits
		byte b = 10;
		b = 30;
		byte b1 = 20;
		System.out.println(b);
		System.out.println(b + b1);
		byte seats = 4;

		// 2.short:
		// range:-32768 to 32767
		// size: 2 bytes= 16 bits
		short s = 1000;
		short s1 = 1; // recommended is byte as it takes less memory

		// 3.integer
		// size:4 bytes = 4*8=32 bits
		// range:-2147483648 to 2147483647
		int i = 1;// unneccessary use of the memory

		// 4.long:
		// range:
		// size: 8 bytes=64 bits
		long l = 2222222222222222l; // we have to explicitly tell Java that it is long number
		System.out.println(l);
		// credit card number or AADHAR card number we can store in String
		// as we dont use for calculations

		// 4.float:
		// size:4 bytes
		// range:after point it can take upto 7 digits
		float f = 12.33f;// by default java takes this as double
		float f1 = (float) 34.33;

		// 5.double
		// size:8 bytes=64 bits
		// range: after point,it can take upto 15 digits
		double d = 12.3333;

		// 6.char:Single digit value
		// size:2 bytes =16 bits
		// Unicode format
		// Should be written in single quotes
		char c = 'a';
		char c1 = '1';
		char c2 = '$';
		char c3 = '?';

		// boolean
		// size: 1 bit(aproxx)
		boolean fl = true;
		boolean flg = false;

	}

}
