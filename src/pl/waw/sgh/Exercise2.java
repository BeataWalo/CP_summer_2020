package pl.waw.sgh;

public class Exercise2 {
    static void fibonacci(int n) {
        int x = 0;
        for(int i = 1; i <= 50 ; i += x) {
            x += i;
            System.out.println(i);
            System.out.println(x);
        }
    }

    //verification
    public static void main(String[] args) {
        fibonacci(10);
    }
}
