package Java_Cantonese_52.src.week3;

public class ForLoop {
    public static void main(String[] args) {
        for(int i = 1 ; i <= 16 ; i += i) {
            System.out.println(i);
        }

        System.out.println();

        for(int x = 32 ; x >= 2 ; x /= 2) {
            System.out.println(x);
        }
    }
}