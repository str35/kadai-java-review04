
public class Review01 {

    public static void main(String[] args) {
        int price=1500;
        int tax_rate=tax(price);
        int sum=price+tax_rate;
        System.out.println(price+"円の商品の税込み価格は"+sum+"円（消費税は"+tax_rate+"円）です。");
    }

    public static int tax(int num1) {
        int tax_rate=10;
        int result=num1*tax_rate/100;
        return result;
    }

}
