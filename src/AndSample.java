
public class AndSample {

    public static void main(String[] args) {
        int score=59;
        if(score==100) {
            System.out.println("満点です");
        }else if(score>=80 && score<=99) {
            System.out.println("よくできました");
        }else if(score>=60 && score<=79) {
            System.out.println("合格です");
        }else {
            System.out.println("赤点です");
        }
    }

}
