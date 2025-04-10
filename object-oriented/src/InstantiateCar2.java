public class InstantiateCar2 {
    public static void main(String[] args) {
        Car2 car = new Car2(0,"エスティマ");
        car.stepOnAccele(); //アクセスを1回踏む　（carクラスで作成したメソッド呼び出し）
         car.stepOnAccele(); //アクセス2回目踏む
         car.stepOnBrake(); //ブレーキ1回
         System.out.println("現在の速度は"+car.speed + "km/hです");
    }

}
