package kita.soft.practice;

public class Excersise4_3 {
    public static void main(String[] args) {
        int x = 1;
        for(int i = 1; i <= 8; i++){
            x = x*2;//毎回xにその数の2倍を代入しているということ（1回目:1*2=2　2回目:1回目の解2を使って2*2=4 3回目は2回目の解4を使って…）

            System.out.println(x);
        }
    }

}
