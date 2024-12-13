class Student{
    String name;//フィールド名がname,

    public double calculateAvg(double[] data){ //calculateAvgメソッド
        //🔼引数にdouble型の[]（配列）を渡す。

        double sum = 0;

        for (int i = 0; i < data.length; i++){
            sum += data[i]; //複合代入演算子
            }
        double avg = sum/data.length;
        return avg;
    }


    public String judge(double avg){  //judgeメソッド
        String result;

        if ( avg >= 60 ) {
            result = "passed";
        } else {
            result = "failed";
        } 
        return result;

        // if ( avg >= 60 ) {
        //     result2 = "passed";
        // } else {
        //     result2 = "failed";
        // } 
        // return result2;
    }
}


public class Lesson14_01{   //mainなので、当然アクセス修飾子をpublicにしている。
    public static void main(String[] args) {
        
        Student a001 = new Student();
        a001.name = "sato";
        double[] data = { 70, 65 , 50 , 90 , 30 }; 
        //🔼double型の配列を定義、配列名がdata

        double avg = a001.calculateAvg(data);
        String result = a001.judge(avg);

        System.out.println(avg);
        System.out.println(a001.name + " " + result);



        // Student a002 = new Student();
        // a002.name = "takahashi";
        // double[] data2 = { 10, 20, 30, 40, 50};

        // double avg2 = a002.calculateAvg(data2);
        // String result2 = a002.judge(avg2);

        // System.out.println(avg2);
        // System.out.println(a002.name + " " + result);

    }
}
