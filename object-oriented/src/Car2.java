
public class Car2 {
    int speed;
    String name;

    Car2(int speed,String name){ //コンストラクタ
        this.speed = speed;
        this.name = name;
    }
     void stepOnAccele(){
        speed = speed + 10;
        System.out.println("スピードが" + speed + "km/hに増えました");
     }
     void stepOnBrake(){
        speed = speed - 10;
        System.out.println("スピードが" + speed + "km/hに減りました");
     }
   
}
