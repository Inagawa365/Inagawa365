package standardClass;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {

        System.out.print("探したい文字："); //入力指示
		String st = "ABCDGOPQRSYZ";
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(str); //入力された文字を出力

		int index = st.indexOf(str);
		if(index != -1){
			System.out.println(st + "は" + str + "を含む");
	    }else{
	    	System.out.println(st + "は" + str + "を含まない");
	     }
	}
}
