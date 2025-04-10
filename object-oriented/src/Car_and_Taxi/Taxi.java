package Car_and_Taxi;
public class Taxi extends Car{ //extend Car でCarクラスを継承する
    int price;

    void payment(){//料金を払う動作を追加
        System.out.println("料金を"+ price +"円払いました");
        price = 0;
    }

}
