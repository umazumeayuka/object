package Car_and_Taxi;
public class InstanttiateCar {
    public static void main(String[] args) {
        
        Car car = new Car();

        car.speed = 0;
        car.name = "エスティマ";

        car.stepOnAccele();
        car.stepOnAccele();
        car.stepOnBrake();

        System.out.println("現在のスピードは" + car.speed + "km/hです");
    }

}
