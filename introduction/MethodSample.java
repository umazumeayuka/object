public class MethodSample {

    public static void main(String[] args) {
        System.out.println("メソッド呼び出し前");
        printHello();
        System.out.println("メソッド呼び出し後");
    }
     static void printHello() {
        System.out.println("こんにちは");
    }
}