package standardClass;

public class task3 {

	public static void main(String[] args) {

		String str = "文字列: ABCDEFG";
		    System.out.println(str);

		for(int i = str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
}
