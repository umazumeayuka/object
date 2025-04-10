package sample.ensyuu;

public class UseStatic {
    public static void main(String[] args) {
        System.out.println(Car2.MAX_SPEED);//インスタンス化しないで呼び出せる
        Car2.showMaxSped();

        Car2 estim = new Car2();
        System.out.println((estim.MAX_SPEED));//インスタンス化してから呼び出すことも可能だが必要なし警告でる
        //Car2.prius =new Car2();
        //System.out.println(prius.max_spead);
        //estim.MAX_SPEED = 200;
    }

}
