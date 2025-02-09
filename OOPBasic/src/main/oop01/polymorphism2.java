class Sum {
    public int addition(int a, int b) {
        return a + b;
    }

    public int addition(int a, int b, int c) {
        return a + b + c;
    }
}

public class main {
    public static void main(String[] args) {
        Sum sum = new Sum();
        System.out.print(sum.addition(14, 35));
        System.out.print("\n");
        System.out.print(sum.addition(31, 34, 43));
    }
}