package Soal6;

import java.util.Scanner;
import java.math.BigInteger;
public class Soalbiginteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		/*Menerima inputan dengan tipe BigInteger*/
		BigInteger value1 = input.nextBigInteger();
		BigInteger value2 = input.nextBigInteger();
		
		System.out.println(" ");
		
		BigInteger added = value1.add(value2); //=> melakukan operasi penjumlahan pada BigInteger
		BigInteger multiple = value1.multiply(value2); //=> melakukan operasi perkalian pada BigInteger
		System.out.println(added);
		System.out.println(multiple);
		
		
	}

}
