public class Car {
    int speed; //属性の設定
    String name; //属性の設定
    int gasoline; //属性の設定

 void stepOnAccele(){ //アクセルを踏む動作のメソッドを作成（設計図）
    speed = speed + 10;
    gasoline = gasoline - 10;
 }
 void stepOnBrake(){ //ブレーキを踏む動作のメソッドを作成（設計図）
    speed = speed - 10;

 }
 void refuel(int newGasoline){ //給油する動作のメソッドを作成（設計図）
    gasoline = gasoline + newGasoline;

 }
   //演習３の追加 
    Car(){}

    Car(int speed,String name,int gasoline){
        this.speed = speed;
        this. name = name;
        this.gasoline = gasoline;
    }

    void display(){
        System.out.println(name + "の速度は" + speed +"km/hでガソリン残量は" + gasoline + "です");
    }
}
