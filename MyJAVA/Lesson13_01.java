class Student{
    String name = "sato";

    public void calculateAvg(int math, int english) {
        System.out.println((math + english) / 2);
    }
}




public class Lesson13_01 {
    public static void main(String[] args) {
        Lesson14_01 a001 = new Lesson14_01(); 
        //🔼インスタンス化、実態化、クラスという型から実際に使える『モノ』を生成すること。
        //a001というオブジェクトを生成。
        
        // Studentクラスを使えるようにする、
        //ということは、変わり身のオブジェクトを生成して、
        //Studentクラスの変数やメソッドを使用できるようにするということ。

        a001.name = "sato";
        //🔼フィールドに値を代入  a001(Student).name

        System.out.println(a001.name);

        a001.calculateAvg(90,80);
        //🔼メソッドを使用  a001(Student).clasulateAvg();

        Lesson14_01 a002 = new Lesson14_01();

        a002.name ="suzuki";
        System.out.println(a002.name);

    }
    
}
