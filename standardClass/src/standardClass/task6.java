package standardClass;

import java.text.SimpleDateFormat;
import java.util.Date;

public class task6 {

    public static void main(String[] args) {

        Date now = new Date();

        SimpleDateFormat ymd = new SimpleDateFormat("yyyy年MM月dd日"); //年月日を表示
        SimpleDateFormat ymdt = new SimpleDateFormat("yyyy年MM月dd日HH時mm分"); //年月日時間を表示

        System.out.println(ymd.format(now));
        System.out.println(ymdt.format(now));
    }
}
