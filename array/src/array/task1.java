package array;

public class task1 {

    public static void main(String[] args) {

        int[] ranum = {4, 9, 19, 5, 8, 21, 42, 64, 73, 18, 2};

        System.out.print("配列:[");

        //配列を一つずつ表示していく
        for(int i = 0; i < ranum.length; i++){
            System.out.print(ranum[i]);
            if(i < ranum.length - 1){
                System.out.print("," ); //","を最後の整数の後ろには表示しない
            }
        }
        System.out.println("]");

        //拡張for文で配列の整数を加算
        int sum = 0;

        for(int data: ranum){
            sum += data;
        }
        System.out.print("合計:" + sum);
    }
}

