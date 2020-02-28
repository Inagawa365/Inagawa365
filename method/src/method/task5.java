package method;

public class task5 {

	public static void main(String[] args) {

		String[] array1 = {"one", "two", "three"};
		System.out.println("－－－配列にnullがない場合－－－");
		boolean flag = task5(array1);
        System.out.println(flag);

		String[] array2 = {null, "four", "five"};
		System.out.println("－－－配列にnullがある場合－－－");
		boolean flag2 = task5(array2);
		System.out.println(flag2);

	}

	public static boolean task5(String[] array){

		for(int i = 0; i < array.length; i++){
			if(array[i] == null){
				return true;
			}
		}
		return false;
	}
}