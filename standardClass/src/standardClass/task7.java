package standardClass;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class task7 {

	public static void main(String[] args) {

		Calendar a1 = Calendar.getInstance();

		//SimpleDateFormatクラス
		SimpleDateFormat ymd = new SimpleDateFormat(" yyyy年MM月dd日");
		System.out.println("現在日時:" + ymd.format(a1.getTime())); //現在日時を出力

		//1週間後の日時
		a1.add(Calendar.DAY_OF_MONTH, 7);
		System.out.print(" 1週間後:");
		System.out.print(" " + a1.get(Calendar.YEAR) + "年");
		System.out.print("0" + (a1.get(Calendar.MONTH) + 1 + "月"));
		System.out.println("0" + (a1.get(Calendar.DAY_OF_MONTH) + "日"));

		//1年後の日時
		String[] Week_name = {"日","月","火","水","木","金","土"};
		a1.set(2021, 02, 27);
		int week = a1.get(Calendar.DAY_OF_WEEK);
		System.out.print(" 1年後　:");
		System.out.print(" " + a1.get(Calendar.YEAR) + "年");
		System.out.print("0" + a1.get(Calendar.MONTH) + "月");
		System.out.print(a1.get(Calendar.DAY_OF_MONTH) + "日");
		System.out.println("(" + (Week_name[week-1] + ")"));
	}
}
