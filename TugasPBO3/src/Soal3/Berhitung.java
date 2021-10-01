package Soal3;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Berhitung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

//		
		 String text = input.nextLine();
	        
	        String[] kata = text.split(" ");
	        
	        //assigment ke masing masing, dari hasil string yang dimasukkan
	        //dari string dikonversi ke integer untuk angka
	        int a = Integer.parseInt(kata[0]);
	        String operator = kata[1];
	        int b = Integer.parseInt(kata[2]);
	        int hasil = 0;
	        
	        
	        
	        //Pengkondisian
	        //Membandingkan string 
	        if(operator.equals("+")) {
	        	hasil = a+b;
	        }else if(operator.equals("-")) {
	        	hasil = a-b;
	        }else if(operator.equals("*")) {
	        	hasil = a*b;
	        }else if(operator.equals("/")) {
	        	hasil = a/b;
	        }else if(operator.equals("%")) {
	        	hasil = a%b;
	        }else {
	        	System.out.println("Operasi yang anda masukkan mungkin salah");
	        }
	        /*
	         * Note :
	         * Tidak menggunakan tanda == untuk membandingkan suatu string sama atau tidak\
	         * tetapi menggunakan equals. karena kalau membandingkan dengan ==,
	         * ,maka akan membandingkan alamat atau address dari kedua yang dibandingkan */
	        

	       //mencetak hasil
	       System.out.println(hasil);
		
	}

}
