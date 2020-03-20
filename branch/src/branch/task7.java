package branch;

import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {

        //入力される曜日への注意文
        System.out.println("病院へ行く曜日を入力してください");
        System.out.println("【日曜, 月曜, 火曜, 水曜, 木曜, 金曜, 土曜】");

        Scanner sc = new Scanner(System.in);
        String week = sc.nextLine();

        //seich文
        switch(week){
            case "日曜" :
                System.out.print("日曜は休診です");
                break;
            case "月曜" :
            case "火曜" :
            case "水曜" :
            case "木曜" :
            case "金曜" :
                System.out.print("午前診療と午後診療があります");
                break;
            case "土曜" :
                System.out.print("土曜は午前診療のみです");
                break;
            default :
            System.out.print("入力を確認してください");
        }
    }

}