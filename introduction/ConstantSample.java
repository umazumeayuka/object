public class ConstantSample {
    public static void main(String[] args) {
        final double PAI = 3.14;
        //PAI = 3; 　finalで定数にしているため、再代入はできない
        // 円の面積を求める
        int radius =10;
        System.out.println(radius*radius*PAI);
    }
}
