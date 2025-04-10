package sample.ensyuu;

public class Car2 {
    static final  int MAX_SPEED = 180;// 定数で固定
    int speed;

    void stepOnAccele(){//static ついてないメソッドではspeedもMAX_SPEADも使える
        speed = speed + 10;

        if(speed > MAX_SPEED){ //MAX_SPEADにならないように設定
            speed = MAX_SPEED;
        }
    }
    static void showMaxSped(){ //staticメソッドにはstatic変数しか使えない
        System.out.println("全車種共通の最高速度は" + MAX_SPEED + "です");
        //System.out.println("現在の速度は" + speed + "です");  staticメソッドだからspeedは使えない
        // StepOnAccele(); もできない　逆はできる
    }

}
