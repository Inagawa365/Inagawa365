package practice;

import java.io.Serializable;
import java.util.Date;

public class FortuneBean implements Serializable {
    private Date today;
    private String fortune;

    public FortuneBean() {}; //引数なしのコンストラクタ
    public FortuneBean(Date today, String fortune) {
        this.today = today;
        this.fortune = fortune;
    }

    //getterとsetter(フィールドの値の取得,引数の値の設定)
    public Date getToday() {
        return this.today;
    }

    public void setToday(Date today) {
        this.today = today;
    }

    public String getFortune() {
        return this.fortune;
    }

    public void setFortune(String fortune) {
        this.fortune = fortune;
    }
}

