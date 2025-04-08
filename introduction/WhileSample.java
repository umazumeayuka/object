public class WhileSample {
    public static void main(String[] args) {
        int i = 1;

        while(i <= 3){
            System.out.println(i + "回目の処理");
            i = i +1; //この処理がないと無限ループ
        }
    }
}
