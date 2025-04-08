public class BreakSample {
    public static void main(String[] args) {
        int loopBrealkCount = 3;
        for(int i = 1; i <= 5; i++){
            System.out.println(i + "回目");
            if(i == loopBrealkCount){
                System.out.println("スキップします");
                continue; //ContinueSampleの演習
            }
            System.out.println("for分が最後まで実行されました");
        }
    }
}
