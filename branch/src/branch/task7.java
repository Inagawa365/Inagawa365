package branch;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String week = sc.nextLine();

		String con;

		switch(week){
		 case "日曜" : con = "日曜は休診です";
		  break;
		 case "月曜" : con = "午前診療と午後診療があります";
		 case "火曜" : con = "午前診療と午後診療があります";
		 case "水曜" : con = "午前診療と午後診療があります";
		 case "木曜" : con = "午前診療と午後診療があります";
		 case "金曜" : con = "午前診療と午後診療があります";
		  break;
		 case "土曜" : con = "土曜は午前診療のみです";
		  break;
		 default : con = "入力を確認してください";
		}
        System.out.println("病院へ行く曜日を入力してきください");
        System.out.println("【日曜, 月曜, 火曜, 水曜, 木曜, 金曜, 土曜】");
        System.out.println(week);
        System.out.println(con);
	}

}