package branch;

import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {

        //入力受付の注意文を表示
        System.out.println("10以上の数字を入力してください");

        //値入力
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //if文
        System.out.print("値：");
        if(a >= 10) System.out.println(a); //10以上の値を入力した場合
        if(a < 10) System.out.println(a * 10); //一桁の値が入力された場合は10倍する
    }
}