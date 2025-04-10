package sample;

public class Ex08 {
    public static void main(String[] args) {
        // 8-1
        //int[] num = { 0, 1, 2, 3, 4 };
        // 8-2
        //for (int i = 0; i < 5; i++) {
        //    System.out.print(i);
        //}
        // 8-3
        String[] name = new String[10];
        name[0] = "馬詰亜友花";
        name[5] = "馬詰亜友花";

        // 8-4
        for (String names : name) {
            if (names == null) {
                System.out.print("空"+" ");
            } else {
                System.out.print(names+ " ");
            }
        }
    }
}
