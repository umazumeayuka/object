public class ArraySample {
    public static void main(String[] args) {
        String[] prefectures = new String[4];

        prefectures[0] = "東京";
        prefectures[1] = "埼玉";
        prefectures[2] = "千葉";
        prefectures[3] = "神奈川";

        //String[] prefectures ={"東京","埼玉","千葉","神奈川"};

        for(int i = 0; i <= 3; i++){
        System.out.println(prefectures[i]);
        }

        for(int i = 0; i <prefectures.length; i++){
            System.out.println(prefectures[i]);
        }
        for(String prefecture : prefectures){
            System.out.println(prefecture);
        }
    }
}
