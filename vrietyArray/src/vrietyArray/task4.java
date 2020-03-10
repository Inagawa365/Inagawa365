package vrietyArray;

import java.util.ArrayList;
import java.util.HashMap;

public class task4 {

    public static void main(String[] args) {

        Integer[] n = {21, 3, 32, 6, 99, 72, 78, 51, 1, 26, 87, 11, 48, 60,
                                                    29, 5, 46, 74, 14, 193, 215, 83};

           //ArrayListの宣言
           ArrayList<Integer> odd = new ArrayList();
           ArrayList<Integer> even = new ArrayList();

           for(int num : n){
               if(num % 2 == 0){
                   even.add(num);
               }else{
                   odd.add(num);
               }
          }

           //HashMapの宣言
           HashMap<String, ArrayList<Integer>> lavel = new HashMap<>();
           lavel.put("奇数: ", odd);
           lavel.put("偶数: ", even);
           System.out.println(lavel.entrySet());
    }
}
