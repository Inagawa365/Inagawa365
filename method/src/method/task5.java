package method; //新課題番号4

public class task5 {

    public static void main(String[] args) {

        String[] array1 = {"a", "b", "c"}; //nullなし
        System.out.println("－－－配列にnullがない場合－－－");
        boolean flag = nullCheck(array1);
        System.out.println(flag);

        String[] array2 = {"a", null, "c"}; //nullあり
        System.out.println("－－－配列にnullがある場合－－－");
        boolean flag2 = nullCheck(array2);
        System.out.println(flag2);
    }

    public static boolean nullCheck(String[] array){

        for(int i = 0; i < array.length; i++){
            if(array[i] == null){
                return true;
            }
        }
        return false;
    }
}