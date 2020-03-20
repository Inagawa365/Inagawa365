package array;

import java.util.Random;

public class task3 {

    public static void main(String[] args) {

        Random ransuu = new Random(); //乱数の設定
        int[] n = new int[6]; //要素数
        int Max = 0; //ありえない最大数で初期化
        int Min = 0; //ありえない最小値で初期化

        System.out.print("[");

        for(int i = 0; i < n.length; i++){
            n[i] = ransuu.nextInt(9) + 1; // "0～9"を「 +1 」して"1～10"にする
            System.out.print(n[i]);
            if(i < n.length - 1){
                System.out.print(",");
            }

            if(Max < n[i]){
                Max = n[i];
            }

            if(Min > n[i]){
                Min = n[i];
            }

        }
        System.out.print("]");
        System.out.println(""); //改行を出力

        //乱数で出た値の最大値, 最小値を出力
        System.out.println("最大値:" + Max);
        System.out.println("最小値:" + Min);
    }
}
