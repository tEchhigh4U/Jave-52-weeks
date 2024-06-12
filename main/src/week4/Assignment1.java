package main.src.week4;

// Ex1
// 1 3 5 7 9

// Ex2
// 33 31 29 27 25
public class Assignment1 {
    public static void main(String[] args) {
        // Ex1
        // 1 3 5 7 9
        int[] x = new int[5];
        System.out.println("Example 1");

        for (int i = 0; i < x.length; i++) {
            x[i] = 2*i + 1;
        }

        for (int i : x) {
            System.out.println(i);
        }

        System.out.println("=========");
        System.out.println("Example 2");

        // Ex2
        // 33 31 29 27 25
        int[] y = new int[5];

        for (int i = 0; i < y.length; i++) {
            int initial = 33;
            y[i] = initial - 2*i;
        }

        for (int i : y) {
            System.out.println(i);
        }
    }
}
