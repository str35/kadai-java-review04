
public class Triangle {

    public static void main(String[] args) {
        int a=4,b=5,c=4;
        if(a==b && b==c) {
            System.out.println("正三角形");
        }else if(a==b || b==c || a==c) {
            System.out.println("二等辺三角形");
        }else {
            System.out.println("不等辺三角形");
        }
    }

}
