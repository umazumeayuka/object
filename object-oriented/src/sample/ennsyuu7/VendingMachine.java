package sample.ennsyuu7;

public class VendingMachine {
    static final int PRICE = 120;
    int money;
    int stock;

    void refillStok(int stock){
        this.stock = stock;
        if(stock >= 10 ){
            System.out.println("商品がいっぱいです");
        }
        System.out.println("在庫が" + stock + "になりました");
    }

    void putMoney(int money){
        this.money =money;
        System.out.println("入金金額が" + money + "になりました");
    }
    
    void buyItem(){
        if(stock <= 0){
            System.out.println("在庫を追加してください");
        }else if(money <= 0){
            System.out.println("お金を入れてください");
        }else if(money < PRICE){
            System.out.println("お金が足りません" + "（現在の残高"+money+"円)");
        }else{
            System.out.println("商品を購入しました");
            stock = stock -1;
            money = money - 120;

        if(stock == 0){
            System.out.println("在庫切れになりました");
        }
    }

    }
}
        
    

        
          
