public class ScopeSample {
    public static void main(String[] args) {
        int num1 = 1;
        {
            int num2 = 2;
            System.out.println(num2);
            System.out.println(num1);
        }
        //System.out.println(num2); {}内でnum2を宣言しているから{}外では有効にならない
        System.out.println(num1);
    }
}
