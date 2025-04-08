public class IfSample3 {
    public static void main(String[] args) {
        int age = 20;
        if (age >= 18) {
            System.out.print("車の免許が取れます");
        } else if (age >= 16) {
            System.out.println("原付の免許が取れます");
        } else {
            System.out.println("免許が取れません");
        }
    }
}
