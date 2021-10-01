package Soal4;

import java.util.Scanner;

public class Gajiagent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		/*
		 * Gaji pokok , merupakan gaji pegawai perbulan
		 * potongan , merupakan potongan pegawai yang didapat apabila kurang dari target
		 * tambahan_gaji, tambahan gaji yang diterima apabila mendapat item dengan jumlah tertentu
		 * itemminus, menampung kurangnya item yang didapat menuju item minimal yang harus didapat
		 * gaji_total , gaji yang telah dihitung beserta potongan atau tamabahan yang diperoleh*/
		
		long gaji_pokok = 500000;
		long harga_peritem = 50000;
		long potongan,tambahan,gaji_total;
		int perolehan_item,itemminus;
		
		perolehan_item = input.nextInt();
		
		if(perolehan_item >= 40) {
			tambahan = harga_peritem*25/100;
			tambahan *= perolehan_item;
			gaji_total = gaji_pokok + tambahan;
		}else if(perolehan_item > 80) {
			tambahan = harga_peritem*35/100;
			tambahan *= perolehan_item;
			gaji_total = gaji_pokok + tambahan;
		}else if(perolehan_item < 15){
			itemminus = 15 - perolehan_item;
			potongan = harga_peritem*15/100;
			potongan *= itemminus;
			gaji_total = gaji_pokok - potongan;
		}else{
			tambahan = harga_peritem*10/100;
			tambahan *= perolehan_item;
			gaji_total = gaji_pokok + tambahan;
			
		}
		
		System.out.println(gaji_total);
		
		
		
		
		
		
	}

}
