
public class Clock {

    public static void main(String[] args) {
        int h=18;
        int m=32;
        int s=47;

        int result=getSeconds(h,m,s);

        System.out.println("一日の経過秒数："+result);
    }

    public static int getSeconds(int h,int m,int s) {
        int sum=(h*60*60)+(m*60)+s;
        return sum;
    }

}
