package kita.soft.practice;

public class Excersise4_4 {
    public static void main(String[] args) {
        int x = 1;//ループの外で初期化しないと中ですると毎回xは1にしかならない
        for(int i =1; i <= 7; i++ ){
            x = x*i;  
        }System.out.println(x);//ループの外で書くことで階乗が繰り返される
    }

}
