public class Ex05 {
    public static void main(String[] args) {
        
    
     String[] friends = {"一郎","次朗","三郎","四郎","五郎","六郎","七郎"};

    for(int i = 0; i < 7; i++){
        System.out.println(friends[i] + "さん");
    }
    for(String friend : friends){
        System.out.println(friend + "さん");
    }
    }
}
