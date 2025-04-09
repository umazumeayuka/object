package practice;
public class practice8 {
    public static void main(String[] args) {
        int sum =500*4+350*8;
        System.out.println("小計金額");
        System.out.println(sum+"円");
        int tax =(int)(sum*0.1); //名詞的にキャスト
        System.out.println("消費税");
        System.out.println(tax+"円");
        System.out.println("合計額");
        System.out.println(sum+tax+"円");
    }
}
