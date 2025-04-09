public class MethodSample3 {
    public static void main(String[] args) {
        int result1 = additional(1, 2);
        System.out.println(result1);//printlnの中にdditional(1, 2)これを入れ込む形でも出力可能
        System.out.println("====================");
        
        int result2 = additional(3, 5);
        System.out.println(result2);
  
        
    }

    static int additional(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }
}
