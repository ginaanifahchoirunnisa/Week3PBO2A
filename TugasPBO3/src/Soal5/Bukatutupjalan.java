package Soal5;

import java.util.*;
import java.io.*;
import java.lang.StringBuilder;
import java.math.BigInteger;

public class Bukatutupjalan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		
		

			String plat = input.nextLine();
			String[] platm = plat.split(" ");
//			int plat1 = Integer.parseInt(platm[0]);
//			int plat2 = Integer.parseInt(platm[1]);
//			int plat3 = Integer.parseInt(platm[2]);
//			int plat4 = Integer.parseInt(platm[3]);
			
			String plat1 = platm[0];
			String plat2 = platm[1];
			String plat3 = platm[2];
			String plat4 = platm[3];
	
		
		//StringBuilder a = new StringBuilder (20);
		String s = plat1+plat2+plat3+plat4;
		
		
		//System.out.println(s);
		
		Long result = Long.parseLong(s);
		//System.out.println(result);
		
		//result = result - 999999;
		
		
		if((result%5)==0)
		{
			System.out.println("Berhenti");
		}else {
			System.out.println("Jalan");
		}
		//System.out.println(result);
		
		
		
		
	}

}
