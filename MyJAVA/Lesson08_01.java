public class Lesson08_01 {

    public static void main(String[] args) {
        // String[] array;
        // array = new String[3];

        // array[0] = "sato";
        // array[1] = "suzuki";
        // array[2] = "takahashi";

        // System.out.println(array[0]);
        // System.out.println(array[1]);
        // System.out.println(array[2]);

        // String[] array = {"sato","suzuki","takahashi"};

        // array[1] = "tanaka";

        // System.out.println(array[0]);
        // System.out.println(array[1]);
        // System.out.println(array[2]);

        // String [][] array;
        // array = new String[2][2];

        // array[0][0] = "sato";
        // array[0][1] = "suzuki";
        // array[1][0] = "takahashi";
        // array[1][1] = "tanaka";

        // String[][] array = {{"sato","suzuki"},{"takahashi","tanaka"}};

        // System.out.println(array[0][0]);
        // System.out.println(array[0][1]);
        // System.out.println(array[1][0]);
        // System.out.println(array[1][1]);

        // for (int i = 0; i<=2; i++){
        //     for (int j =0; j <=2; j++){
        //         System.out.println(i + "-" + j);
        //     }
        // }

        int array [] = {2,4,6,8,10};
        int sum = 0;

        for (int i = 0; i <= 4; i++){
            sum += array[i];
        }
        System.out.println(sum);
       
    }
}