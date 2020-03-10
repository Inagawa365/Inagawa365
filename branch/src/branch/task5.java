package branch;

import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {

        //三つの整数をそれぞれ入力する
        Scanner sc = new Scanner(System.in);
        System.out.print("numA: ");
        int numA = sc.nextInt();
        System.out.print("numB: ");
        int numB = sc.nextInt();
        System.out.print("numC: ");
        int numC = sc.nextInt();

        //条件 最大値を求める
        int max = numA;
        if(max < numB)max = numB;
        if(max < numC)max = numC;

        //最大値の出力
        System.out.print("最大値は:"+ max);
    }
}
