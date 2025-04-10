package sample.ennsyuu7;

public class Ex07 {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.buyItem();
        vendingMachine.refillStok(3);
        vendingMachine.buyItem();
        vendingMachine.putMoney(500);
        vendingMachine.buyItem();
        vendingMachine.buyItem();
        vendingMachine.buyItem();
        vendingMachine.refillStok(3);
        vendingMachine.buyItem();
        vendingMachine.buyItem();
        vendingMachine.buyItem();
    }

}
