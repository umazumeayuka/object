package Car_and_Taxi;

import Car_and_Taxi.Car;

public class Ex02 {
    public static void main(String[] args) {
         Car estima = new Car(); //オブジェクトの生成　エスティマとして生成

         estima.speed = 50; //スピードに50代入
         estima.name = "エスティマ"; //名前に代入

         estima.stepOnAccele(); //アクセスを1回踏む　（carクラスで作成したメソッド呼び出し）
         estima.stepOnAccele(); //アクセス2回目踏む
         estima.stepOnBrake(); //ブレーキ1回踏む

         System.out.println(estima.name+"の現在の速度は"+estima.speed+"km/hです"); 

         Car prius = new Car();

         prius.speed = 30;
         prius.name = "プリウス";

         prius.stepOnAccele();
         prius.stepOnAccele();
         prius.stepOnAccele();
         prius.stepOnAccele();
         prius.stepOnAccele(); //アクセルを5回分↑　（メソッドの呼び出し）
         prius.stepOnBrake();
         prius.stepOnBrake();
         prius.stepOnBrake(); //ブレーキ3回分↑

         System.out.println(prius.name+"の現在の速度は"+prius.speed+"km/hです");

    }

}
