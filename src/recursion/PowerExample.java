package recursion;

public class PowerExample {

    private int power(int n, int m){
        if (m == 0) return 1;
        if (n == 1) return 1;
        if (n == 0) return 1;
        return n * power(n, m - 1);
    }

    public static void main(String[] args) {
        PowerExample powerExample = new PowerExample();
        int power = powerExample.power(2, 3);
        System.out.println("power = " + power);
    }

}
