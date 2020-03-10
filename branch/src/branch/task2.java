package branch;

import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {

        //入力指示文の表示
        System.out.println("数字を入力してください");

        //整数の入力
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //if-else文
        if(a >= 10){
            System.out.print("値: " + a);//二桁の値が入力されたときはそのまま表示する
        } else if(a < 10)
            System.out.print("値: " + "0" + a); //一桁の値が値が入力されたときは十の位に"0"を付加して表示する
    }
}
