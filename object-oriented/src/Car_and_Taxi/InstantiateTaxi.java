package Car_and_Taxi;

public class InstantiateTaxi {
    public static void main(String[] args) {
        
        Taxi taxi = new Taxi();

        taxi.speed = 0;
        taxi.name ="タクシー仕様のプリウス";

        taxi.stepOnAccele();
        taxi.stepOnAccele();
        taxi.stepOnBrake();

        System.out.println("現在の速度は"+ taxi.speed + "km/hです");
    }

}
