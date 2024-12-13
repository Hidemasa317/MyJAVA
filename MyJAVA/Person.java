class Student {   //クラス　Person
    String name; // 名前
    int age;     // 年齢
}

public class Person {   //Mainクラス
    public static void main(String[] args) {  //main　メソッド
        
        //⬇️コンストラクタ Personクラスのオブジェクトを作成　
        Student p = new Student();

        // フィールドに値を代入
        p.name = "Taro";    
        // Personクラスの要素を生成したオブジェクトによって使用（ここでは代入）
        p.age = 25;

        // フィールドの値を利用
        System.out.println("名前: " + p.name);
        System.out.println("年齢: " + p.age);
    }
}