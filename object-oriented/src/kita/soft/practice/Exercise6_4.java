package kita.soft.practice;

public class Exercise6_4 {
    public static void main(String[] args) {
        DrawTriangle(3);
        System.out.println();//改行
        DrawTriangle(4);
        System.out.println();
        DrawTriangle(5);
        System.out.println();
    }

    static void DrawTriangle(int size){
        for(int i = 1; i <= size; i++){
            for(int j = 1; j<=i; j++){ //jが1の時以下の出力が実施→jが+1されたらj<=iを満たさない→改行の出力が実施→iが+1される→jも満たされる
                System.out.print("$");
            }System.out.println();
        }

    }

}
