package vrietyArray;

import java.util.ArrayList;

public class task2 {

	public static void main(String[] args) {

	   Integer[] n = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60};

	   ArrayList odd = new ArrayList();
	   ArrayList even = new ArrayList();

	   for(int num : n){
		   if(num % 2 == 0){
			   even.add(num);
		   }else{
		    	odd.add(num);
		    }
	   }
	   System.out.println("奇数:" + odd);
	   System.out.println("偶数:" + even);
   }
}