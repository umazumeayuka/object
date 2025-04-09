package practice;
public class practice24 {
    public static void main(String[] args) {
       int result = amount(0);//num(10)
       System.out.println(result); 
    }
    static int amount(int num1){
        int answer = num1;// int total = 0;
        for(int i = 1; i <= 10; i++)//for(int i = 1; i <= num1; i++)
        answer = answer + i;// total = total + i;
        return answer;

    }
}
