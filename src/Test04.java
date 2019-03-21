public class Test04 {
    public static void main(String[] args) {
        int[] score = {59,54,68,79,70};
        System.out.println(score.length);
        for (int i = 0; i <score.length ; i++) {
            System.out.println(score[i]);

        }
        System.out.println(score);
        for (int x:score
             ) {
            System.out.println(x);
        }

    }
    public static  void print(int[] x){

    }
    public static  void print1(int... x){

    }
}
