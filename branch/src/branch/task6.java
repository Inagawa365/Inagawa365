package branch;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numA = sc.nextInt();
		String ro;

		//numA = case(numA)
		switch(numA){
	    	case 1: ro = "Ⅰ";
				break;
	    	case 2: ro = "Ⅱ";
            	break;
	    	case 3: ro = "Ⅲ";
            	break;
	    	case 4: ro = "Ⅳ";
            	break;
	    	case 5: ro = "Ⅴ";
            	break;
			default: ro = "unkown";
            	break;
        }

		System.out.println("1から5までの数字を入力してください");
		System.out.println(numA);
		System.out.println(numA + " -> "+ ro );
   }
}
