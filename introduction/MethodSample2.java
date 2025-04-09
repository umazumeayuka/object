public class MethodSample2 {
    public static void main(String[] args) {
        additional(1,2);//additionalのメソッド呼び出し
        additional(3,5);
    }
    static void additional(int num1,int num2){ //mainメソッドから値をもらう
        System.out.println("第1引数の値：" + num1);//もらった値を利用して出力
        System.out.println("第2引数の値：" + num2);
        System.out.println("足し算結果：" + (num1 + num2));
    }
}
