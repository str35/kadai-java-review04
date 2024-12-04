
public class Employee {

    public String employeeName; //社員名
    public String divisionName; //部署名
    public int vitality; //体力

    //引数なしコンストラクタ
    public Employee() {
        this("未設定です");
        System.out.println("引数なしコンストラクタを終了しました");
    }

    public Employee(String employeeName) {
        this(employeeName,"営業部");
        System.out.println("String型引数1つがあるコンストラクタを終了しました");
    }

    public Employee(String employeeName, String divisionName) {
        this(employeeName,divisionName,150);
        System.out.println("String型引数2つがあるコンストラクタを終了しました");
    }

    public Employee(String employeeName, String divisionName, int vitality) {
        System.out.println("インスタンス化時に引数ありコンストラクタが呼ばれました");
        this.employeeName = employeeName;
        this.divisionName = divisionName;
        this.vitality = vitality;
    }

    public void introduce() {
        vitality=vitality - 10;
        System.out.println("私の名前は" + employeeName + "です。");
        System.out.println("所属部署は" + divisionName + "です。");
    }

    /*
    public void greeting() {
        vitality=vitality - 10;
        System.out.println("おはようございます");
    }

    public void report() {
        vitality=vitality - 10;
        System.out.println("今日10件アポイント取りました");
    }

    public void showVitality() {
        vitality=vitality - 10;
        System.out.println("残り体力は"+vitality);
    }

    public void getWork() {

    }

    public void liaveWork() {

    }
    */
}
