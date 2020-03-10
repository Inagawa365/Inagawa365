package array;

public class task2 {

    public static void main(String[] args) {

        int[] array = new int[7]; //要素数

        //7から降順
        for(int i = array.length; i >= 1; i--){
            System.out.print(i);
            if(i < array.length + 1){
                System.out.print(",");
            }
        }
        System.out.println(""); //改行を出力

        //1から昇順
        for(int j = 1; j < array.length + 1; j++) {
            System.out.print(j);
            if(j < array.length){
                System.out.print(",");
            }
        }
    }
}
