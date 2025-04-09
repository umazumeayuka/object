package practice;
public class practice23 {
    public static void main(String[] args) {
        double result = average(79,80,100);
        System.out.println("平均値：" + result);
    }
    static double average(double num1,double num2,double num3){
        double answer = (num1 + num2 + num3)/3;
        return answer;
    }
}
