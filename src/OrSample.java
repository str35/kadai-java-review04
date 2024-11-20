
public class OrSample {

    public static void main(String[] args) {
        int scoreSansu=50;
        int scoreKokugo=80;

        if(scoreSansu>=60 && scoreKokugo>=60) {
            System.out.println("合格");
        }else if(scoreSansu<=60 || scoreKokugo <= 60) {
            System.out.println("算数か国語どちらかが補講対象です");
        }else {
            System.out.println("赤点です");
        }
    }

}
