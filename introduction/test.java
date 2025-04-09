public class test {
    public static void main(String[] args) {
        int cnt = 10;
        System.out.println(cnt);
    }
}


//メソッド予習
public class MethodSample{
    public static void main(String[] args) {
        System.out.println("メソッド呼び出し前");
        printHello();
        System.out.println("メソッド呼び出し後");
    }

    static void printHello(){
        System.out.println("こんにちは");
    }
}

//戻り値
public static void main(String[] args) {
    additional(1,2);
    System.out.println("================");
    aditional(3,5);
}

static void aditional(int num1,int num2){
    System.out.println("第一引数の値"+num1);
    System.out.println("第二引数の値"+num2);
    System.out.println("足し算結果"+(num1+num2));
}